package After;

public class TwoWheeler implements Vehicle {
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


    }

