/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Scanner getName = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String userName = getName.nextLine();
        if (userName.toLowerCase().equals("alice")){
            System.out.println("Hello Alice!  We've been waiting for you.");
        } else if (userName.toLowerCase().equals("bob")){
            System.out.println("Hello Bob!  We've been waiting for you.");
        } else {
            System.out.println("Please go away from here.  We only wish to speak with Alice and Bob.");
        }


    }
}
