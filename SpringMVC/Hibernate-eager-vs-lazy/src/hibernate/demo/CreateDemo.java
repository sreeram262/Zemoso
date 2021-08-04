package hibernate.demo;

import entities.Instructor;
import entities.InstructorDetail;
import entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {
    public static void main(String[] args) {

        //Session Factory
        SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").
                                           addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).
                                           buildSessionFactory();
        //Session
        Session session=sessionFactory.getCurrentSession();
        try {
            Instructor instructor=new Instructor("naruto","uzumaki","naruto.uzumaki@gmail.com");

            InstructorDetail instructorDetail=new InstructorDetail("http://luv2code.com","luv3code");

            // associate the objects
            instructor.setInstructorDetail(instructorDetail);

            session.beginTransaction();
            //save the object
            //it will also save the inst-detail object cuz of cascade
            System.out.println("saving objects");
            session.save(instructor);
            System.out.println("saved.");

            session.getTransaction().commit();
            System.out.println("Done");


        }
        finally {
            sessionFactory.close();
        }
    }
}
