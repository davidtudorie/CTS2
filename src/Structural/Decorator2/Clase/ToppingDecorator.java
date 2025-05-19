package Structural.Decorator2.Clase;
public abstract class ToppingDecorator implements Pizza {
    protected final Pizza basePizza;

    public ToppingDecorator(Pizza basePizza) {
        this.basePizza = basePizza;
    }
}
