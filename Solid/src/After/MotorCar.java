package After;

public class MotorCar implements NormalMotorCar {

    @Override
    public void Accelerate() {
        System.out.println("Accelerating");
    }

    @Override
    public void FillPetrol() {
        System.out.println("filling the tank");

        //other methods
    }
}
