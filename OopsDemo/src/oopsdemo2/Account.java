package oopsdemo2;
//multilevel inheritance

public class Account {
int accNo;
String name;
public Account(int accNo,String name) {
	this.accNo=accNo;
	this.name=name;
}
void display() {
	System.out.println("**********Account details*********");
	System.out.println("account num : "+accNo);
	System.out.println("account name : "+name);
}
}
