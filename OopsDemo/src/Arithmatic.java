/*
 * 
 */
public class Arithmatic {
	public static void main(String[] args) {
		// Variable Declaration & Initialization
        int a=20,b=30,sum,sub,mul;
        float div,div2;
       
        //process/computation statements
        sum=a+b;
        sub=a-b;
        mul=a*b;
        div=a/b;
        div2=(float)a/b;
       
        // Output statements
        System.out.println("The Addition of "+ a + " and "+b+ " is : "+sum);
        System.out.println("The Subtraction of "+ a + " and "+b+ " is : "+sub);
        System.out.println("The Multiplication of "+ a + " and "+b+ " is : "+mul);
        System.out.println("The Division of "+ a + " and "+b+ " is : "+div+div2);
	}

}
