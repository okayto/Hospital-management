package model;

public class Patient {
	
	private int id;
	private String name; 
	private int age; 
	private String gender;
	private int contact;
	private String address;
	
	 public Patient(int id, String name, int age, String gender, int contact, String address) {
	 this.id = id;
	 this.name = name; 
	 this.age = age;
	 this.gender = gender;
    this.contact = contact;
	this.address = address;
	 }
	 
	 public Patient(String name, int age, String gender, int contact, String address) {
	        this(0, name, age, gender, contact, address);
	      
	 } 
	 
	 
	 
	 public int getId() {
		 return id; 
		 } 
	 public String getName() 
	 {
		 return name;
	 }
	 public int getAge()
	 { 
		 return age; 
		 }
	 public String getGender() 
	 { 
		 return gender; 
		 } 
	 public int getContact() 
	 { return contact; 
	 }
	 public String getAddress() { 
		 return address; 
		 }

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", contact=" + contact
				+ ", address=" + address + "]";
	}
	

}
