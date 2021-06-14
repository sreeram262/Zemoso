package Violation;

public class Main {

    public static void main(String[] args) {
	// Car class shows open/close and single responsibility
    // NormalCar,MotorCar,ElectricCar for luskov
    // Vehicle,TwoWheeler,FourWheeler for interface segregation
    // Driving,ManualMode,AutoPilot Dependency inversion

        ElectricCar electricCar = new ElectricCar();
        electricCar.Accelerate();
        electricCar.FillPetrol();

        Driving driving = new Driving();   // For choosing autopilot we will have to change at the driving class
        driving.turnLeft();                // heavy dependency on low level classes
        driving.turnRight();
        driving.Accelerate();

    }
}
