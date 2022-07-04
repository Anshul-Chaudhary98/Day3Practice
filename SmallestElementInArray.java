package Day3Assignments;

import java.util.Scanner;

public class SmallestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the ArraySize: ");
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		 int [] arr = new int [arrSize]; 
	     System.out.println("Elements Of An Array are: ");  
	     for (int i = 0; i < arrSize; i++) {  
	         arr[i] = sc.nextInt(); 
	     }
	   
		 int min = arr[0];  
	        for (int i = 0; i < arrSize; i++) {  
	           if(arr[i] < min)  
	               min = arr[i];  
	        }  
	     System.out.println("Smallest element of an array: " + min);  
	}  
}  