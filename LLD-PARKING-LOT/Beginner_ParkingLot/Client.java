package Beginner_ParkingLot;

import Beginner_ParkingLot.Services.strategies.TicketService;
import Beginner_ParkingLot.models.Ticket;
import Beginner_ParkingLot.models.TicketController;

// Client class to make testing
public class Client {
    public static void main(String[] args) {
        // Requirement 1: Generate a ticket on entry Gate
        // For this req. TicketController will take the request
        // Client calls controller classes

        // Pain point no. 2: to make the object of ticket controller, first I will have to make the object of ticket Service
        // because controller depends upon ticket service
        TicketService ts = new TicketService();
        TicketController tc = new TicketController(ts);
        tc.generateTicket();
    }
}
