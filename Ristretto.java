/**
 * This class is a subclass of Espresso Drink and the parent class of many other drinks.
 * It includes a refined toString method.
 *
 * @Isis Gonsalves 816026980
 * @3/18/2022
 */
public class Ristretto extends EspressoDrink
{
    /**
     * Constructor for objects of class Ristretto
     */
    public Ristretto(){
        Ingredient blackEsp = new BlackEspresso();
        add(blackEsp);
    }
    
    /**
     * To String method that calls the parent to string method and refines it
     * by adding the price.
     *
     * @return class name, ingredient list and price.
     */
    public String toString(){
        String details = super.toString();
        
        details += " PRICE: $" +String.format("%.2f", getPrice());
        
        return details;
    }
}
