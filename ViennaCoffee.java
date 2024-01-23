/**
 * This class is a subclass of Ristretto.
 *
 * @Isis Gonsalves 816026980
 * @3/18/2022
 */
public class ViennaCoffee extends Ristretto
{
    /**
     * Constructor for objects of class ViennaCoffee
     */
    public ViennaCoffee()
    {
        Ingredient ingr = new WhippedCream();
        add(ingr);
        add(ingr);
    }

}
