package org.example;

public interface Cake {
    enum CakeType {Chocolate, Vanilla, RedVelvet, Sponge, NotACake};
    CakeType[] getType();

}
