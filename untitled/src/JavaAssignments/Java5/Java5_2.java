package JavaAssignments.Java5;

public class Java5_2 {
    String variable;

    /*
    public static Java5_2 staticInit(String s)
    {
       // variable=s;  // Here static method cannot access non-static methods or data members
       // return this; // Here static method cannot return object because they are static and common to all objects and hence can also
                      // be accessed with class name : Java5_2.staticInit()
    }
    */
    public void init(String s)
    {
        variable=s;   // non-static methods however can access static members as well as non-static
        System.out.println(variable);
    }

}
