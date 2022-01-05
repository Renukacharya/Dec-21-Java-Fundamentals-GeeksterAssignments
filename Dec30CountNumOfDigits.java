package itsJanuary2022;
import java.util.*;
public class Dec30CountNumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		while(num>0) {
			num/=10;
			count++;
		}
		System.out.println(count);
		sc.close();
	}

}
