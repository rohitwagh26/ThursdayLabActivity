package com.Programs;

public class Program5 extends Thread {
	public void run()  
	{
		System.out.println(" priority are");
	}
	

	public static void main(String[] args) {
		Program5 th = new Program5();  
		Program5 th2 = new Program5(); 
		
		th.setPriority(6);  
		th2.setPriority(3);
		System.out.println("Priority of the thread th is " + th.getPriority());
		System.out.println("Priority of the thread th2 is : " + th2.getPriority()); 
		
		
		System.out.println("Currently Executing The Thread is " + Thread.currentThread().getName());  
		  
		System.out.println("Priority of the main thread is " + Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(10);  // setting new priority to main thread
		  
		System.out.println("Priority of the main thread is now  : " + Thread.currentThread().getPriority());  
		}  
	}
