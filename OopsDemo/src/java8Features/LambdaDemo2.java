package java8Features;

public class LambdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NumericTest isEven=(n)->(n%2==0);
NumericTest isNegative=(n)->(n<0);
System.out.println(isEven.computeTest(7));
System.out.println(isNegative.computeTest(-55));

	}

}
