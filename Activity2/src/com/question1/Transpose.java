package com.question1;

import java.util.Scanner;

public class Transpose {
	
	 
	public static void main(String []args)
    {
      
        try (Scanner sc = new Scanner(System.in)) {
			int m,n;                 
			
			System.out.println("Enter the number of rows: \n");
			m=sc.nextInt();  
			
			System.out.println("Enter the number of column: \n");
			n=sc.nextInt();  
			int arr[][]=new int[10][10];       
			
			System.out.println("Enter the elements of the matrix: ");
			for(int i=0;i<m;i++)   
			{
			   for(int j=0;j<n;j++)
			   {
			        arr[i][j]=sc.nextInt();
			   }
			}
			
			//Print the original Matrix
			System.out.println("The elements in the original matrix are: ");
			for(int i=0;i<m;i++)     //Print the matrix
			{
			    for(int j=0;j<n;j++)
			    {
			         System.out.print(arr[i][j]+" ");
			    }
			   System.out.println("");
      }
      
      //Print the transpose matrix 
      System.out.println("After transposing the elements are...");
      for(int i=0;i<m;i++)      
      {
			    for(int j=0;j<n;j++)
			    {
			        System.out.print(arr[j][i]+" ");
			    }
			   System.out.println("");
      }
		}
        
    }
}