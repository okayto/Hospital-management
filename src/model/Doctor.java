package model;

public class Doctor {
	
	
	 private int id;
	    private String name;
	    private String specialization;
	    private String contact;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSpecialization() {
			return specialization;
		}
		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public Doctor(int id, String name, String specialization, String contact) {
			super();
			this.id = id;
			this.name = name;
			this.specialization = specialization;
			this.contact = contact;
		}
		@Override
		public String toString() {
			return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", contact=" + contact
					+ "]";
		}
		public Doctor(String name, String specialization, String contact) {
	        this(0, name, specialization, contact);
	    }

	   

}
