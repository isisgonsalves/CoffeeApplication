/**
 * This class a subclass of Ingredient.
 *
 * @Isis Gonsalves 816026980
 * @3/18/2022
 */

public class BlackEspresso extends Ingredient
{
    private double price;
    
    /**
     * Constructor for objects of class BlackEspresso
     */
    public BlackEspresso()
    {
        price = 3.00;
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
