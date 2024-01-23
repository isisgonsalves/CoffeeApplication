/**
 * This class is a subclass of ViennaCoffee. 
 * 
 * @Isis Gonsalves 816026980
 * @3/18/2022
 */
public class EspressoConPanna extends ViennaCoffee 
{
    /**
     * Constructor for objects of class EspressoConPanna
     */
    public EspressoConPanna()
    {
        Ingredient blackEsp = new BlackEspresso();
        add(blackEsp);
        add(blackEsp);
        
        Ingredient cin = new Cinnamon();
        add(cin);
        
    }

}
