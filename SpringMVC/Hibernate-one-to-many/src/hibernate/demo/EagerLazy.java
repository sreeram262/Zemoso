package hibernate.demo;

import entities.Course;
import entities.Instructor;
import entities.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EagerLazy {
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

            int theId=1;

            Instructor instructor=session.get(Instructor.class,theId);

            System.out.println("Instructor :"+instructor);

            //fetch before the session is closed
            System.out.println("Courses :"+instructor.getCourses());
            // or can use Query<Instructor>....

            session.getTransaction().commit();
            System.out.println("Done");


        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
