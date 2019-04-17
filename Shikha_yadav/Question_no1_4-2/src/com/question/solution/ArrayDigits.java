package com.question.solution;

import java.util.Scanner;

public class ArrayDigits {
	 static int [] arr=new int[5];
	 static int a;
	
	public  void checkArray(){
		
	if(arr[5]==a){
		
	System.out.println("return 1");
	
	}
	else
		System.out.println("return 0");
	
	
}

	public static void main(String[] args) {
		
		ArrayDigits ad=new ArrayDigits();
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter any integer value ");
			a=s.nextInt();
			
			System.out.println("Enter the array");
			
			arr[0]=s.nextInt();
			arr[1]=s.nextInt();
			arr[2]=s.nextInt();
			arr[3]=s.nextInt();
			arr[4]=s.nextInt();
			
			ad.checkArray();
			
		

	}

}
