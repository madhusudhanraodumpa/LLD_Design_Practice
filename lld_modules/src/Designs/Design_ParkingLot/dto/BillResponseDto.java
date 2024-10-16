package Designs.Design_ParkingLot.dto;

import Designs.Design_ParkingLot.model.BillStatus;
import Designs.Design_ParkingLot.model.Gate;
import Designs.Design_ParkingLot.model.Payment;
import Designs.Design_ParkingLot.model.Ticket;

import java.sql.Timestamp;
import java.util.List;

public class BillResponseDto {
    private int amount;
    private List<Payment> paymentList;
    private Timestamp exitTime;
    private Gate gate;
    private BillStatus billStatus;
    private Ticket ticket;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public Timestamp getExitTime() {
        return exitTime;
    }

    public void setExitTime(Timestamp exitTime) {
        this.exitTime = exitTime;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
