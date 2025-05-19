package Structural.Decorator.Clase;

public class Milk extends BeverageDecorator{
    @Override
    public double getCost() {
        return bautura.getCost() + 2.0;
    }

    @Override
    public String getDescription() {
        return bautura.getDescription() + " + lapte";
    }

    public Milk(Beverage bautura) {
        super(bautura);
    }
}
