
package com.question2;
import java.util.Scanner;
public class Arithmetic {


		public static void main(String[] args) {
			int n1,n2;
			try (// Create a new Scanner object
			Scanner print = new Scanner(System.in)) {
				System.out.println("enter your choice");
				System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division ");
				int select=print.nextInt();


				System.out.println("enter the first no");
				n1=print.nextInt();

				System.out.println("enter the seond no");
				n2=print.nextInt();


				//using switch statement
				switch(select)
				{
				case 1:
					System.out.println(" Addition of " +n1+ " and " +n2+ " is " +(n1+n2));
					break;

				case 2:
					System.out.println(" Subraction of " +n1+ " and " +n2+ " is " +(n1-n2));
					break;

				case 3:
					System.out.println(" Multiplication of " +n1+ " and " +n2+ " is " +(n1*n2));
					break;

				case 4:
					System.out.println(" Division of " +n1+ " and " +n2+ " is " +(n1/n2));
					break;

				}
			}	

	}

	}




