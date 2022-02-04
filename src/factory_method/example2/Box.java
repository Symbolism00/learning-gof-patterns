package factory_method.example2;

import factory_method.Pizza;

public class Box {

    private Pizza pizza;

    public Box(Pizza pizza){
        this.pizza = pizza;
    }

    public String whatsInsideTheBox(){
        return pizza.toString();
    }
}
