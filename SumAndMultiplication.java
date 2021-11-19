import java.util.Scanner;
public class SumAndMultiplication {
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the first number: ");
     int num1=sc.nextInt();
     System.out.print("Enter the second number: ");
     int num2=sc.nextInt();
	 System.out.print("Enter + or * operater: ");
	 char operater = sc.next ().charAt (0);
     sc.close();
     sumAndMulti(num1,num2,operater); 
   }
    //sum method
   public static void sumAndMulti(int num_1,int num_2, char operater){
     if(operater == '+'){
	 int sum=0;
     sum=num_1 + num_2;
     System.out.println("Sum of two numbers  "+sum);
	 }
	 if(operater == '*') {
	 int multi=0;
     multi=num_1 * num_2;
     System.out.println("Multiplication of two numbers  "+multi);
	 }
   }
		
}