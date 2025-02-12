package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Doctor;

public class DoctorDAO {
	
	 public void addDoctor(Doctor doctor) {
	        try (Connection conn = DatabaseConnection.getConnection()) {
	            String sql = "INSERT INTO doctors (name, specialization, contact) VALUES (?, ?, ?)";
	            PreparedStatement stmt = conn.prepareStatement(sql);
	            stmt.setString(1, doctor.getName());
	            stmt.setString(2, doctor.getSpecialization());
	            stmt.setString(3, doctor.getContact());
	            stmt.executeUpdate();
	            System.out.println("Doctor added successfully!");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public List<Doctor> getAllDoctors() {
	        List<Doctor> doctors = new ArrayList<>();
	        try (Connection conn = DatabaseConnection.getConnection()) {
	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT * FROM doctors");
	            while (rs.next()) {
	                doctors.add(new Doctor(rs.getInt("id"), rs.getString("name"),
	                        rs.getString("specialization"), rs.getString("contact")));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return doctors;

}
}
