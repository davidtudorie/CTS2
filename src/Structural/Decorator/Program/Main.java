package Structural.Decorator.Program;

import Structural.Decorator.Clase.Beverage;
import Structural.Decorator.Clase.Coffee;
import Structural.Decorator.Clase.ExtraSugar;
import Structural.Decorator.Clase.Milk;

public class Main {
    public static void main(String[] args) {
        Beverage myCoffee = new Coffee();
        myCoffee = new ExtraSugar(myCoffee);
        myCoffee = new Milk(myCoffee);

        System.out.println(myCoffee.getDescription());
        System.out.println(myCoffee.getCost());
    }
}
