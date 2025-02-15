import java.util.Scanner;
class ChocolateDivisionAmongChildren{
public static void main(String[] args){
 int numberOfChocolates,numberOfChildren;//declaring variables
 Scanner input = new Scanner(System.in);
 System.out.println("Enter number of chocolates:");
 numberOfChocolates = input.nextInt();//taking input for number of chocolates
 System.out.println("Enter number of children:");
 numberOfChildren = input.nextInt();//taking input for number of children
 int numberOfChocolateEachChildGets = numberOfChocolates/numberOfChildren;//calculating chocolate per child
 int remainingChocolate = numberOfChocolates%numberOfChildren; //calculating left chocolates
 System.out.println("The number of chocolates each child gets is "+numberOfChocolateEachChildGets+"  and the number of remaining chocolates are "+remainingChocolate);// the output is The number of chocolates each child gets is 5  and the number of remaining chocolates are 0
 input.close();//closing scanner object
}
}