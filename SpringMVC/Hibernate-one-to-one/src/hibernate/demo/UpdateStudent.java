package hibernate.demo;

import entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UpdateStudent {
    public static void main(String[] args) {

        //Session Factory
        SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        //Session
        Session session=sessionFactory.getCurrentSession();
        try {

            session.beginTransaction();

            //retrieve the object then update here and then reflect the changes to the database during commit
            Student student=session.get(Student.class,3);
            student.setLastName("uzumaki");

            session.getTransaction().commit();

            // or you can make use of the createQuery
            //new session
            session=sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.createQuery("update Student set lastName='kurosaki' where lastName='ogirala'").executeUpdate();

            // database updated
            session.getTransaction().commit();

            System.out.println("Done");


        }
        finally {
            sessionFactory.close();
        }
    }

}
