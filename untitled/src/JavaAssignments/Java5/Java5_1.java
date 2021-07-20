package JavaAssignments.Java5;

public class Java5_1 {
    int num;
    char ch;

    public void printInstanceVariables()
    {
        System.out.println(num+" "+ch); //Instance variables need not be initialised since they are expected to be initialised
                                        // during object creation
    }

    public void printLocalVariables()
    {
        int num;
        char ch;
       // System.out.println(num+" "+ch);  // The local variables cannot be used without initialising
    }

}
