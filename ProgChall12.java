
import java.util.Scanner;
/** 
* ProChall12 class does the following:
 * 1. gets input for city name
 * 2. prints out number of characters in name
 * 3. prints out name in uppercase
 * 4. prints out name in lowercase
 * 5. prints out first character of name
 * 
 * @author Adam Shaheen adamhshaheen@gmail.com
 * @version v1.0
 * @since 2/16/2026
 */

public class ProgChall12
{
    public static void main (String[] args) {  
        
        String City, Cityupper, Citylower;
        char first;
        int Citychars;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a city: ");
        City = keyboard.nextLine();
        
        Citychars = City.length();
        Cityupper = City.toUpperCase();
        Citylower = City.toLowerCase();
        first = Citylower.charAt(0);
        
        System.out.println("The city entered has: " + Citychars + " chars");
        System.out.println("In upper case: " + Cityupper);
        System.out.println("In lower case: " + Citylower);
        System.out.println("First character: " + first);
        
    }
}