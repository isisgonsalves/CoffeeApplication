/**
 * This class a subclass of Ingredient.
 *
 * @Isis Gonsalves 816026980
 * @3/18/2022
 */

public class Cream extends Ingredient
{
    private double price;
    
    /**
     * Constructor for objects of class Cream
     */
    public Cream()
    {
        price = 0.50;
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
