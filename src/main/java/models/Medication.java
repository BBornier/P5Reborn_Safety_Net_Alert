package models;

import java.util.List;

public class Medication {

    Long id;
    String medication;
    List<MedicalRecord> medicalRecords;

    public Medication() {
    }

    public Medication(Long id, String medication, List<MedicalRecord> medicalRecords) {
        this.id = id;
        this.medication = medication;
        this.medicalRecords = medicalRecords;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "id=" + id +
                ", medication='" + medication + '\'' +
                ", medicalRecords=" + medicalRecords +
                '}';
    }
}
