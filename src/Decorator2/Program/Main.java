package Decorator2.Program;

import Decorator2.Clase.BasicPizza;
import Decorator2.Clase.Cheese;
import Decorator2.Clase.Pepperoni;
import Decorator2.Clase.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza myPizza = new BasicPizza();
        myPizza = new Cheese(myPizza);
        myPizza = new Pepperoni(myPizza);

       System.out.println(myPizza.getDescription());
       System.out.println(myPizza.getCost());
    }
}
