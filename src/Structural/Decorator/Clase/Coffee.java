package Structural.Decorator.Clase;

public class Coffee implements Beverage{
    String descriere;
    double pretInitial;

    public Coffee() {
        this.descriere = "Cafea simpla";
        this.pretInitial = 4;
    }

    @Override
    public String getDescription() {
        return descriere;
    }

    @Override
    public double getCost() {
        return pretInitial;
    }
}
