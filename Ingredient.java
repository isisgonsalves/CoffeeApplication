/**
 * This class is provides a toString method for the ingredient subclasses to refine. 
 *
 * @Isis Gonsalves 816026980
 * @3/18/2022
 */

public abstract class Ingredient
{
    public double price;
    
    public Ingredient(){        
        price = 0; 
    }
    
    public Ingredient (double price){
        this.price = price; 
    }
    
    public double getPrice(){
        return price;
    }
    
    public String toString(){
        
        return this.getClass().getSimpleName()+ " $"+String.format("%.2f", getPrice());
        
    }
    
    public boolean equals(Object obj) {

        if (obj instanceof Ingredient) {
          Ingredient i = (Ingredient) obj;
          String ingredientName = i.getClass().getSimpleName();
          boolean result = this.getClass().getSimpleName() == ingredientName;
          
          return result;
    
        }
        
    return false;

  }
}
