package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "addresses")
    private List<Firestation> firestations;

    @Column(nullable = false, unique = true)
    private String address;

    public Address() {
        this.firestations = new ArrayList<>();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address1 = (Address) o;
        return Objects.equals(id, address1.id) && Objects.equals(firestations, address1.firestations) && Objects.equals(address, address1.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firestations, address);
    }
}
