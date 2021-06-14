package Violation;

public class Driving {
    ManualMode m;
    Driving()
    {
        m =new ManualMode();       // have to manually overwrite the object creation based on need.
                                  // violates dependency inversion
    }
    public void turnRight()
    {
     m.turnRight();
    }
    public void turnLeft()
    {
        m.turnLeft();
    }
    public void Accelerate()
    {
        m.Accelerate();
    }
}
