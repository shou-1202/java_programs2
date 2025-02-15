import java.util.Scanner;
class temperatureconversion{
public static void main(String[] args){
  double celsius; // declaring variables
  Scanner input = new Scanner(System.in); //opening scanner to take input from the user
  System.out.println("Enter temperature in celsius: ");
  celsius = input.nextDouble();// taking value of temperature in celsius from the user
  double farenheitResult = (celsius*9/5)+32; //declaring another variable to store the result
  System.out.println("the "+celsius+" celsius in fahrenheit is "+farenheitResult+" farenheit");// the output is the 0.0 celsius in fahrenheit is 32.0 farenheit
  input.close(); //closing scanner object
}
}
  
  