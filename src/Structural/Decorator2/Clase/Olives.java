package Structural.Decorator2.Clase;

public class Olives extends ToppingDecorator{
    public Olives(Pizza basePizza) {
        super(basePizza);
    }

    @Override
    public double getCost() {
        return this.basePizza.getCost() + 3.0;
    }

    @Override
    public String getDescription() {
        return this.basePizza.getDescription() + " +olives";
    }

}
