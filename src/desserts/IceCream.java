/*
 The IceCream class should be derived from the 
DessertItem class. An IceCream item simply has a cost.
 */
package desserts;

/**
 *
 * @author Sina Maleki
 */
public class IceCream extends DessertItem
{
    int cost;
    
    IceCream(){}
    IceCream(String creamName, int cents)
    {
        name = creamName;
        cost = cents;
    }
    @Override
    public int getCost(){
        return cost;
    }
}
