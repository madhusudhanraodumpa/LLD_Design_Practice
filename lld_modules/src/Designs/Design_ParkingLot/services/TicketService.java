package Designs.Design_ParkingLot.services;

import Designs.Design_ParkingLot.exceptions.NoParkingSpotAvailableException;
import Designs.Design_ParkingLot.model.*;
import Designs.Design_ParkingLot.repositories.TicketRepository;
import Designs.Design_ParkingLot.startigies.ParkingSpotAssignmentStartigey;

import java.sql.Timestamp;

public class TicketService {
    VechileService vechileService;
    GateService gateService;

    ParkingSpotAssignmentStartigey parkingSpotAssignmentStartigey;

    TicketRepository ticketRepository;


    public TicketService(VechileService vechileService,GateService gateService,ParkingSpotAssignmentStartigey parkingSpotAssignmentStartigey,TicketRepository ticketRepository) {
        this.vechileService =vechileService;
        this.gateService = gateService;
        this.parkingSpotAssignmentStartigey =parkingSpotAssignmentStartigey;
        this.ticketRepository = ticketRepository;
    }



    public Ticket generateTicket(int vechileNumber, int gateNumber, VechileType vechileType,String vechileOwnerName) throws NoParkingSpotAvailableException {

        Vechile vechile = vechileService.getVechile(vechileNumber);
        if (vechile == null) {
            vechile = vechileService.registerVechile(vechileNumber,vechileType,vechileOwnerName);
        }
        Gate gate = gateService.getGate(gateNumber);
        ParkingSpot parkingSpot = parkingSpotAssignmentStartigey.assignSpot(vechileNumber,vechileType,gate);

        if (parkingSpot == null) {
            throw new NoParkingSpotAvailableException("No Parking spot is available");
        }

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Timestamp(System.currentTimeMillis()));
        ticket.setGate(gate);
        ticket.setParkingSpot(parkingSpot);
        ticket.setVechile(vechile);
        ticket.setTicketNumber((int)System.currentTimeMillis()/10000);
        return ticket;
    }

}
