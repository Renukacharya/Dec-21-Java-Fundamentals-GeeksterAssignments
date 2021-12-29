package Startithere;
import java.util.*;
public class Dec24PrintPositiveNumsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num[]=new int[10];
        System.out.println("enter the values");
        for(int j=0;j<10;j++) {
            num[j] = sc.nextInt();
        }
        for(int j=0;j<10;j++){
            if(num[j]>0){
                System.out.print(num[j]+" ");
            }
        }
        sc.close();
    }

	}
