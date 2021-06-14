package After;

public class ElectricCar implements NormalElectricCar {
    @Override
    public void Accelerate() {
        System.out.println("Accelerating...");
    }

    @Override
    public void Recharge() {
        System.out.println("Recharging...Does not violate luskov substitution principle");

        // other methods

    }
}
