package itsJanuary2022;
import java.util.*;
public class Jan5thSumOfAllElementsInArray {
	public static int sumofelements(int arr[]){
        int sum=0;
        int size = arr.length;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int mark[]=new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            mark[i]= sc.nextInt();
        }
        System.out.println(sumofelements(mark));
        sc.close();
    }
}