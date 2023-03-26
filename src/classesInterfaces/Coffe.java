package classesInterfaces;

public class Coffe {
    private String brand;
    private int weight;

    public Coffe(String brand, int weight) {
        this.brand = brand;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "brand='" + brand + '\'' +
                ", weight=" + weight +
                '}';
    }
}
