package Structural.Decorator.Clase;

public class ExtraSugar extends BeverageDecorator{

    public ExtraSugar(Beverage bautura) {
        super(bautura);
    }

    @Override
    public String getDescription() {
       return this.bautura.getDescription() + " + zahar";
    }

    @Override
    public double getCost() {
        return this.bautura.getCost() + 0.5;
    }
}
