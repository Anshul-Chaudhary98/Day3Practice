package Day3Assignments;

import java.util.Scanner;

public class FrequencyOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size, i, j, count;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the ArraySize: ");
		size = sc.nextInt();
		int[] arr = new int[size];
		int[] freq = new int[size];

		System.out.println("Enter the elements of an Array: ");

		for(i=0; i<size; i++){
		arr[i] = sc.nextInt();
		freq[i] = -1;
		}

		for(i=0; i<size; i++){
			count = 1;
			for(j=i+1; j<size; j++){
				if(arr[i]==arr[j])
				{
					count++;
					freq[j] = 0;
					}
				}
			if(freq[i] != 0){
				freq[i] = count;
			}
		}
		System.out.println("Frequency of all the elements in an Array: ");
		for(i=0; i<size; i++){
			if(freq[i] != 0){
				System.out.println(arr[i] + " occurs " + freq[i] + " times");
			}
		}
	}
}