package composition;

public class TV {

    private int size;
    private double resolution;

    public TV(int size, double resolution) {
        this.size = size;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "TV{" +
                "size=" + size +
                ", resolution=" + resolution +
                '}';
    }
}
