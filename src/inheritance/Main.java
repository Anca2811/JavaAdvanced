package inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("red", "Volvo",290);
        car.startCar();
        System.out.println(car.calculateBasicPrice());

        System.out.println("-------------------------------------");

        TurboCar turboCar = new TurboCar("black", "BMW", 300, "yes");
        turboCar.startCar();
        System.out.println(turboCar.calculateBasicPrice());
        turboCar.printParentInformation();
    }
}