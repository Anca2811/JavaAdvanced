package composition;

public class Main {
    public static void main(String[] args) {
        TV samsung = new TV(55, 8);
        Bed bed1 = new Bed("ikea", "king size");
        Room room1 = new Room("room number: 109", bed1, samsung);

        System.out.println(room1);

        TV philips = new TV(65, 4);
        room1.setTv(philips);
        System.out.println(room1);
    }
}
