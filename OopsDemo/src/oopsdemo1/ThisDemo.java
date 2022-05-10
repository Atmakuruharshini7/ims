package oopsdemo1;

public class ThisDemo {
	int age;
	void init(int age) {
		this.age=age;//this keyword refers o current object which invokes the method
	}

	public static void main(String[] args) {
		ThisDemo td1=new ThisDemo();
		td1.init(20);
		System.out.println("the value of age is : "+td1.age);

	}

}
