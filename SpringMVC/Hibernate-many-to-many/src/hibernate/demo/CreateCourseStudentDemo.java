package hibernate.demo;

import entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseStudentDemo {
    public static void main(String[] args) {

        //Session Factory
        SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").
                                           addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).
                                           addAnnotatedClass(Course.class).
                                           addAnnotatedClass(Review.class).
                                           addAnnotatedClass(Student.class).
                                           buildSessionFactory();
        //Session
        Session session=sessionFactory.getCurrentSession();
        try {

            session.beginTransaction();

            // create a course or courses
           Course course=new Course("Pacman how to score 1 million points");
           //save the course
            System.out.println("saving course");
            session.save(course);
            //create a student or students
            System.out.println("\n\nsaving students");
            Student student1=new Student("john","doe","luv2code@gmail.com");
            Student student2=new Student("Mary","Public","luv2code@gmail.com");

            course.addStudents(student1);
            course.addStudents(student2);

            session.save(student1);
            session.save(student2);

            System.out.println(course.getStudents());

            session.getTransaction().commit();
            System.out.println("Done");


        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
