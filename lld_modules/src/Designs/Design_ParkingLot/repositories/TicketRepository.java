package Designs.Design_ParkingLot.repositories;

import Designs.Design_ParkingLot.model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {


    private Map<Integer, Ticket> tickets = new HashMap<>();
    private int ticketIdSequence = 0;

    public Ticket saveTicket(Ticket ticket) {
        /// do something.
        ticketIdSequence += 1;
        ticket.setId(ticketIdSequence);
        tickets.put(ticketIdSequence, ticket);
        return ticket;
    }

}
