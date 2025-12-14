import java.util.*;

// Товар
class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " +" + price + "руб.";
    }
}

class SalesManager {

    private ArrayList<Product> soldProducts;

    public SalesManager() {
        soldProducts = new ArrayList<>();
    }

    // Добавление проданного товара
    public void addSoldProduct(Product product) {
        soldProducts.add(product);
    }

    // Вывод проданных товаров
    public void printSoldProducts() {
        for (int i = 0; i < soldProducts.size(); i++) {
            System.out.println((i + 1) + ". " + soldProducts.get(i));
        }
    }

    // Общая сумма продаж
    public int calculateTotalSales() {
        int total = 0;
        for (Product product : soldProducts) {
            total += product.getPrice();
        }
        return total;
    }

    // Наиболее популярный товар
    public String findMostPopularProduct() {

        HashMap<String, Integer> productCount = new HashMap<>();

        for (Product product : soldProducts) {

            String productName = product.getName();

            if (productCount.containsKey(productName)) {
                productCount.put(productName, productCount.get(productName) + 1);
            } else {
                productCount.put(productName, 1);
            }
        }

        String mostPopular = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : productCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostPopular = entry.getKey();
            }
        }

        return mostPopular + " (" + maxCount + " продано)";
    }


    public static void main(String[] args) {

        SalesManager sales = new SalesManager();

        // Создание товаров
        Product milk = new Product("Молоко", 129);
        Product bread = new Product("Хлеб", 68);
        Product cheese = new Product("Сыр", 279);

        // Продажа товаров
        sales.addSoldProduct(milk);
        sales.addSoldProduct(bread);
        sales.addSoldProduct(cheese);
        sales.addSoldProduct(bread);

        // Вывод проданных товаров
        System.out.println("\nПроданные товары: ");
        sales.printSoldProducts();

        // Вывод суммы продаж
        System.out.println("\nОбщая сумма продаж: " + sales.calculateTotalSales());

        // Вывод самого популярного товара
        System.out.println("\nСамый популярный товар: " + sales.findMostPopularProduct());
    }
}