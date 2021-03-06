package com.decorator.icecream.variety;

import com.decorator.icecream.Icecream;

/*
 * This class is the concrete implementation of Icecream type.
 * It implements all the methods of the interface.
 * The decorators will be added on the instance of this class at runtime
 */
public class VanillaIcecream implements Icecream {

    @Override
    public String makeIcecream() {
        return "Vanilla Icecream ";
    }

    @Override
    public double cost() {
        return 3.00;
    }
}
