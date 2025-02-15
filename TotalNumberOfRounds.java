import java.util.Scanner;
class TotalNumberOfRounds{
public static void main(String[] args){
 int side1,side2, side3, perimeter; //declaring variables to store the value of sides taken from the user
 Scanner input = new Scanner(System.in);
 System.out.println("Enter value of side 1 in meters:");
 side1 = input.nextInt();//taking value of side1
 System.out.println("Enter value of side 2 in meters:");
 side2 = input.nextInt();//taking value of side2
 System.out.println("Enter value of side 3 in meters:");
 side3 = input.nextInt();//taking value of side3
 perimeter = side1+side2+side3;//calculating perimeter in meter
 int totalDistance = 5*1000;
 int totalNumberOfRounds = totalDistance/perimeter;//calculating total number of rounds
 System.out.println("The total number of rounds the athlete will run is "+ totalNumberOfRounds+" to complete 5 km");// the output is The total number of rounds the athlete will run is 100 to complete 5 km
 input.close();//closing scanner object
}
}