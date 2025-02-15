import java.util.Scanner;
class SimpleInterest{
public static void main(String[] args){
 double principal,rate, time;//declaring variables
 Scanner input = new Scanner(System.in);
 System.out.println("Enter the principal amount:");
 principal = input.nextDouble();//taking input for amount
 System.out.println("Enter rate of interest:");
 rate = input.nextDouble();//taking input for rate of interest
 System.out.println("Enter time in years:");
 time = input.nextDouble();//taking input for time taken
 double simpleInterest  = (principal*rate*time)/100;//calculating simple interest
 System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+" , Rate of Interest "+rate+" and Time "+time);// the output is The Simple Interest is 1800.0 for Principal 50000.0 , Rate of Interest 1.2 and Time 3.0
 input.close();//closing scanner object
}
}