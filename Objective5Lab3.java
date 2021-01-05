import java.util.Scanner;

 public class Objective5Lab3 {
   public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int usernum;

    System.out.println("Please enter a number: ");
    usernum = scanner.nextInt();

    if(usernum > 0) {
    System.out.println("The number is positive");
    }
     else if(usernum < 0) {
     System.out.println("The number is negative");
     }

      else {
    System.out.println(usernum + " The number is neither positive nor negative");
    }

  }
}
