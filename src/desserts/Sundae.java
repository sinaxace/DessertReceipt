/*
The Sundae class should be derived from the IceCream
class. The cost of a Sundae is the cost of the IceCream
plus the cost of the topping.
*/
package desserts;
/**
 *
 * @author Sina Maleki
 */
public class Sundae extends IceCream
{
    String topping;
    int toppingCost;
    
    Sundae(){}
    Sundae(String creamName, int cents, String toppingName, int toppingCents)
    {
        name = creamName;
        cost = cents;
        topping = toppingName;
        toppingCost = toppingCents;
    }
    @Override
    public int getCost(){
        return cost + toppingCost;
    }
    public String toString()
    {
        return topping + " Sundae with ";
    }
}
