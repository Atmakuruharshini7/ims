/* Program to demonstrate various in-built Array Functions*/
package Basics;

import java.util.Arrays;

public class ArrayFunctionsDemo {

	public static void main(String[] args) {
		int[] n1= {2,3,4,12,12,-2};
	    int[] n3=new int[5];
	     int[] n2=new int[n1.length];
	       
	        System.out.println("Display Array contents without Loop:");
	        System.out.println("n1 = "+Arrays.toString(n1));
	        System.out.println("Display Array contents with Enhanced For Loop:");
	        
	        for(int i:n1)
	        {
	            System.out.print(i+" ");
	        }
	        System.out.println();


	}

}
