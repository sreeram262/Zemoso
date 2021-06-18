package JavaAssignments.Java12;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
//import Java12.Student;

public class Execution {
    static void getDeptNames()
    {
        Set<String> deptNames=Main.studentList.stream().map(x->x.engDepartment).collect(Collectors.toSet());
        for(String s: deptNames)
        {
            System.out.println(s);
        }
    }

    static void getNamesAfterYear()
    {
        Set<Student> Names=Main.studentList.stream().filter(x->(x.year_of_enrollment>2018)).collect(Collectors.toSet());
        for(var item: Names)
        {
            System.out.println(item.name);
        }
    }

    static void getMaleCSE()
    {
        Set<Student> Names=Main.studentList.stream().filter(x->(x.gender.equals("Male") && x.engDepartment.equals("Computer Science"))).collect(Collectors.toSet());
        for(var item: Names)
        {
            System.out.println(item.name);
        }
    }


    static void getStudentsByGender()
    {
        Map<String, Long> numberByGender = Main.studentList.stream().collect(Collectors.groupingBy(x->x.gender,Collectors.counting()));

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

        Map<String,Double> AvgAge=Main.studentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors
                .averagingInt(Student::getAge)));

        AvgAge.forEach((key,value)->{
            System.out.println(key+": "+value);
        });
    }


    static void getHighest()
    {
        var student=Main.studentList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Student::getPercentage))).get();
        System.out.println(student.name+": "+student.perTillDate);
    }

    static void getCountByDept()
    {
        Map<String, Long> numberByDept = Main.studentList.stream().collect(Collectors.groupingBy(x->x.engDepartment,Collectors.counting()));
        numberByDept.forEach((key,value)->{
            System.out.println(key+": "+value);
        });
    }

    static void getAvgPercentByDept()
    {
        Map<String,Double> AvgPercent= Main.studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment, Collectors
                .averagingDouble(Student::getPercentage)));
        AvgPercent.forEach((key,value)->{
            System.out.println(key+": "+value);
        });
    }

    static void getYoungestMaleElectronics()
    {
        List<Student> student= Main.studentList.stream().filter(x->(x.gender.equals("Male") && x.engDepartment.equals("Electronic"))).collect(Collectors.minBy(Comparator.comparingInt(Student::getAge))).stream().toList();
        for(var s:student)
            System.out.println(s.name+": "+s.age);
    }

    static void getStudentsByGenderAndDept() {
        Map<String, Long> numberByGender = Main.studentList.stream().filter(x->(x.engDepartment.equals("Computer Science"))).collect(Collectors.groupingBy(x -> x.gender, Collectors.counting()));

        numberByGender.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
    }
}
