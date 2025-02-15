import java.util.Scanner;
class MaximumNumberOfHandshakes{
public static void main(String[] args){
 int numberOfStudents,maximumNumberOfHandshakes;//declaring variables
 Scanner input = new Scanner(System.in);
 System.out.println("Enter number of students:");
 numberOfStudents = input.nextInt();//taking input for number of students 
 maximumNumberOfHandshakes  = (numberOfStudents*(numberOfStudents-1))/2;//calculating maximum possible number of handshakes
 System.out.println("The maximum possible number of handshakes is "+maximumNumberOfHandshakes +" for number of student is "+numberOfStudents);// the output is The maximum possible number of handshakes is 1225 for number of student is 50
 input.close();//closing scanner object
}
}