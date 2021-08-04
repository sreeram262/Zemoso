package hibernate.demo;

import entities.Instructor;
import entities.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetBiDirection {
    public static void main(String[] args) {

        //Session Factory
        SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").
                                           addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).
                                           buildSessionFactory();
        //Session
        Session session=sessionFactory.getCurrentSession();
        try {


            session.beginTransaction();

            InstructorDetail instructorDetail=session.get(InstructorDetail.class,3);

            System.out.println(instructorDetail);

            System.out.println(instructorDetail.getInstructor());


            session.getTransaction().commit();
            System.out.println("Done");


        }
        catch (Exception e)
        {
            e.getMessage();
        }
        finally {
            sessionFactory.close();
        }
    }
}
