package Day3Assignments;

import java.util.Scanner;

public class DuplicateElementsOfArray {

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
	     System.out.println("Duplicate elements in an array: ");  
		  for(int i = 0; i < arrSize; i++) {  
	           for(int j = i + 1; j < arrSize; j++) {  
	               if(arr[i] == arr[j]) {  
	                   System.out.println(arr[j]);
	               }
	           }  
		 }
	}
}