package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Jaffa Cake!");
        Recipe jaffaRecipe = new JaffaCake();
        Food jaffaFood = (JaffaCake)jaffaRecipe;
        for(String s : jaffaRecipe.getIngredients())
        {
            System.out.println(s);
        }
        System.out.println("Fat content: " + jaffaFood.getFat());

    }
}