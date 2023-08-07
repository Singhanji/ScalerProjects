package Beginner_ParkingLot.models;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String address;
    private String name;
    private List<Booth> booths; // 1 Parking lot has Many Booths so taking List of Booth in Parking Lot
    private List<Gate> gates;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Booth> getBooths() {
        return booths;
    }

    public void setBooths(List<Booth> booths) {
        this.booths = booths;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }
}
