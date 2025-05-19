package Structural.Facade.Program;

import Structural.Facade.Clase.VacationFacade;

public class Main {
    public static void main(String[] args) {
        VacationFacade facade = new VacationFacade();
        String confirmation = facade.bookVacation("Paris", "2023-12-01", 3);
        System.out.println(confirmation);
    }
}