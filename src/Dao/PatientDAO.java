package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Patient;

public class PatientDAO {
	
	public void addPatient(Patient patient) {
		 try (Connection conn = DatabaseConnection.getConnection()) {
		 String sql = "INSERT INTO patients (name, age, gender, contact, address) VALUES (?, ?, ?, ?,?)";
		 PreparedStatement stmt = conn.prepareStatement(sql);
		 stmt.setString(1, patient.getName());
		 stmt.setInt(2, patient.getAge());
		 stmt.setString(3,patient.getGender());
		 stmt.setInt(4, patient.getContact());
		 stmt.setString(5, patient.getAddress());
		stmt.executeUpdate();
		 System.out.println("Patient added successfully!");
		 } catch (Exception e) { 
			 e.printStackTrace(); 
		 }
	}
	
	 public List<Patient> getAllPatients() {
	        List<Patient> patients = new ArrayList<>();
	        try (Connection conn = DatabaseConnection.getConnection()) {
	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT * FROM patients");
	            while (rs.next()) {
	                patients.add(new Patient(rs.getInt("id"), rs.getString("name"), rs.getInt("age"),
	                        rs.getString("gender"), rs.getInt("contact"), rs.getString("address")));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return patients;
	    }
	}

