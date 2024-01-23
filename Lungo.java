/**
 * This class is a subclass of Ristretto.
 *
 * @Isis Gonsalves 816026980
 * @3/18/2022
 */
public class Lungo extends Ristretto
{
    /**
     * Constructor for objects of class Lungo
     */
    public Lungo()
    {
       Ingredient blackEsp = new BlackEspresso();
        add(blackEsp);
        add(blackEsp);
        add(blackEsp);
    }
}
