package Behavioral.ChainOfResponsibility.Clase;

public class Executive extends BaseHandler{
    @Override
    public void handle(Complaint complaint) {
        if(complaint.type == ComplaintType.MAJOR)
            System.out.println("Executivul ti a rezolvat problema!");
        else
            nextHandler.handle(complaint);
    }
}
