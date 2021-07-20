package JavaAssignments;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Java4 {
    public static void main(String[] args) throws ParseException,NullPointerException,IllegalArgumentException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        LocalDate[][] inputDates = new LocalDate[n][2];
        for(int i=0;i<n;i++)
        {
            String[] dates=sc.nextLine().split(" +");
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            inputDates[i][0]=LocalDate.parse(dates[0],myFormatObj );
            inputDates[i][1]=LocalDate.parse(dates[1],myFormatObj );
            LocalDate[] newDates = new LocalDate[2];
            int diff=inputDates[i][1].getYear()-inputDates[i][0].getYear();
            if(diff<=0)
            {
                System.out.println("No range");
                continue;
            }
            newDates[0]=inputDates[i][0].plusYears(diff).minusDays(30);
            newDates[1]=inputDates[i][0].plusYears(diff).plusDays(30);

            System.out.print(newDates[0].format(myFormatObj)+" ");
            if(inputDates[i][1].compareTo(newDates[1])>0)
            {
                System.out.println(newDates[1].format(myFormatObj));
            }
            else
                System.out.println(inputDates[i][1].format(myFormatObj));
            //Date date; date.
        }

    }
}
