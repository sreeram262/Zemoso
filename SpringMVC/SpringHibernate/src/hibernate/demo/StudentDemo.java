package hibernate.demo;

import entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentDemo {
    public static void main(String[] args) {

        //Session Factory
        SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        //Session
        Session session=sessionFactory.getCurrentSession();
        try {
            //create a student object
            System.out.println("creating the student obj");
            Student myStudent=new Student("sreeram","ogirala","sreeram.ogirala@zemosolabs.com");
            //start the session
            session.beginTransaction();
            //save the object
            System.out.println("saving the student object");
            session.save(myStudent);
            System.out.println("saved");
            //commit
            session.getTransaction().commit();
            System.out.println("Done");


        }
        finally {
            sessionFactory.close();
        }
    }
}
