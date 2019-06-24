/*
The Candy class should be derived from the DessertItem
class. A Candy item has a weight and a price per pound
which are used to determine its cost. For example, 
2.30 lbs.of fudge @ .89 /lb. = 205 cents. 
The cost should be rounded to the nearest cent.
 */
package desserts;
import static desserts.DessertShoppe.cents2dollarsAndCents;

/**
 *
 * @author Sina Maleki
 */
public class Candy extends DessertItem
{
    double weight; //Measured in pounds
    int cost;
    long costNweight;
    
    Candy(){}
    Candy(String candyType, double pounds, int cents)
    {
        name = candyType; //name data member from DessertItem class
        weight = pounds;
        cost = cents;
        costNweight = Math.round(pounds*cents);
    }
    @Override
    public int getCost(){
        return (int)costNweight;
    }
    @Override
    public String toString()
    {
        return weight + " lbs. @ "+ cents2dollarsAndCents(cost) +" /lb.";
    }
}
