package ExceptionsDemo;

public class ThroeDemo {
	public static void hello(int a)
    {
        if(a==0)
            throw new ArithmeticException("e");// exception thrown manually
        else
            System.out.println(a);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
hello(100);
hello(0);
	}

}
