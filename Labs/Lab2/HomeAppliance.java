abstract class HomeAppliance {
    
    private String brand;
    private String model;
    private int power;

    public HomeAppliance() {
        this.brand = "?";
        this.model = "?";
        this.power = 0;
    }

    public HomeAppliance(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public abstract void showInfo();
    public abstract void function();
}
