

package classesInterfaces;

public class Main {
    public static void main(String[] args) {
        Coffe coffe = new Coffe("Illy", 250);
        System.out.println(coffe);
        coffe.setBrand("Lavazza");

        System.out.println("New coffee brand is: " + coffe.getBrand());
    }
}