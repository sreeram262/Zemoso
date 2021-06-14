package Violation;

public class ElectricCar implements NormalCar{
    @Override
    public void Accelerate() {
        System.out.println("Accelerating...");
    }

    @Override
    public void FillPetrol() {
        System.out.println("Does not use petrol/diesel....violates luskov substitution principle");

    }
}
