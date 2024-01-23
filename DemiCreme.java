/**
 * This class is a subclass of Ristretto.
 *
 * @Isis Gonsalves 816026980
 * @3/18/2022
 */
public class DemiCreme extends Ristretto
{
    /**
     * Constructor for objects of class DemiCreme
     */
    public DemiCreme()
    {
        
        Ingredient blackEsp = new BlackEspresso();
        add(blackEsp);
        
        Ingredient cream = new Cream();
        add(cream);
        add(cream);
        
    }

}
