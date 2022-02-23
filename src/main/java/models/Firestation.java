package models;

import java.util.List;

public class Firestation {

    Long id;
    List<Address> addresses;
    int station;


    public Firestation() {
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
