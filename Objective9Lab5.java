// I will be attempting this lab up untill the first day of class,
//I have at least 8 more mistakes to find, i will re submit this lab as i find
//the solutions.
import java.util.Scanner;

public class Objective9Lab5{

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

    // Part 1:
    // prompt the user to provide one number and store their input in num1
    System.out.println("Please give me a number: ");
     double num1 = kb.nextInt();

    // Part 2:
    // Prompt the user for another number and store their input in num2
    System.out.println("Please give me another number: ");
    double num2 = kb.nextInt();

		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
      // Part 3:
      // Complete this switch, with each case calling one of the methods below,
      // then printing out the result (refer to "Expected Output" below)
			// Don't forget to account for a user accidentally inputting an invalid number!

      switch (selection) {
        case 1:
         System.out.println(num1 + " + " + num2 +  " = " + findSum();{
         break;
}
        case 2:
         System.out.println("The average of " + num1 + " + " + num2 + " = " + findAverage()); {
          break;
}
        case 3:
         System.out.println("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is " + calcTax(); {
           break;
}
         default:
          System.out.println("this is not a valid selection"); {
          break;
        }
      }



		}
		kb.close();

	}

	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

	public static double findSum(double num1, double num2) {
		double sum = num1 + num2;
		return sum;
	}
  // Part 4:
  // Write a method named "findAverage" that takes two doubles as parameters,
  // and returns a double that represents the average of the two parameters.
  // Use the "findSum" method as an example.
  public static void findAverage(double num1, double num2) {
    double sum = num1 + num2;
    return sum;
    System.out.println(sum / 3);
  }

	// Part 5:
  // Write a method named "calcTax" that also takes two doubles as parameters,
  // and returns a double that represents the amount of tax the user would have
  // to pay based on the total of the two parameters. Use a tax rate of 8.31%
  // (Not a grand total, just the total taxes.  Refer to "Expected Output")
  public static void calcTax(double num1, double num2) {
    double sum = num1 + num2;
		return sum;
    System.out.println(sum*8.31);
  }



}
}
