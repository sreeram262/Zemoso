package JavaAssignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Java3 {
    public static void runPingCommand(String command) {

        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String s = "";
            int i=0;
            double[] PingTime = new double[10];
            // reading output stream of the ping
            while (i<10) {
                if((s = inputStream.readLine()) != null)
                System.out.println(s);
                int startIndex,endIndex;
                startIndex=s.indexOf("time");
                endIndex=s.indexOf("ms");
                //System.out.println(startIndex+" "+endIndex);
                //PingTime.m
                if(startIndex!=-1)
                {
                    PingTime[i]=Double.parseDouble(s.substring(startIndex+5,endIndex-1));
                    //System.out.println("Average ping time="+ Arrays.stream(PingTime).sum()/(i));
                }
                i++;

            }
            Arrays.sort(PingTime);
            System.out.println("Median Time="+PingTime[5]);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        if(ip==null)
            ip="google.com";
        runPingCommand("ping " + ip);


    }
}
