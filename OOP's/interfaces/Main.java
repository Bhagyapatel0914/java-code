package interfaces;

public class Main {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.start();
        // Now create the reference variable of type Engine
        Engine car = new Car();
        car.acce();
        // It show how the engine accelerate

        // Now let see for media player
        Mediaplayer car2 = new Car();
        car2.start();
        // It givees the engine funtion print statement
        // we can resolve this thing using the classes

        // Now let's see what happens
        ProperCar car3 = new ProperCar();
        car3.start();
        car3.startmediaplayer();
    }
}
