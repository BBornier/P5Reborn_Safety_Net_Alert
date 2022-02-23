package models;

import java.util.List;

public class Address {

    Long id;
    String address;
    List<Firestation> firestations;

    public Address() {
    }

    public Address(Long id, String address, List<Firestation> firestations) {
        this.id = id;
        this.address = address;
        this.firestations = firestations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Firestation> getFirestations() {
        return firestations;
    }

    public void setFirestations(List<Firestation> firestations) {
        this.firestations = firestations;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", firestations=" + firestations +
                '}';
    }
}
