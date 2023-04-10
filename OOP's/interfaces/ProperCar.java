package interfaces;

public class ProperCar {
    private Engine engine;
    private media player = new media();
    public ProperCar(){
        engine = new Hydroengine();
    }

    public ProperCar(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void accelerate(){
        engine.acce();
    }
    public void startmediaplayer(){
        player.start();
    }
    public void stopmediaplayer(){
        player.stop();
    }
    public void chageengine(){
        this.engine = new Mechanicalengine();
    }
}
