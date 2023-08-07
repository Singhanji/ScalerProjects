package Beginner_ParkingLot.models;

import Beginner_ParkingLot.models.enums.GateType;

public class Gate extends BaseModel {
     private String number;
     private ParkingLot parkingLot;
     private GateType gateType;
     private Operator currentOperator;

     public String getNumber() {
          return number;
     }

     public void setNumber(String number) {
          this.number = number;
     }

     public ParkingLot getParkingLot() {
          return parkingLot;
     }

     public void setParkingLot(ParkingLot parkingLot) {
          this.parkingLot = parkingLot;
     }

     public GateType getGateType() {
          return gateType;
     }

     public void setGateType(GateType gateType) {
          this.gateType = gateType;
     }

     public Operator getCurrentOperator() {
          return currentOperator;
     }

     public void setCurrentOperator(Operator currentOperator) {
          this.currentOperator = currentOperator;
     }
}
