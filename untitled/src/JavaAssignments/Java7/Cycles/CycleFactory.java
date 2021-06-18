package JavaAssignments.Java7.Cycles;

public class CycleFactory {
    public Cycle getCycle(String name)
    {
        if(name.equals("Unicycle"))
        {
            return new Unicycle();
        }
        else if(name.equals("Bicycle"))
        {
            return new Bicycle();
        }
        else if(name.equals("Tricycle"))
            return new Tricycle();
        return  null;
    }
}
