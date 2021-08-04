package hibernate.demo;

import entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetCoursesForMary {
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

            //retrieving mary

            Student mary=session.get(Student.class,2);
            //adding mary to the new courses
            System.out.println("Courses mary enrolled into");
            System.out.println("Courses: "+mary.getCourses());

            session.getTransaction().commit();
            System.out.println("Done");


        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
