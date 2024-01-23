/**
 * This class is essentially the main class. 
 * It calculates the price for all the ingredients added in the drink.
 * It provides a toString method for the subclasses to refine. 
 *
 * @Isis Gonsalves 816026980
 * @3/18/2022
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public abstract class EspressoDrink implements CoffeeDrink
{
    
    private ArrayList<Ingredient> ingredients;
    
    /**
     * Constructor for objects of class EspressoDrink
     */
    public EspressoDrink(){        
        ingredients = new ArrayList <Ingredient> (); 
    }
    
    /**
     * An accessor method for the ingredient array list.
     *
     * @return ingredients list
     */
    public ArrayList<Ingredient> getIngredientsList(){
        return this.ingredients;
    }
    
    /**
     * A method to iterate through te array list and calculate a running total price.
     *
     * @return total price
     */
    public double getPrice(){
        
        double totalPrice = 0.0;
        
        Iterator <Ingredient> iteration = ingredients.iterator();
        
        while( iteration.hasNext()){
            Ingredient ingredients = iteration.next();
            totalPrice = totalPrice + ingredients.getPrice();
        }
        
        return totalPrice;
    }
    
    /**
     * A method that adds items (ingredients) to the array list.
     *
     * @param ingredients
     */
    public void add(Ingredient ingredient){
        
        this.ingredients.add(ingredient);
    }
    
    /**
     * To String method that gets the name of the class amd appends it to the ingredient list.
     *
     * @return  class name and ingredient list.
     */
    public String toString(){
        
        return this.getClass().getSimpleName() + getIngredientsList();
    }
}
