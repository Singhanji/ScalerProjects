package Beginner_ParkingLot.dtos;

public class GenerateTicketResponseDTO {
    // This will always have these two properties
    private Long generateTicketId;
    private String message;
    private ResponseStatus status;

    public Long getGenerateTicketId() {
        return generateTicketId;
    }

    public void setGenerateTicketId(Long generateTicketId) {
        this.generateTicketId = generateTicketId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }
}
