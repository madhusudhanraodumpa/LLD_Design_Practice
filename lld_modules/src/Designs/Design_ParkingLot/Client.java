package Designs.Design_ParkingLot;

import Designs.Design_ParkingLot.controller.TicketController;
import Designs.Design_ParkingLot.dto.TicketGenerateRequestDto;
import Designs.Design_ParkingLot.dto.TicketGenerateResponseDto;
import Designs.Design_ParkingLot.exceptions.NoParkingSpotAvailableException;
import Designs.Design_ParkingLot.model.Ticket;
import Designs.Design_ParkingLot.model.VechileType;
import Designs.Design_ParkingLot.repositories.*;
import Designs.Design_ParkingLot.services.GateService;
import Designs.Design_ParkingLot.services.TicketService;
import Designs.Design_ParkingLot.services.VechileService;
import Designs.Design_ParkingLot.startigies.ParkingSpotAssignmentStartigey;
import Designs.Design_ParkingLot.startigies.RandomParkingSpotAssignmentStartigey;

public class Client {
    public static void main(String[] args) throws NoParkingSpotAvailableException {
        System.out.println("Hello world!");

        //Create the objects of all the services, repositories and controllers.
        //Dependencies.

        //Registry Design pattern -> To store all the objects at one place
        //So that we can use these objects whenever required.
        ObjectRegistry objectRegistry = new ObjectRegistry();
        GateRepositri gateRepositri =new GateRepositri();
        VechileRepositri vechileRepositri = new VechileRepositri();
        VechileService vehicleService = new VechileService(vechileRepositri);
        GateService gateService = new GateService(gateRepositri);
        TicketRepository ticketRepository = new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        ParkingSpotAssignmentStartigey spotAssignmentStrategy = new RandomParkingSpotAssignmentStartigey(parkingLotRepository,parkingSpotRepository);
        TicketService ticketService = new TicketService(vehicleService,
                gateService, spotAssignmentStrategy, ticketRepository);
        TicketController ticketController = new TicketController(ticketService);

        objectRegistry.register("vehicleService", vehicleService);
        objectRegistry.register("gateService", gateService);
        objectRegistry.register("ticketRepository", ticketRepository);
        objectRegistry.register("parkingLotRepo", parkingLotRepository);
        objectRegistry.register("spotAssignmentStrategy", spotAssignmentStrategy);
        objectRegistry.register("ticketService", ticketService);
        objectRegistry.register("ticketController", ticketController);

        TicketGenerateRequestDto requestDto = new TicketGenerateRequestDto();
        requestDto.setVechileType(VechileType.SMALL);
        requestDto.setVechicleNumber(1000);
        requestDto.setGateId(122);

        TicketGenerateResponseDto responseDto = ticketController.generateTicket(requestDto);

        Ticket ticket = responseDto.getTicket();
        //We have got the Ticket, do whatever you want !!
    }
}

//First start coding the Models and then code the requirements one by one.

// Issues with generateTicket method :

// 1. If we add more params in the input, then the current users will start failing.
// 2. Models are the internal details of my system, and we might not want to expose them to the external world.
// 3. Client will have to make lot of GET calls to create the vehicle and other objects.

// DTO -> Data Transfer Objects.
// request -> RequestDTO
// response -> responseDTO

//Dependencies -> Topological Sort
//SpringBoot
//Dependency graph, apply the topological sort on the garph and
// find the order in which the dependencies should be resolved.
// A->B->C_D}
