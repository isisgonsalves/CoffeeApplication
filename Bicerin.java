/**
 * This class is a subclass of ViennaCoffee.
 *
 * @Isis Gonsalves 816026980
 * @3/18/2022
 */
public class Bicerin extends ViennaCoffee
{
    /**
     * Constructor for objects of class Bicerin
     */
    public Bicerin()
    {
        Ingredient blackEsp = new BlackEspresso();
        add(blackEsp);
        
        Ingredient milk = new Milk();
        add(milk);
        
        Ingredient choco = new Chocolate();
        add(choco);
    }

    
}
