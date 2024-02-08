package Practice;

import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a first number:");
		int a=sc.nextInt();
		
		System.out.println("Enter a second number:");
		int b=sc.nextInt();
		
		System.out.println("Before swapping two numbers:"+a+" "+b);
		
		int x=a;
		    a=b;
		    b=x;
		    
		    System.out.println("After swapping two numbers:"+a+" "+b);

	}

}
