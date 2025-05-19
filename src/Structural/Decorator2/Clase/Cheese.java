package Structural.Decorator2.Clase;

public class Cheese extends ToppingDecorator{
    public Cheese(Pizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return this.basePizza.getDescription() + " +cheese";
    }

    @Override
    public double getCost() {
        return this.basePizza.getCost() + 5.0;
    }
}
