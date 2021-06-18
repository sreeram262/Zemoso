package JavaAssignments;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {
        String Continue="yes";
        File home = new File("/home/sreero");
        Scanner sc = new Scanner(System.in);
        while(Continue.equals("yes")) {
            System.out.println("give a regex pattern");
            String pattern=sc.next();
            MyFilter filter = new MyFilter(pattern);
            File[] FileList = home.listFiles(filter);
            System.out.println(FileList.length);
            if (FileList.length == 0) {
                System.out.println("No file names match");
            } else {
                for (var file : FileList) {
                    System.out.println(file.getAbsolutePath());
                }

            }
            System.out.println("********");
            System.out.println("Do you want to continue?");
            Continue=sc.next();
        }
    }
}
class MyFilter implements FilenameFilter{
    String regex;
    public MyFilter(String s)
    {
        regex=s;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.matches(regex);
    }
}

