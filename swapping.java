import java.util.Scanner;
class swapping{
public static void main(String[] args){
  int number1, number2; // declaring variables
  Scanner input = new Scanner(System.in); //opening scanner to take input from the user
  System.out.println("Enter number 1: ");
  number1 = input.nextInt();// taking value of salary from the user
  System.out.println("Enter number 2: ");
  number2 = input.nextInt();// taking value of bonus from the user
  int temp;//creating temporary variable to swap 2 numbers
  temp = number1;
  number1 = number2;
  number2 = temp;//swapping 2 numbers
  System.out.println("The swapped numbers are "+number1+" and "+number2);// the output is The swapped numbers are 6 and 5
  input.close(); //closing scanner object
}
}