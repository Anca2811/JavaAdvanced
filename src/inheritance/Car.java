package inheritance;

public class Car {

    protected String color;
    private String make;
    int maxSpeed;

    public Car(String color, String make, int maxSpeed) {
        this.color = color;
        this.make = make;
        this.maxSpeed = maxSpeed;
        System.out.println("Inside car constructor");
    }

    public String getMake() {
        return make;
    }

    public void startCar() {
        System.out.println("Starting car");
    }

    public double calculateBasicPrice(){
        return 200;
    }
}








