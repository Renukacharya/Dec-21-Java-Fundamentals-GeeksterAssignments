package itsJanuary2022;

import java.util.Scanner;

public class Jan5thPrintMiddleElement {
	public static int positiveNums(int arr[]){
		int l=0,h=arr.length-1, mid = l+h/2;

        for(int i=0;i<arr.length;i++){
        	mid = l+h/2;
        }
        return mid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(positiveNums(arr));
sc.close();
	}

}
