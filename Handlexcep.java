package pkg;

import java.util.Scanner;

public class Handlexcep {
	
public static void main(String[] args) {

	int a,b,c;
	try {// try catch are needed to handle the exception in the exception handling we can also 
		//do the Exception Handling with the "Throws" Keyword...
		
			Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter the number a");
			a=sc.nextInt();

			  System.out.println("Enter the number b");
		b=sc.nextInt();
		c=a/b;    //Exception Occur Here which is AIRTHMETIC EXCEPTION... 
	    System.out.println(c);
	}catch(Exception e) {// Here SUPER Class Which is Exception is used to handle it.
		System.out.println(e);
	}
    
}

}
