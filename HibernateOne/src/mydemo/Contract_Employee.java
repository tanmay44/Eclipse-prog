package mydemo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contractemployee")

public class Contract_Employee extends Employee1 {
	
	
@Column(name="pay_per_hour")	
private float pay_per_hour;


@Column(name="contact_duration")
private String contact_duration;


public float getPay_per_hour() {
	return pay_per_hour;
}


public void setPay_per_hour(float pay_per_hour) {
	this.pay_per_hour = pay_per_hour;
}


public String getContact_duration() {
	return contact_duration;
}


public void setContact_duration(String contact_duration) {
	this.contact_duration = contact_duration;
}
	
	
	

}
