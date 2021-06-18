package JavaAssignments;

import java.util.Scanner;

public class Java8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextByte();
        try {
            if(choice==1)
            throw new Exception1("first excep");
            if(choice==2)
            throw new Exception2("second excep");
            if(choice==3)
            throw new Exception3("third excep");
            throw new NullPointerException("throwing null exception");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Always executed");
        }
    }

}

class Exception1 extends Exception
{
    Exception1(String s)
    {
        super(s);
        System.out.println(s);
    }

}

class Exception2 extends Exception
{
    Exception2(String s)
    {
        super(s);
        System.out.println(s);
    }

}

class Exception3 extends Exception
{
    Exception3(String s)
    {
        super(s);
        System.out.println(s);
    }

}