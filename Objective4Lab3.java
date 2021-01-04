import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthyear = 0, currentYear = 2021;

    Scanner input = new Scanner(System.in);
    System.out.println("how old are you?");
    int age = input.nextInt();


    int birthYear = (currentYear - age);

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
