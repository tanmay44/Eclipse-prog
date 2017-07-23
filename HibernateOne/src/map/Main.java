package map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Main {
	
public static void main(String[] args) {
	
	
AnnotationConfiguration cfg =new  AnnotationConfiguration();

Session session = cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();

Transaction t=session.beginTransaction();
	
	
	
UserDetails user =new  UserDetails();

user.setUserName("Tanmay Vajpai");

Vehicle vehicle=new Vehicle();

vehicle.setVehicleName("Bike");


Vehicle vehicle2=new Vehicle();

vehicle2.setVehicleName("Car");

user.getVehicle().add(vehicle);
user.getVehicle().add(vehicle2);




session.beginTransaction();
session.save(user);
session.save(vehicle);
session.save(vehicle2);

session.getTransaction().commit();

session.close();
}




}
