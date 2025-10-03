public class Lab2 {
    public static void main(String[] args) {
        
        Fridge LGfridge = new Fridge("LG", "GA-B509MLSL", 150, -23, 419);
        Fridge Boschfridge = new Fridge("Bosch", "BD-412M", 170, -18, 390);
        VacuumCleaner SamsungCleaner = new VacuumCleaner("Samsung", "SC4581", 2000, 2, 83);
        Dishwasher EigenDishwasher = new Dishwasher("Eigen", "F451W", 608, 8, 3);

        LGfridge.showInfo();
        Boschfridge.showInfo();
        LGfridge.function();
        Boschfridge.leaking();

        SamsungCleaner.showInfo();
        SamsungCleaner.function();
        SamsungCleaner.activateTurbo();

        EigenDishwasher.showInfo();
        EigenDishwasher.function();
        EigenDishwasher.childrenProtection();

    }
}
