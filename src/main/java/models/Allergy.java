package models;

import java.util.List;

public class Allergy {

    Long id;
    String allergy;
    List<MedicalRecord> medicalRecords;

    public Allergy() {
    }

    public Allergy(Long id, String allergy, List<MedicalRecord> medicalRecords) {
        this.id = id;
        this.allergy = allergy;
        this.medicalRecords = medicalRecords;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    @Override
    public String toString() {
        return "Allergy{" +
                "id=" + id +
                ", allergy='" + allergy + '\'' +
                ", medicalRecords=" + medicalRecords +
                '}';
    }
}
