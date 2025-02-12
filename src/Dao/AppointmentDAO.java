package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Appointment;

public class AppointmentDAO { 
	
	public void scheduleAppointment(AppointmentDAO appointment) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO appointments (patient_id, doctor_id, date, time) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, appointment.getPatientId());
            stmt.setInt(2, appointment.getDoctorId());
            stmt.setDate(3, appointment.getDate());
            stmt.setTime(4, appointment.getTime());
            stmt.executeUpdate();
            System.out.println("Appointment scheduled successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<AppointmentDAO> getAllAppointments() {
        List<Appointment> appointments = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM appointments");
            while (rs.next()) {
                appointments.add(new Appointment(rs.getInt("id"), rs.getInt("patient_id"),
                        rs.getInt("doctor_id"), rs.getDate("date"), rs.getTime("time")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return appointments;
    }
	
}


	
	