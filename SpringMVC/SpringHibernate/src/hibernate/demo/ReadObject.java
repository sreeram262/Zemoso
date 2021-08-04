package hibernate.demo;

import entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadObject {

    public static void main(String[] args) {
        SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        //Session
        Session session=sessionFactory.getCurrentSession();
        try {
            //create a student object
            System.out.println("creating the student obj");
            Student myStudent=new Student("sasuke","ogirala","sasuke.ogirala@zemosolabs.com");
            //start the session
            session.beginTransaction();
            //save the object
            System.out.println("saving the student object");
            session.save(myStudent);
            System.out.println("saved");
            //commit
            session.getTransaction().commit();
            System.out.println("Done");

            System.out.println("student Id "+myStudent.getId());

            // need to get a new session for each request
            session=sessionFactory.getCurrentSession();
            session.beginTransaction();

            Student student=session.get(Student.class,myStudent.getId());
            System.out.println("ID "+student.getId());
            System.out.println(student);
            session.getTransaction().commit();


        }
        finally {
            sessionFactory.close();
        }
    }
}
