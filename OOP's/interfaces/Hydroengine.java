package interfaces;

public class Hydroengine implements Engine{
    @Override
    public void start() {
        System.out.println("The engine runs on the water");
    }

    @Override
    public void stop() {
        System.out.println("To stop air brakes are used to dispatch hydro energy");
    }

    @Override
    public void acce() {
        System.out.println("It speed is less than normal petrol car");
    }
}
