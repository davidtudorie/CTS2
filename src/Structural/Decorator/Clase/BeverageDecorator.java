package Structural.Decorator.Clase;

public abstract class BeverageDecorator implements Beverage {
    protected final Beverage bautura;

    public BeverageDecorator(Beverage bautura) {
        this.bautura = bautura;
    }

}
