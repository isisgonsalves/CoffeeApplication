/**
 * This class a subclass of Ingredient.
 *
 * @Isis Gonsalves 816026980
 * @3/18/2022
 */

public class Milk extends Ingredient
{
    private double price;
    
    /**
     * Constructor for objects of class Milk
     */
    public Milk()
    {
        price = 1.00;
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
