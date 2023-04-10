package interfaces;

import java.sql.SQLOutput;

public class Car implements Engine,Mediaplayer,Brakes {
    @Override
    public void start() {
        System.out.println("THE ENGINE IS MAKES SOUND");
    }

    @Override
    public void stop() {
        System.out.println("Problem in stop engine quickly ");
    }

    @Override
    public void acce() {
        System.out.println("it is super fast car");
    }

    @Override
    public void working() {
        System.out.println("Multiple time break fail record");
    }
}
