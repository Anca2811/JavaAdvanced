package classesInterfaces.Interface;

public class TV {
    private StreamingPlatform platform;

    public TV(StreamingPlatform platform) {
        this.platform = platform;
    }

    public StreamingPlatform getPlatform() {
        return platform;
    }

    public void setPlatform(StreamingPlatform platform) {
        this.platform = platform;
    }
}
