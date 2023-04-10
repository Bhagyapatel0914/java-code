package interfaces;

public class media implements Mediaplayer{
    @Override
    public void start() {
        System.out.println("To start music press button play");
    }

    @Override
    public void stop() {
        System.out.println("To stop song press pause button");
    }
}
