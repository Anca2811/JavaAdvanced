package inheritance;

public class TurboCar extends Car {
    private String nos;


    public TurboCar(String color, String make, int maxSpeed, String nos) {
        super(color, make, maxSpeed);
        this.nos = nos;
        System.out.println("Inside turboCar constructor");
    }

    public void printParentInformation(){
        System.out.println("Car information is: " + super.color + ", " + super.maxSpeed + ", " + super.getMake());
    }

    @Override
    public void startCar() {
        System.out.println("Starting turbo car");
    }

    @Override
    public double calculateBasicPrice() {
        return super.calculateBasicPrice() + 20;
    }
}
