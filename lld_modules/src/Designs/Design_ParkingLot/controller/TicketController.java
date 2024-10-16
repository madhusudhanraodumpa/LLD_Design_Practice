package Designs.Design_ParkingLot.controller;

import Designs.Design_ParkingLot.dto.TicketGenerateRequestDto;
import Designs.Design_ParkingLot.dto.TicketGenerateResponseDto;
import Designs.Design_ParkingLot.exceptions.NoParkingSpotAvailableException;
import Designs.Design_ParkingLot.model.Gate;
import Designs.Design_ParkingLot.model.ResponseStatus;
import Designs.Design_ParkingLot.model.Ticket;
import Designs.Design_ParkingLot.model.Vechile;
import Designs.Design_ParkingLot.services.TicketService;

public class TicketController {
    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public TicketGenerateResponseDto generateTicket(TicketGenerateRequestDto ticketGenerateRequestDto) {
        Ticket ticket =null;
        TicketGenerateResponseDto ticketGenerateResponseDto = new TicketGenerateResponseDto();
        try {
            ticket = ticketService.generateTicket(ticketGenerateRequestDto.getVechicleNumber(),ticketGenerateRequestDto.getGateId(),ticketGenerateRequestDto.getVechileType(),ticketGenerateRequestDto.getVechileOwnerName());
            ticketGenerateResponseDto.setTicket(ticket);
            ticketGenerateResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (NoParkingSpotAvailableException e) {
            ticketGenerateResponseDto.setTicket(null);
            ticketGenerateResponseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return  ticketGenerateResponseDto;
    }
}
