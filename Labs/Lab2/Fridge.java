public class Fridge extends HomeAppliance {
    
    private int temperature;
    private int capacity;
    private static int count = 0;

    public Fridge() {
        super();
        this.temperature = 0;
        this.capacity = 0;
        count++;
    }

    public Fridge(String brand, String model, int power, int temperature, int capacity) {
        super(brand, model, power);
        this.temperature = temperature;
        this.capacity = capacity;
        count++;
    }

    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void showInfo() {
        System.out.println("\nХолодильник " + getBrand() + " " + getModel() + " - мощность: " + getPower() + "Вт, " + "температура: " + getTemperature() + "°C, объём: " + getCapacity() + "л, создано холодильников: " + count);
    }

    @Override
    public void function() {
        System.out.println("\nХолодильник " + getBrand() + " " + getModel() + " замораживает продукты.");
    }

    public void leaking() {
        System.out.println("\nХолодильник " + getBrand() + " " + getModel() + " протёк.");
    }
}
