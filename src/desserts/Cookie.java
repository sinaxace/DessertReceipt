/*
The Cookie class should be derived from the DessertItem
 class. A Cookie item has anumber and a price per dozen
 which are used to determine its cost. For example, 4 
cookies @ 399 cents /dz. = 133 cents. 
The cost should be rounded to the nearest cent.
 */
package desserts;

import static desserts.DessertShoppe.cents2dollarsAndCents;

/**
 *
 * @author SinaM
 */
public class Cookie extends DessertItem
{
    int numPerCookie; 
    int cost;
    int costNperCookie;
    
    Cookie(){}
    Cookie(String cookieType, int number, int cents)
    {
        name = cookieType;
        numPerCookie = number;
        cost = cents;
        costNperCookie = number*cents/12;
    }
    @Override
    public int getCost(){
        return costNperCookie;
    }
    @Override
    public String toString()
    {
        return numPerCookie + " @ " + cents2dollarsAndCents(cost) + "/dz.";
    }
}
