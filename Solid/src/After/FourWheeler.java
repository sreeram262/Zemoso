package After;

public class FourWheeler implements Vehicle,ExtraFeatures {
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
        System.out.println("Turning On the AC");

    }

    @Override
    public void playMusic() {
        System.out.println("Playing your liked songs");

    }
}
