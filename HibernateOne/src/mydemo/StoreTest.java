package mydemo;



import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.hibernate.Transaction;


public class StoreTest {
	
	
	
public static void main(String[] args) {
	
	System.out.println("Hello");
	
	
AnnotationConfiguration cfg =new  AnnotationConfiguration();

Session session = cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();

Transaction t=session.beginTransaction();

Employee1 e1= new Employee1();

e1.setName("Tanmay");


Regular_Employee e2= new  Regular_Employee();
e2.setName("Vinay pandeya");
e2.setSalary(50);
e2.setBonus(50);


Contract_Employee e3= new Contract_Employee();
e3.setPay_per_hour(20);
e3.setContact_duration("15 hours");


session.persist(e1);
session.persist(e2);
session.persist(e3);

t.commit();


session.close();

System.out.println("Successfully saved !");
}

}
