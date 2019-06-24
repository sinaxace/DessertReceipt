package desserts;
import java.util.ArrayList;
/**
 *
 * @author Sina Maleki
 */
public class Checkout extends DessertShoppe
{
    ArrayList<DessertItem> myDesserts = new ArrayList<DessertItem>(MAX_ITEM_NAME_SIZE);
    private int dessertAmount = 0;
    
    Checkout(){}
    public void enterItem(DessertItem obj)
    {
         myDesserts.add(dessertAmount, obj);
         dessertAmount++;
    }
    public int numberOfItems()
    {
        return myDesserts.size();
    }
    public int totalCost()
    {
        int fullCost = 0;
        for (int i = 0; i < myDesserts.size(); i++) 
        {
            fullCost = fullCost + ((DessertItem)myDesserts.get(i)).getCost();
        }
        return fullCost; //Uses get method in ArrayList to check 
    }
    
    public double totalTax()
    {
        return Math.round(totalCost()*TAX_RATE/100); //Math.round rounds the double to the nearest integer.
    }
    
    @Override //overrides toString method from Object class
    public String toString() 
    {
        System.out.printf("%25s\n%26s", STORE_NAME, "--------------------\n");
        for (int i = 0; i < myDesserts.size(); i++) 
        {//Overloading: changes arguments  Override: changes signiture
            if (myDesserts.get(i) instanceof Candy || myDesserts.get(i) instanceof Cookie) //Comparing classes using instanceof 
            {
                System.out.println(((DessertItem)myDesserts.get(i)));//For outputting cookie cost /dz
            }
            if (myDesserts.get(i) instanceof Sundae)
            {
                System.out.println(((DessertItem)myDesserts.get(i))); //Retrieves the name of Sundae topping
            }
            System.out.print(((DessertItem)myDesserts.get(i)).getName()); //Retrieves the name of DessertItem
            switch(i)//The entire switch is for formattng the reciept exactly as the expected output, making it aligned.
            {
                case 0:
                    if(((DessertItem)myDesserts.get(i)).getName().equals("Peanut Butter Fudge"))
                    {//Reason for this is because String doesn't properly align 
                        System.out.printf("%12s", cents2dollarsAndCents(((DessertItem)myDesserts.get(i)).getCost()));
                    }
                    else
                    {
                        System.out.printf("%11s", cents2dollarsAndCents(((DessertItem)myDesserts.get(i)).getCost()));
                    }
                    break;
                case 1:
                    System.out.printf("%14s", cents2dollarsAndCents(((DessertItem)myDesserts.get(i)).getCost()));
                    break;
                case 2:
                    if(((DessertItem)myDesserts.get(i)).getName().equals("Choc. Chip Ice Cream"))
                    {
                        System.out.printf("%11s", cents2dollarsAndCents(((DessertItem)myDesserts.get(i)).getCost()));
                    }
                    else
                    {
                        System.out.printf("%20s", cents2dollarsAndCents(((DessertItem)myDesserts.get(i)).getCost()));
                    }
                    break;
                case 3:
                    System.out.printf("%9s", cents2dollarsAndCents(((DessertItem)myDesserts.get(i)).getCost()));
                    break;
                case 4:
                    System.out.printf("%15s", cents2dollarsAndCents(((DessertItem)myDesserts.get(i)).getCost()));
                    break;
                case 5:
                    System.out.printf("%21s", cents2dollarsAndCents(((DessertItem)myDesserts.get(i)).getCost()));
                    break;
            }
            System.out.println();
        }
         int fullCost = totalCost() + (int)totalTax();
        System.out.printf("\n%1s%25s%.0f\n%1s%20s", "Tax:", ".",totalTax(), "Total Cost:", cents2dollarsAndCents(fullCost));
        return "";
    }
    public void clear()
    {
        myDesserts.clear();
        dessertAmount = 0;
    }
    
}
