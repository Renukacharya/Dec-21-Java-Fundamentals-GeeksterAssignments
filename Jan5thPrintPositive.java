package itsJanuary2022;
import java.util.*;
public class Jan5thPrintPositive {
	public static void positiveNums(int arr[]){

        for(int i=0;i<arr.length;i++){
            
        	if(arr[i]>=0){
                System.out.print(arr[i]+" ");;
            } else {
                continue;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]= sc.nextInt();
        }
        positiveNums(arr);
sc.close();
    }
}