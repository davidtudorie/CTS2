package Behavioral.ChainOfResponsibility.Clase;

public interface Handler {
    void handle(Complaint complaint);
    void setNextHandler(Handler handler);
}
