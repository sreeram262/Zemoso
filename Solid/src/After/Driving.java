package After;

public class Driving {
    BasicCar car;
    Driving(BasicCar car)
    {
        this.car=car;
    }
    public void turnRight()
    {
     car.turnRight();
    }
    public void turnLeft()
    {
        car.turnLeft();
    }
    public void Accelerate()
    {
        car.Accelerate();
    }
}
