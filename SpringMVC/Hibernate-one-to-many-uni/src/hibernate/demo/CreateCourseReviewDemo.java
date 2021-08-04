package hibernate.demo;

import entities.Course;
import entities.Instructor;
import entities.InstructorDetail;
import entities.Review;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseReviewDemo {
    public static void main(String[] args) {

        //Session Factory
        SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").
                                           addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).
                                           addAnnotatedClass(Course.class).
                                           addAnnotatedClass(Review.class).
                                           buildSessionFactory();
        //Session
        Session session=sessionFactory.getCurrentSession();
        try {

            session.beginTransaction();

           Course course=new Course("Pacman how to score 1 million points");

           course.add(new Review("Great course"));
            course.add(new Review("Cool course"));
            course.add(new Review("Not that great"));

            session.save(course);

            session.getTransaction().commit();
            System.out.println("Done");


        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
