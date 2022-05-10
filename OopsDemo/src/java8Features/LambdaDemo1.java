package java8Features;

//functional interface have a single method

@FunctionalInterface
interface MyFI{
	public String sayHello();
	//public String sayHello();
	}


public class LambdaDemo1 {

	public static void main(String[] args) {
		MyFI msg=()->{return "Hello World";};//lambda expression
		System.out.println(msg.sayHello());
	}

}
