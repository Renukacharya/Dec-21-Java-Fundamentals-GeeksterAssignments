package itsJanuary2022;

import java.util.Scanner;

public class Jan5thPrintPrimes {
	public static void printALlPrime(int arr[]){
		 for(int i=0;i<arr.length;i++){
			 if(arr[i]%2 != 0) {
				 System.out.println("Prime nums are:" + arr[i]);
			 }else{
				 continue;
			 }
		 }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]= sc.nextInt();
        }
       printALlPrime(arr);

	}

}
