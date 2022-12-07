package com.question3;
public class PrintPattern {

	public static void main(String[] args) {
		  int rows = 5, num= 1;

		    for(int i = 1; i <= rows; i++)
		    {

		      for(int j = 1; j <= i; j++)
		      {

		        System.out.print(num + " ");
		        ++num;
		        // Number will increment by 1

		      }

		      System.out.println();
		      //for next line
		    }

	}

}
