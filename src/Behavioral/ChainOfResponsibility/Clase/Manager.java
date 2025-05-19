package Behavioral.ChainOfResponsibility.Clase;

public class Manager extends BaseHandler{
    @Override
    public void handle(Complaint complaint) {
        if(complaint.type == ComplaintType.MEDIU)
            System.out.println("Managerul ti a rezolvat problema!");
        else
            nextHandler.handle(complaint);
    }
}
