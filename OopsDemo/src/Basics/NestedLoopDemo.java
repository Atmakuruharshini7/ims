package Basics;

public class NestedLoopDemo {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"\t");
			}
			System.out.println();
		}

	}

}
