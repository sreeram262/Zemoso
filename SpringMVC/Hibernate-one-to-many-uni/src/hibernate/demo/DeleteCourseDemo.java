package hibernate.demo;

import entities.Course;
import entities.Instructor;
import entities.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCourseDemo {
    public static void main(String[] args) {

        //Session Factory
        SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").
                                           addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).
                                           addAnnotatedClass(Course.class).
                                           buildSessionFactory();
        //Session
        Session session=sessionFactory.getCurrentSession();
        try {

            session.beginTransaction();

            int theId=11;

            Course course=session.get(Course.class,theId);

            System.out.println("Course :"+course);

            session.delete(course);

            session.getTransaction().commit();
            System.out.println("Done");


        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
