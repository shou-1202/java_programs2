import java.util.Scanner;
class income{
public static void main(String[] args){
  int salary, bonus, income; // declaring variables
  Scanner input = new Scanner(System.in); //opening scanner to take input from the user
  System.out.println("Enter salary: ");
  salary = input.nextInt();// taking value of salary from the user
  System.out.println("Enter bonus: ");
  bonus = input.nextInt();// taking value of bonus from the user
  income = salary+bonus;//calculating bonus
  System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+" Hence Total Income is INR "+income);// the output is The salary is INR 15000 and bonus is INR 5000 Hence Total Income is INR 20000
  input.close(); //closing scanner object
}
}