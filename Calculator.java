/*
 * File Name: Calculator.java
 * Bonus HW Building a calculator 
 * Unconditionally add / subtract / multiply / divide 2 numbers
 * CS112 SAC Irvin Martinez 
 */
import java.util.Scanner;// to get user input


public class Calculator{
	static double op = 0;
	static Scanner scan = new Scanner(System.in);
	static double num1;
	static double num2;
	static double answer;
	
	public static void main(String[] args){// entry point for java program
		do{	
		System.out.println("1 for Addition. 2 for Subtraction. 3 for Multiplication. 4 for Division");
		op = scan.nextInt();
		}while(op<1 && op>4);
		
		if(op == 1){
			System.out.println("Input your first number");
			num1 = scan.nextDouble();
			System.out.println("Input your second number");
			num2 = scan.nextDouble();	
			answer = num1 + num2;
			System.out.println(answer);
			
		}
		if(op == 2){
			System.out.println("Input your first number");
			num1 = scan.nextDouble();
			System.out.println("Input your second number");
			num2 = scan.nextDouble();	
			answer = num1 - num2;
			System.out.println(answer);
		}
		if(op == 3){
			System.out.println("Input your first number");
			num1 = scan.nextDouble();
			System.out.println("Input your second number");
			num2 = scan.nextDouble();	
			answer = num1 * num2;
			System.out.println(answer);
		}
		if(op == 4){
			System.out.println("Input your first number");
			num1 = scan.nextDouble();
			System.out.println("Input your second number");
			num2 = scan.nextDouble();		
			answer = num1/num2;
			System.out.println(answer);
		}
		
	}
	
}
