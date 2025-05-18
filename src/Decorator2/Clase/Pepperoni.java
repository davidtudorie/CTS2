package Decorator2.Clase;

public class Pepperoni extends ToppingDecorator{
    public Pepperoni(Pizza basePizza) {
        super(basePizza);
    }

    @Override
    public double getCost() {
        return this.basePizza.getCost() + 7.0;
    }

    @Override
    public String getDescription() {
        return this.basePizza.getDescription() + " +pepperoni";
    }
}
