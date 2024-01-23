/**
 * This class a subclass of Cream.
 *
 * @Isis Gonsalves 816026980
 * @3/18/2022
 */

public class WhippedCream extends Cream
{
    private double price;
    
    /**
     * Constructor for objects of class WhippedCream
     */
    public WhippedCream()
    {
        price = 2.50;
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
