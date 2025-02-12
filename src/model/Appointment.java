package model;

import java.sql.Date;
import java.sql.Time;

public class Appointment {
	
	private int id;
    private int patientId;
    private int doctorId;
    private Date date;
    private Time time;

    public Appointment(int id, int patientId, int doctorId, Date date, Time time) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
        this.time = time;
    }

    public Appointment(int patientId, int doctorId, Date date, Time time) {
        this(0, patientId, doctorId, date, time);
    }

    public int getId() { return id; }
    public int getPatientId() { return patientId; }
    public int getDoctorId() { return doctorId; }
    public Date getDate() { return date; }
    public Time getTime() { return time; }

    @Override
    public String toString() {
        return "Appointment ID: " + id + ", Patient ID: " + patientId + ", Doctor ID: " + doctorId +
                ", Date: " + date + ", Time: " + time;
    }


}
