import java.util.Scanner;
class PoundToKilograms{
public static void main(String[] args){
 double weightInPounds,weightInKilogram;//declaring variables
 Scanner input = new Scanner(System.in);
 System.out.println("Enter weight in pounds:");
 weightInPounds = input.nextDouble();//taking input weight in pounds
 weightInKilogram  = weightInPounds*2.2;//calculating weight in kilograms
 System.out.println("The weight of the person in pound is "+weightInPounds +" and in kg is "+weightInKilogram);// the output is The weight of the person in pound is 5.5 and in kg is 12.100000000000001
 input.close();//closing scanner object
}
}