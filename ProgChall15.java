
import java.util.Scanner;
/** 
* ProChall15 class does the following:
 * 1. gets input for the number of shares purchased
 * 2. gets input for the price per shares
 * 3. prints out the total cost of the shares
 * 4. prints out the cost of the commission
 * 5. prints out the total cost including the commission
 * 
 * @author Adam Shaheen adamhshaheen@gmail.com
 * @version v1.0
 * @since 2/16/2026
 */

public class ProgChall15
{
    public static void main (String[] args) {  
        final double COMM_RATE = 0.02;
        double pricepershare, totalcostshares, commission, total;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter number of shares purchased: ");
        total = keyboard.nextDouble();
        
        System.out.print("Enter price per share: $");
        pricepershare = keyboard.nextDouble();
        
        totalcostshares = pricepershare*total;
        commission = totalcostshares*COMM_RATE;
        total = totalcostshares + commission;
    
        System.out.print("Total cost of shares are: $" + totalcostshares +
        "\nCommission cost is: $" + commission + "\nTotal Cost is: $" + total);

    }
}