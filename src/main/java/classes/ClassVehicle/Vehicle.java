package classes.ClassVehicle;

public class Vehicle {
    private String type;
    private String model;
    private Engine engine;
    private  int fuel;

    public Vehicle(String type, String model, Engine engine, int fuel) {
        this.type = type;
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
    }

    public void drive(int fuelLost) {
        fuel -= fuelLost;
    }

}
