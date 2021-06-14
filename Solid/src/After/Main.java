package After;

public class Main {
    // Made drivable,Features for single responsibility
    //make race car class to show open/closed principle
    // NormalMotorCar,NormalElectricCar for luskov
    // Made ExtraFeatures for interface segregation
    // Made BasicCar to be implemented by autopilot,manual for dependency inversion--The higher level class depends on the
    // lower-level through abstraction

        public static void main(String[] args) {
                ElectricCar electricCar = new ElectricCar();
                electricCar.Accelerate();
                electricCar.Recharge();

                Driving driving = new Driving(new ManualMode());
                driving.turnRight();
                driving.turnLeft();
                driving.Accelerate();
                //  Loose coupling through dependency inversion here in these 2 exapmples
                driving = new Driving(new AutoPilot());
                driving.turnRight();
                driving.turnLeft();
                driving.Accelerate();
        }


}
