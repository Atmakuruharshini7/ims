package oopsdemo3;
abstract class Animal
{
public void eat() {
	System.out.println("i can eat");
}
abstract void makeSound();//abstract method
}
class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("bark bark");
	}
}

class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("moew moew");
	}

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("i can eat");
	}
}
public class AnimalAbstractionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Animal a=new Animal();
Dog d1=new Dog();
d1.makeSound();
d1.eat();
Cat c1=new Cat();
c1.makeSound();
c1.eat();
	}

}
