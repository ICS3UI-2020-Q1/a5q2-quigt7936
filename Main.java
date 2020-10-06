import java.util.Scanner;
/**
 * Creates a lists of numbers up to a given number
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // get a number from the user
    System.out.println("Please enter a positive integer");
    int userNumber = input.nextInt();
    // create a for loop that counts up to the users number
    for (int i = 0; i < userNumber - 1; i++) {
      // the i + 1 counters the i starting at 0
      System.out.print((i + 1) + ", ");
    }

    // finish the list with the users number
    System.out.print(userNumber);

    
  }
}
