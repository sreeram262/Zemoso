package JavaAssignments.Java7.AccessControl3;

public class Impl_Interface extends ConcreteClass implements Combined {
    @Override
    public void A1() {
        System.out.println("A1");
    }

    @Override
    public void A2() {
        System.out.println("A2");
    }

    @Override
    public void B1() {
        System.out.println("B1");

    }

    @Override
    public void B2() {
        System.out.println("B2");
    }

    @Override
    public void C1() {
        System.out.println("C1");
    }

    @Override
    public void C2() {
        System.out.println("C2");
    }

    @Override
    public void allCombined() {
        System.out.println("Combined");
    }
    public void implA(A a)
    {
        System.out.println("implA");
    }

    public void implB(B b)
    {
        System.out.println("implB");
    }

    public void implC(C c)
    {
        System.out.println("implC");
    }

    public void implCombined(Combined combined)
    {
        System.out.println("implCombined");
    }
}
