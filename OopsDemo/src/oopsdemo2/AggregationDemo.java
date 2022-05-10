package oopsdemo2;

public class AggregationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address ad1=new Address("bengaluru","karnataka","india",566016);
Address ad2=new Address("pradeep","austin","czech",233032);

Student s1=new Student(111,"hari",ad1);
Student s2=new Student(111,"safaari",ad2);
s1.display();
s2.display();
	}

}
