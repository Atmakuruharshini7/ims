/*
 * vowels printing in a given string
 */
package Basics;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the statement: ");
		
		String b=s.nextLine();
		s.close();
        int count=0;
       
        for(int i=0;i<b.length();i++)
        {
            if(b.charAt(i) =='a' || b.charAt(i) =='e' || b.charAt(i) =='i' ||
                    b.charAt(i) =='o' || b.charAt(i) =='u')
            {
                count+=1;
                System.out.println("Vowel found : "+b.charAt(i));
            }
           
        }
        System.out.println("Total no. of vowels in string :"+count);

	}

}
