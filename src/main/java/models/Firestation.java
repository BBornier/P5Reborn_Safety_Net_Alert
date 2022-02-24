package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Firestation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Address> addresses;

    @Column(nullable = false, unique = true)
    private int station;

    public Firestation() {
        this.addresses = new ArrayList<>();
    }

    public Firestation(Long id, List<Address> addresses, int station) {
        this.id = id;
        this.addresses = addresses;
        this.station = station;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "Firestation{" +
                "id=" + id +
                ", addresses=" + addresses +
                ", station=" + station +
                '}';
    }
}
