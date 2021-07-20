package JavaAssignments;

import java.util.HashSet;
import java.util.Scanner;

public class Java2 {   // The total runtime of the program is O(n) where n is the length of user's string
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        boolean flag=true;
        HashSet<Character> LettersPresent=new HashSet<>();
        for(char c : s.toCharArray())
        {
            LettersPresent.add(Character.toLowerCase(c));  // traversing through the length of the string O(n)
        }

        for(char c: alphabet.toCharArray())
        {
            if(!LettersPresent.contains(c))       // checking if all 26 letters present in our string.Retrieval time of
            {                                     // HashSet averages to O(1), therefore the time complexity of this for
                flag=false;                       // is O(1)
                System.out.println("All letters not present");
                break;
            }
        }
        if(flag)
            System.out.println("All letters in alphabet are present");
    }
}
