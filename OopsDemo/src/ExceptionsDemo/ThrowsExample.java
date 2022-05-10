package ExceptionsDemo;

import java.io.IOException;

public class ThrowsExample {
	
	void myMethod(int a) throws IOException,ArithmeticException{
		if(a==1)
			throw new IOException("IO exeception occured ");
		else
			throw new ArithmeticException("Arithmetic Exception");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExample t=new ThrowsExample();
	       
        try {
            t.myMethod(1);
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }
	}

}
