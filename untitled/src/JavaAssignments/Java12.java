package JavaAssignments;

import java.util.*;
import java.util.stream.Collectors;

public class Java12 {
    static List<Student> studentList=new ArrayList<>();
    public static void main(String[] args) {


        // Adding objects to the list
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science",2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

//        getDeptNames();
//        getNamesAfterYear();
//        getMaleCSE();
//        getAvgAge();
//        getStudentsByGender();
//        getHighest();
//          getCountByDept();
//          getAvgPercentByDept();
//        getYoungestMaleElectronics();
//        getStudentsByGenderAndDept();

    }

    static void getDeptNames()
    {
        Set<String> deptNames=studentList.stream().map(x->x.engDepartment).collect(Collectors.toSet());
        for(String s: deptNames)
        {
            System.out.println(s);
        }
    }

    static void getNamesAfterYear()
    {
        Set<Student> Names=studentList.stream().filter(x->(x.year_of_enrollment>2018)).collect(Collectors.toSet());
        for(var item: Names)
        {
            System.out.println(item.name);
        }
    }

    static void getMaleCSE()
    {
        Set<Student> Names=studentList.stream().filter(x->(x.gender.equals("Male") && x.engDepartment.equals("Computer Science"))).collect(Collectors.toSet());
        for(var item: Names)
        {
            System.out.println(item.name);
        }
    }


    static void getStudentsByGender()
    {
        Map<String, Long> numberByGender = studentList.stream().collect(Collectors.groupingBy(x->x.gender,Collectors.counting()));

        numberByGender.forEach((key,value)->{
            System.out.println(key+":"+value);
        });
//        for(var item: numberByGender.entrySet())
//        {
//            System.out.println(item.getKey()+": "+item.getValue());
//        }
    }
    static void getAvgAge()
    {
        //List<Student> males=studentList.stream().filter(x->(x.gender.equals("Male"))).collect(Collectors.toList());
       // List<Student> females=studentList.stream().filter(x->(x.gender.equals("Female"))).collect(Collectors.toList());

        Map<String,Double> AvgAge=studentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors
                .averagingInt(Student::getAge)));

        AvgAge.forEach((key,value)->{
            System.out.println(key+": "+value);
        });
    }


    static void getHighest()
    {
        var student=studentList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Student::getPercentage))).get();
        System.out.println(student.name+": "+student.perTillDate);
    }

    static void getCountByDept()
    {
        Map<String, Long> numberByDept = studentList.stream().collect(Collectors.groupingBy(x->x.engDepartment,Collectors.counting()));
        numberByDept.forEach((key,value)->{
            System.out.println(key+": "+value);
        });
    }

    static void getAvgPercentByDept()
    {
        Map<String,Double> AvgPercent=studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment, Collectors
                .averagingDouble(Student::getPercentage)));
        AvgPercent.forEach((key,value)->{
            System.out.println(key+": "+value);
        });
    }

    static void getYoungestMaleElectronics()
    {
        List<Student> student=studentList.stream().filter(x->(x.gender.equals("Male") && x.engDepartment.equals("Electronic"))).collect(Collectors.minBy(Comparator.comparingInt(Student::getAge))).stream().toList();
        for(var s:student)
        System.out.println(s.name+": "+s.age);
    }

    static void getStudentsByGenderAndDept() {
        Map<String, Long> numberByGender = studentList.stream().filter(x->(x.engDepartment.equals("Computer Science"))).collect(Collectors.groupingBy(x -> x.gender, Collectors.counting()));

        numberByGender.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
    }

}
class Student{
    int id,age,year_of_enrollment;
    String name,gender,engDepartment;
    double perTillDate;
    Student(int id,String name,int age,String gender,String engDepartment,int year_of_enrollment,double perTillDate)
    {
        this.id=id;
        this.age=age;
        this.year_of_enrollment=year_of_enrollment;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.perTillDate=perTillDate;
        this.name=name;
    }

    public String getGender() {
        return gender;
    }
    public double getPercentage() {
        return perTillDate;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public String getEngDepartment() {
        return engDepartment;
    }
}