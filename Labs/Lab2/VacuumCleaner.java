public class VacuumCleaner extends HomeAppliance {
    
    private int capacity;
    private int noise;
    private static int count = 0;

    public VacuumCleaner() {
        super();
        this.capacity = 0;
        this.noise = 0;
        count++;
    }

    public VacuumCleaner(String brand, String model, int power, int capacity, int noise) {
        super(brand, model, power);
        this.capacity = capacity;
        this.noise = noise;
        count++;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNoise() {
        return noise;
    }
    public void setNoise(int noise) {
        this.noise = noise;
    }

    @Override
    public void showInfo() {
        System.out.println("\nПылесос " + getBrand() + " " + getModel() + " - мощность: " + getPower() + "Вт, " + "вместимость: " + getCapacity() + "л, уровень шума: " + getNoise() + "дБ, создано пылесосов: " + count);
    }

    @Override
    public void function() {
        System.out.println("\nПылесос " + getBrand() + " " + getModel() + " чистит помещение.");
    }

    public void activateTurbo() {
        System.out.println("\nУ пылесоса " + getBrand() + " " + getModel() + " активирован турбо режим.");
    }
}
