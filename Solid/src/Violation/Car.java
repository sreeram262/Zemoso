package Violation;

public class Car {
    int carNo;
    String color;
    String company;
    //making changes to the original class
    int HP;
    int acc_time_for_100kmph;


    public void detils()
    {
        System.out.println("prints all the details");
    }
    public void accelerate()
    {
        System.out.println("car accelerates");
    }
    public void makeTurning()
    {
        System.out.println("turn the wheels left/right");
    }
    public void AC()
    {
        System.out.println("turn on the AC");
    }
    public void Music(){
        System.out.println("turn on the music");
    }
    public void Puncture()
    {
        System.out.println("use stepney");
    }

}
