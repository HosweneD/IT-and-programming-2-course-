public class Dishwasher extends HomeAppliance {
    
    private int waterConsumption;
    private int basketsCount;
    private static int count = 0;

    public Dishwasher() {
        super();
        this.waterConsumption = 0;
        this.basketsCount = 0;
        count++;
    }

    public Dishwasher(String brand, String model, int power, int waterConsumption, int basketsCount) {
        super(brand, model, power);
        this.waterConsumption = waterConsumption;
        this.basketsCount = basketsCount;
        count++;
    }

    public int getWaterConsumption() {
        return waterConsumption;
    }
    public void setWaterConsumption(int waterConsumption) {
        this.waterConsumption = waterConsumption;
    }

    public int getBasketsCount() {
        return basketsCount;
    }
    public void setBasketsCount(int basketsCount) {
        this.basketsCount = basketsCount;
    }

    @Override
    public void showInfo() {
        System.out.println("\nПосудомойка " + getBrand() + " " + getModel() + " - мощность: " + getPower() + "Вт, " + "расход воды: " + getWaterConsumption() + "л, количество корзин: " + getBasketsCount() + "л, создано посудомоек: " + count);
    }

    @Override
    public void function() {
        System.out.println("\nПосудомойка " + getBrand() + " " + getModel() + " моет посуду.");
    }

    public void childrenProtection() {
        System.out.println("\nУ посудомойки " + getBrand() + " " + getModel() + " включена защита от детей.");
    }
}
