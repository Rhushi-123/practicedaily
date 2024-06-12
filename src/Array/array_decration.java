package Array;

import java.util.Scanner;

public class array_decration {
	public static void main(String[] args) {
//		// type[] arrName = new type[size];
//		int[] arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//
//		int[] arr1 = { 10, 20, 30 };
//      
//		//type[] arrayName ={10,20,30};
//		System.out.println(arr1.length);
//		
//		for(int i=0 ;i<3;i++) {
//			System.out.println(arr[i]);
//		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A Number");
		int size = sc.nextInt();
		int number[] = new int[size];
		for (int i = 0 ;i<size;i++) {
			
			System.out.println(number[i]);
			
		}
		
	}

}
