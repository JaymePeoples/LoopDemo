import java.util.Scanner;

/**
 * Created by Espanol 2 on 6/28/2017.
 */
public class WhileLoopEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            //will prompt user to see if they would like to continue. If y, it will run the program again
            System.out.println("Continue? (y/n)");
            choice = scan.nextLine();

        }
        System.out.println("Goodbye");
    }
}


