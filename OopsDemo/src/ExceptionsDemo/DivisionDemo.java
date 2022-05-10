package ExceptionsDemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a, b, result;
         Scanner input = new Scanner(System.in);
        
          System.out.println("Input two integers");
          a = input.nextInt();
          b = input.nextInt();  // enter 0
         try {// statements to be monitored which may throw exception
         result = a / b;  // Throws Arithmetic exception
        
         System.out.println("Result = " + result);
         input.close();
	}
	
	
	
	catch(ArithmeticException e)
         {
		System.out.println("divivde by zero error");
		System.out.println("Exceotion Description : "+e.getMessage());
		System.out.println("exception name&description : "+e.toString());
		e.printStackTrace();
	}
	finally {
		input.close();
		System.out.println("in finally block-program execution ended");
	}

}
}
