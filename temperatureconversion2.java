import java.util.Scanner;
class temperatureconversion2{
public static void main(String[] args){
  double farenheit; // declaring variables
  Scanner input = new Scanner(System.in); //opening scanner to take input from the user
  System.out.println("Enter temperature in farenheit: ");
  farenheit = input.nextDouble();// taking value of temperature in farenheit from the user
  double celsiusResult = (farenheit-32)*5/9; //declaring another variable to store the result
  System.out.println("the "+farenheit+" farenheit in celsius is "+celsiusResult+" celsius");// the output is the 32.0 farenheit in celsius is 0.0 celsius
  input.close(); //closing scanner object
}
}