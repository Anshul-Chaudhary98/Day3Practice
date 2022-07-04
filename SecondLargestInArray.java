package Day3Assignments;

import java.util.Scanner;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		System.out.print("Enter the ArraySize: ");
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		 int [] arr = new int [arrSize]; 
	     System.out.println("Elements Of An Array are: ");  
	     for (int i = 0; i < arrSize; i++) {  
	         arr[i] = sc.nextInt(); 
	     }
		 for (int i = 0; i < arrSize; i++) {     
	           for (int j = i+1; j < arr.length; j++) {     
	              if(arr[i] > arr[j]) {    
	                  temp = arr[i];    
	                  arr[i] = arr[j];    
	                  arr[j] = temp;    
	              }     
	           }     
	     }     
	     for (int i = 0; i < arrSize; i++) {      
	     }  
	     System.out.println("Second Largest Element is: " + arr[(arrSize-2)]);    
	}

}