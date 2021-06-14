package Violation;

public class TwoWheeler implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Accelerating....");
    }

    @Override
    public void brake() {
        System.out.println("Braking...");

    }

    @Override
    public void rechargeFuel() {
        System.out.println("Filling in petrol");

    }

    @Override
    public void AC() {
        System.out.println("Cannot implement this functionality");

    }

    @Override
    public void playMusic() {
        System.out.println("Cannot implement this functionality");

    }
}
