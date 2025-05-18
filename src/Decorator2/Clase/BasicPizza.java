package Decorator2.Clase;

public class BasicPizza implements Pizza{
    private String descriere;
    private double pretInitial;

    public BasicPizza() {
        this.descriere = "Pizza de baza";
        this.pretInitial = 20;
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
