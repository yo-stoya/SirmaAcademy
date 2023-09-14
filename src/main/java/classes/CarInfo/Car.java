package classes.CarInfo;

public class Car {
    private String brand;
    private String model;
    private int horsepower;
    private static final String UNKNOWN = "unknown";
    private static final int UNKNOWN_HP = -1;

    public Car(String brand, String model, int horsepower) {
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
    }

    public Car(String brand) {
        this(brand, UNKNOWN, UNKNOWN_HP);
    }

    public Car(String brand, String model) {
        this(brand, model, UNKNOWN_HP);
    }

    public String carInfo() {
        return String.format("The car is: %s %s – %d HP.", brand, model, horsepower);
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

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
