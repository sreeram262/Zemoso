package hibernate.demo;

import entities.Course;
import entities.Instructor;
import entities.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateInstructorDemo {
    public static void main(String[] args) {

        //Session Factory
        SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").
                                           addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).
                                           addAnnotatedClass(Course.class).
                                           buildSessionFactory();
        //Session
        Session session=sessionFactory.getCurrentSession();
        try {
            Instructor instructor=new Instructor("itachi","uchiha","itachi.uchiha@gmail.com");

            InstructorDetail instructorDetail=new InstructorDetail("http://luv2code.com","boxing");

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
            session.close();
            sessionFactory.close();
        }
    }
}
