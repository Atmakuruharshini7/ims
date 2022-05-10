package Basics;

public class JumpStatements {

	public static void main(String[] args) {
		/*int i,sum=0,n=100;
		for(i=1;i<=n;i++) {
			sum=sum+i;
			System.out.println("number "+sum);
			if(sum==6) {break;}
		}
		System.out.println(sum);
		*/
		int j;
		for(j=1;j<=10;j++)
        {
            if(j==6)
            {
                continue; // Skips the current Iteration
            }
            System.out.println(j + " Java");
        }


	}

}
