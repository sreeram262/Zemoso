package Violation;

public class MotorCar implements NormalCar {

    @Override
    public void Accelerate() {
        System.out.println("Accelerating");
    }

    @Override
    public void FillPetrol() {
        System.out.println("filling the tank");

    }
}
