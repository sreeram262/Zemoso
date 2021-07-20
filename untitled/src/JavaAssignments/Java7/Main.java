package JavaAssignments.Java7;

import JavaAssignments.Java7.AccessControl3.Impl_Interface;
import JavaAssignments.Java7.Cycles.*;
import JavaAssignments.Java7.InnerClasses.FirstOuter;
import JavaAssignments.Java7.InnerClasses.SecondOuter;
import JavaAssignments.Java7.Rodents.Gerbill;
import JavaAssignments.Java7.Rodents.Hamsters;
import JavaAssignments.Java7.Rodents.Mouse;
import JavaAssignments.Java7.Rodents.Rodent;

public class Main {
    public static void main(String[] args) {
       // Rodents
        Rodent[] rodents=new Rodent[3];
        rodents[0]=new Gerbill();
        rodents[1]=new Mouse();
        rodents[2]=new Hamsters();
        rodents[0].aboutMe();
        rodents[1].aboutMe();
        rodents[2].aboutMe();

        // Cycles
        Cycle[] cycles=new Cycle[3];
        //upcasting
        cycles[0]=new Unicycle();
        cycles[1] =new Bicycle();
        cycles[2]=new Tricycle();
        cycles[0].balance();
        cycles[1].balance();
        cycles[2].balance();
        //downcasting
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        ((Tricycle)cycles[2]).balance();

        // Interfaces
        Impl_Interface impl = new Impl_Interface();
        impl.implA(impl);
        impl.implB(impl);
        impl.implC(impl);
        impl.allCombined();
        impl.implCombined(impl);

        //Using the Factory
        CycleFactory factory=new CycleFactory();
        Cycle cycle1=factory.getCycle("Unicycle");
        Cycle cycle2=factory.getCycle("Bicycle");
        Cycle cycle3=factory.getCycle("Tricycle");
        if(cycle1 instanceof Unicycle)
            System.out.println("uni");
        if(cycle2 instanceof Bicycle)
            System.out.println("Bi");
        if(cycle3 instanceof Tricycle)
            System.out.println("Tri");

        //Inner classes
        FirstOuter firstOuter=new FirstOuter();
        FirstOuter.Inner firstInner=firstOuter.new Inner("Hello");
        SecondOuter secondOuter=new SecondOuter();
        SecondOuter.SecondInner secondInner=secondOuter.new SecondInner("Hello Zemoso");

    }
}
