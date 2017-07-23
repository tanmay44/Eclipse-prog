package mypackage;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration; 

public class Store {

public static void main(String[] args) {
	
    //creating configuration object  
    Configuration cfg=new AnnotationConfiguration();  
    
    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
      
    //creating seession factory object  
    SessionFactory factory=cfg.buildSessionFactory();  
      
    //creating session object  
    Session session=factory.openSession();  
      
    //creating transaction object  
    Transaction t=session.beginTransaction();  
          
    Employee e1=new Employee();  
    e1.setId(3031);  
    e1.setFirstName("Tanu");  
    e1.setLastName("Vajpai");  
    e1.setCollege("MITS");
    e1.setCompany_name("SourceOne management pvt ltd"); 
    e1.setDesignation("asst. software engineer");
      
    session.persist(e1);//persisting the object  
      
    t.commit();//transaction is committed  
    session.close();  
      
    System.out.println("successfully saved");  
      
}  

}