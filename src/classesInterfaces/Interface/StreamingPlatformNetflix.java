package classesInterfaces.Interface;

public class StreamingPlatformNetflix implements StreamingPlatform{
    @Override
    public void play(String title) {
        System.out.println(title + "is playing on Netflix");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Netflix!");

    }
}
