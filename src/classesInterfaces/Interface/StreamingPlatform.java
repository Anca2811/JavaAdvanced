package classesInterfaces.Interface;

public interface StreamingPlatform {
    void play(String title);
    void stop();
    default double getSubscriptionPrice(){
        return 25;
    }
}
