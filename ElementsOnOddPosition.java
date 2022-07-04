package Day3Assignments;

import java.util.Scanner;

public class ElementsOnOddPosition {

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
		System.out.println("Elements of an array present on odd position: ");  
	    for (int i = 0; i < arr.length; i = i+2) {  
	    	System.out.println(arr[i]); 
	    }
	}
}
