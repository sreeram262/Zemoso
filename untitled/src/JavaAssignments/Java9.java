package JavaAssignments;

import java.util.Scanner;

public class Java9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String regex="[A-Z].*\\.";
        //Pattern regex=Pattern.;
        System.out.println(s.matches(regex));

    }
}
