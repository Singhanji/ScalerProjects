package Beginner_ParkingLot.models;

import Beginner_ParkingLot.models.enums.VehicleType;

import java.util.Date;

public class Ticket extends BaseModel{
    private Date entryTime;
    private Vehicle vehicle;
    private VehicleType vehicleType;
    private Gate entryGate;
    private Booth assignedBooth;
    private Operator operator;

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Booth getAssignedBooth() {
        return assignedBooth;
    }

    public void setAssignedBooth(Booth assignedBooth) {
        this.assignedBooth = assignedBooth;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
