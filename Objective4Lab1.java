import java.util.Scanner;

  public class Objective4Lab1 {
    public static void main(String[] args) {

    Scanner Keyboard = new Scanner(System.in);
    System.out.println("What is your first name?");
    String fname = Keyboard.nextLine();
    System.out.println("What is your last name?");
    String lname = Keyboard.nextLine();
    System.out.println("what is your favorite animal?");
    String fanimal = Keyboard.nextLine();
    System.out.println("what is your favorite food?");
    String ffood = Keyboard.nextLine();
    System.out.println("what is your favorite song?");
    String fsong = Keyboard.nextLine();
    System.out.println("My name is " + fname + " " + lname);
    System.out.println("My favorite animal is the " + fanimal);
    System.out.println("My favorite food is " + ffood);
    System.out.println("My favorite song is " + fsong);



  }
}
