package Beginner_ParkingLot.models;

import Beginner_ParkingLot.Services.strategies.TicketService;
import Beginner_ParkingLot.dtos.GenerateTicketRequestDTO;
import Beginner_ParkingLot.dtos.GenerateTicketResponseDTO;
import Beginner_ParkingLot.dtos.ResponseStatus;

public class TicketController {
    private TicketService ticketService;

    // since the ticket service is private so we have to accept it in the constructor
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    GenerateTicketResponseDTO generateTicket(GenerateTicketRequestDTO requestDTO){
        GenerateTicketResponseDTO responseDTO = null;
        try{
            Ticket ticket = ticketService.generateTicket(requestDTO);
            responseDTO.setGenerateTicketId(ticket.getId());
            responseDTO.setStatus(ResponseStatus.SUCCESS);
            responseDTO.setMessage("Ticket generated successfully");
        }
        catch (Exception ex){
            responseDTO.setStatus(ResponseStatus.FAILURE);
            // ideally don't give an exception message, might leak application details
            // log it and give the client id of log
//            responseDTO.setMessage(ex.getMessage());
            responseDTO.setMessage("OOPS, something went wrong!");

        }
        return responseDTO;
    }
}
