package JavaAssignments.Java6;

public class Java6_2 {
    Java6_2(int n)
    {
        this("Hello");  // call to another constructor must be the first line
        System.out.println("first constructor "+n);

    }

    Java6_2(String s)
    {
        System.out.println("2nd constructor "+s);
    }
}
