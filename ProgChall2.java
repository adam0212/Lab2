
import java.util.Scanner;
/** 
* ProChall2 class does the following:
 * 1. gets input for first, middle, and last name of user
 * 2. prints out full name by combining names
 * 3. prints out initials by taking first letter of each name
 * @author Adam Shaheen adamhshaheen@gmail.com
 * @version v1.0
 * @since 2/16/2026
 */

public class ProgChall2
{
    public static void main (String[] args) {  
        
        String firstName, middleName, lastName;
        char FIn, MIn, LIn;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        firstName = keyboard.nextLine();
        
        System.out.print("Enter your middle name: ");
        middleName = keyboard.nextLine();
        
        System.out.print("Enter your last name: ");
        lastName = keyboard.nextLine();
        
        FIn = firstName.charAt(0);
        MIn = middleName.charAt(0);
        LIn = lastName.charAt(0);
        
        System.out.println("My name is: " + firstName + " " + middleName + " " + lastName);
        System.out.println("My initials are: " + FIn + MIn + LIn);
        
    }
}