package JavaAssignments.Java12;

public class Student {
    int id, age, year_of_enrollment;
    String name, gender, engDepartment;
    double perTillDate;

    Student(int id, String name, int age, String gender, String engDepartment, int year_of_enrollment, double perTillDate) {
        this.id = id;
        this.age = age;
        this.year_of_enrollment = year_of_enrollment;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.perTillDate = perTillDate;
        this.name = name;
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
