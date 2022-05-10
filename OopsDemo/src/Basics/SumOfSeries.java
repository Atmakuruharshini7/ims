/*package Basics;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N,i=0,sum=0;
		System.out.println("enter the value of N : ");
		N=s.nextInt();
		while(i<=N) {
			sum=sum+i;
			i+=1;
		}
		System.out.println("sum of the series : "+sum);
		

	}

}
*/
package Basics;
import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N,i=10,sum=0;
		System.out.println("enter the value of N : ");
		N=s.nextInt();
		while(i<=N) {
			sum=sum+i;
			i=i-1;
		}
		System.out.println("sum of the series : "+sum);
		

	}

}