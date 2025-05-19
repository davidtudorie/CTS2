package Behavioral.ChainOfResponsibility.Clase;

public class Complaint {
    ComplaintType type;
    String description;

    public Complaint(ComplaintType type, String description) {
        this.type = type;
        this.description = description;
    }


}
