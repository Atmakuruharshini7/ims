package Basics;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int a,b,res;
        String op;
        Scanner   s=new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Enter Operator :");
        op=s.next();
        
        s.close();
        
        switch(op)
        {
        case "+": res=a+b;
        	System.out.println("additon "+res);
        	break;
        case "-": res=a-b;
        	System.out.println("subtraction "+res);
        	break;
        case "*" : res=a*b;
        	System.out.println("multiplication "+res);
        	break;
        case "/" : res=a/b;
        	System.out.println("division "+res);
        	break;
        default:System.out.println(" invalid operator");
        	break;
        }
	}

}
