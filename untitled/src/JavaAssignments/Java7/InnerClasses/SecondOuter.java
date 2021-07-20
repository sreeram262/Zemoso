package JavaAssignments.Java7.InnerClasses;

public class SecondOuter {

    public class SecondInner extends FirstOuter.Inner {

        public SecondInner(String s) {
            new FirstOuter().super(s);
            System.out.println("SecondInner class inheriting inner class of first outer class");
        }
    }
}
