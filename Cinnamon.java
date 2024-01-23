/**
 * This class a subclass of Ingredient.
 *
 * @Isis Gonsalves 816026980
 * @3/18/2022
 */

public class Cinnamon extends Ingredient
{
    private double price;
    
    /**
     * Constructor for objects of class Cinnamon
     */
    public Cinnamon()
    {
        price = 0.25;
    }
    
    /**
     * An accessor method for the Price of the ingredient.
     *
     * @return price.
     */
    public double getPrice(){
        return price;
    }
}
