package Decorator.Program;

import Decorator.Clase.Beverage;
import Decorator.Clase.Coffee;
import Decorator.Clase.ExtraSugar;
import Decorator.Clase.Milk;

public class Main {
    public static void main(String[] args) {
        Beverage myCoffee = new Coffee();
        myCoffee = new ExtraSugar(myCoffee);
        myCoffee = new Milk(myCoffee);

        System.out.println(myCoffee.getDescription());
        System.out.println(myCoffee.getCost());
    }
}
