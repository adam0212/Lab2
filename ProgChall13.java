
import java.util.Scanner;
/** 
* ProChall13 class does the following:
 * 1. gets input for the meal price
 * 2. prints out the tax amount
 * 3. prints out the tip amount
 * 4. prints out the meal cost with tax and tip
 * 
 * @author Adam Shaheen adamhshaheen@gmail.com
 * @version v1.0
 * @since 2/16/2026
 */

public class ProgChall13
{
    public static void main (String[] args) {  
        final double tax = 0.0675;
        final double tip = 0.2;
        double amount, total, taxAmount, tipAmount;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter meal amount: $");
        amount = keyboard.nextDouble();
        
        taxAmount = tax*amount;
        tipAmount = tip*amount;
        total = tipAmount + taxAmount + amount;
        
        System.out.printf("\nThe tax is: $%,.2f", taxAmount);
        System.out.printf("\nThe tip is: $%,.2f", tipAmount);
        System.out.printf("\nThe meal cost with tax and tip is: $%,.2f", total);
        
    }
}