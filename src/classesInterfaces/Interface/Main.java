package classesInterfaces.Interface;

public class Main {
    public static void main(String[] args) {
        //StreamingPlatform streamingPlatform = new StreamingPlatform(); - nu se pot crea instante sau obiecte in interfata direct
        StreamingPlatform netflix = new StreamingPlatformNetflix();
        netflix.play("Thirteen reason why ");
        netflix.stop();
        System.out.println(netflix.getSubscriptionPrice());
        StreamingPlatform amazon = new StreamingPlatformAmazon();
        amazon.play("Terminator ");
        amazon.stop();
        System.out.println(amazon.getSubscriptionPrice());

        TV tv = new TV(netflix);
        tv.getPlatform().play("Lord of the rings ");
        tv.setPlatform(amazon);
        tv.getPlatform().play("Emily in Paris ");

        }
    }

