package Day3Assignments;

import java.util.Scanner;

public class ElementsInReverseOrder {

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
		System.out.println("Elements of an array in reverse order: ");  
	    for (int i = (arrSize - 1) ; i >= 0; i--) {  
	    	System.out.println(arr[i]); 
	    }
	}
}
