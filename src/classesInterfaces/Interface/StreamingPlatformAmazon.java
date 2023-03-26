package classesInterfaces.Interface;

public class StreamingPlatformAmazon implements StreamingPlatform{
    @Override
    public void play(String title) {
        System.out.println(title + "is playing on Amazon");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Amazon!");

    }

    @Override
    public double getSubscriptionPrice() {
        return 50;
    }
}
