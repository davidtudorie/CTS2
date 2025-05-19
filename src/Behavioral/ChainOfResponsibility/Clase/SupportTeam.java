package Behavioral.ChainOfResponsibility.Clase;

public class SupportTeam extends BaseHandler{
    @Override
    public void handle(Complaint complaint) {
        if(complaint.type == ComplaintType.MINOR)
            System.out.println("Echipa de support ti a rezolvat problema!");
        else
            nextHandler.handle(complaint);
    }
}
