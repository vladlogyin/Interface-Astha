package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JaffaCake implements Biscuit, Cake, Recipe{


    private JaffaFilling fillingType;

    @Override
    public Boolean needsTea() {
        return false;
    }

    @Override
    public Boolean hasFilling() {
        return true;
    }

    @Override
    public CakeType[] getType() {
        return new CakeType[]{CakeType.NotACake, CakeType.Chocolate};
    }

    @Override
    public List<String> getIngredients() {
        return new ArrayList<String>(Arrays.asList("Chocolate","Magic","Egg","Water"));
    }

    enum JaffaFilling {Orange, Strawberry, Lemon};
    private boolean _isDonut = false;
    boolean isDonut(){
        return _isDonut;
    };
    @Override
    public double getCalories() {
        return 50.2;
    }
    @Override
    public double getFat() {
        return 8.1;
    }

    @Override
    public double getProtein() {
        return 0;
    }

    @Override
    public double getCarbs() {
        return 69.8;
    }
}
