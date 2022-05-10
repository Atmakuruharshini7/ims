package oopsdemo2;
//parent /base/super class
class Animal
{
	String name;//properties
	
	public void eat()//methods
	{
		System.out.println("i can eat");
	}
}
//inherits animal class
//child/sub/derived class
class Dog extends Animal
{
	public void display()
	{
		System.out.println("my name is : "+name);
	}
}
public class SinglrInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create and initialize object of sub class
		Dog labrador=new Dog();
		//access field of super class
		labrador.name="Zimba";
		//call method of derived class
		labrador.display();
		//call method of super class using derived class object
		labrador.display();
		//call method of super class using derived class object
		labrador.eat();
		
		
	}

}
