import java.util.Scanner;
class TotalDistanceAndTotalTime{
public static void main(String[] args){
  String name ="Eric";//declaring a variable name
  String fromCity, viaCity, toCity;// declaring variable to to store the distance travelled
  double distanceFromToVia, distanceViaToFinalCity, timeFromToVia, timeViaToFinalCity;//declaring variables to store the value of time taken
  Scanner input = new Scanner(System.in); //opening scanner object
  System.out.println("Enter the city from where the journey starts:");
  //taking input from the user such as distance and time and cities to which he is travelling to
  fromCity = input.nextLine();
  System.out.println("Enter the city via which you will travel:");
  viaCity = input.nextLine();
  System.out.println("Enter the city to which you are travelling:");
  toCity = input.nextLine();
  System.out.println("Enter distance from city to via city:");
  distanceFromToVia = input.nextDouble();
  System.out.println("Enter distance via city to city:");
  distanceViaToFinalCity = input.nextDouble();
  System.out.println("Enter time taken from city to via city:");
  timeFromToVia = input.nextDouble();
  System.out.println("Enter time taken via city to city:");
  timeViaToFinalCity = input.nextDouble();
  double totalDistance = (distanceFromToVia+distanceViaToFinalCity)*1.6;//calculating total distance in kilometers
  double totalTime = (timeFromToVia+timeViaToFinalCity)*60;//calculating total distance in miles
  System.out.println("The Total Distance travelled by " + name +" from "+fromCity+" to "+toCity+" via "+viaCity+" is "+totalDistance+" km and the total time taken is "+totalTime+" minutes");// the output is The Total Distance travelled by Eric from haryana to chennai via madhya pradesh is 1332.96 km and the total time taken is 180.0 minutes
  input.close();//closing scanner object
}
}