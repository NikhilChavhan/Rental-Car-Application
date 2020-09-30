import java.util.*;
import java.io.*;

///////////////////////////////////////////////Customer Class///////////////////////////////
public class Customer {

	private String firstName, lastName, gender, status, location, contact, license;
	
	public Customer() {
	
		firstName = "";
		lastName = "";
		gender = "";
		status = "";
		location = "";
		contact = "";
		license ="";
	}
	
	public void setCustomer(String fN, String lN, String g, String s, String l, String c, String ln){
	
		firstName = fN;
		lastName = lN;
		gender = g;
		status = s;
		location = l;
		contact = c;
		license =ln;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getContact() {
		return contact;
	}

	public String getLicense() { return  license; }

//	public void saveToFile() throws IOException {
		
//		PrintWriter outFile = new PrintWriter(new FileOutputStream(new File("Customers_Inventory.txt"), true));
//  	outFile.println(getFullName() + " " + getGender() + " " 
//	  	+ getLocation() + " " + getContact() + " " + getStatus());
//	 	outFile.close();
 //	}
}