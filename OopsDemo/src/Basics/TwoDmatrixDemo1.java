package Basics;

public class TwoDmatrixDemo1 {

	public static void main(String[] args) {
		// declare 2d array/matrix
        int a[][]= { {11,22,33},
                     {22,33,44},
                     {77,11,66}
                    } ;
       
        int b[][]= { {44,11,22},
                     {22,33,44},
                     {11,22,33}
                } ;
       
        int c[][]=new int[3][3]; // matrix with 3 rows & 3 cols
       
        //addition of 2 Matrices
        System.out.println("Matrix after addition : ");
        for(int i=0;i<3;i++) {
        	for(int j=0;j<3;j++) {
        		c[i][j]=a[i][j]+b[i][j];
        		System.out.println(c[i][j]+"");
        	}
        	System.out.println();
        }
	}

}
