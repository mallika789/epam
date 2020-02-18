import java.util.Scanner;


public class Calculator {
	public static int addition(int a, int b) {
		return a+b;
	}
	public static int multiplication(int a, int b) {
		return a*b;
	}
	public static int subtraction(int a, int b) {
		return a-b;
	}
	public static int division(int a, int b) {
		if(b == 0 || a == 0) {
			return 0;
		}
		else if(b < a) 
			return a/b;
		return b/a;
	}
	public static void main(String[] args) {
		int a, b;
		System.out.println("Enter any two integers :");
		System.out.println("Enter First Number :");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Enter Second Number :");
		b = sc.nextInt();
		System.out.println("Now Press the corresonding key for required operation");
		System.out.println("Press + for Addition");
		System.out.println("Press - for Subtraction");
		System.out.println("Press * for Multiplication");
		System.out.println("Press / for Division");
        char op = sc.next().charAt(0); 
        switch(op) {
         	case '+' :System.out.println("Addition of entered two numbers is: " + addition(a, b));
         			  break;
         	case '-' :System.out.println("Subtraction of entered two numbers is: " + subtraction(a, b));
         			  break;
         	case '*' :System.out.println("Multiplication of entered two numbers is: " + multiplication(a, b));
         			  break;
         	case '/' :System.out.println("Division of entered two numbers is: " + division(a, b));
         		 	  break;
         	default :System.out.println("Please enter a valid operation key!!");
        }
		
	}

}

