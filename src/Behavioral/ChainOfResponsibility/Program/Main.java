package Behavioral.ChainOfResponsibility.Program;

import Behavioral.ChainOfResponsibility.Clase.*;

public class Main {
    public static void main(String[] args) {
        //Merge un Facade, sa nu se vada tot set-ul de nextHandler si initializarea
        //Se poate schimba ordinea cu o functie (in acelasi Facade)

        Handler support = new SupportTeam();
        Handler manager = new Manager();
        Handler executive = new Executive();

        support.setNextHandler(manager);
        manager.setNextHandler(executive);

        Complaint minorComplaint = new Complaint(ComplaintType.MINOR, "Problema minoră");
        support.handle(minorComplaint);

        Complaint majorComplaint = new Complaint(ComplaintType.MAJOR, "Problema majoră");
        support.handle(majorComplaint);
    }
}
