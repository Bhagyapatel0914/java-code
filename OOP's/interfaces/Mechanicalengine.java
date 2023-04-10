package interfaces;

public class Mechanicalengine implements Engine{
    @Override
    public void start() {
        System.out.println("The engine runs on the Petrol");
    }

    @Override
    public void stop() {
        System.out.println("To stop  brakes are mech ");
    }

    @Override
    public void acce() {
        System.out.println("average accelaration is 40 units");
    }
}
