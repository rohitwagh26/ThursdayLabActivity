package com.Programs;

import java.util.Scanner;

public class Program6 {
 
	public static void main(String[] args) {
	

		        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter the number to search for: ");
		        int search = input.nextInt();
		        boolean found = false;

		        for(int i = 0; i < array.length; i++) {
		            if(array[i] == search) {
		                System.out.println("Number found at index " + i);
		                found = true;
		                break;
		            }
		        }

		        if(!found) {
		            System.out.println("Number not found in array.");
		        }
		    }
		

	}