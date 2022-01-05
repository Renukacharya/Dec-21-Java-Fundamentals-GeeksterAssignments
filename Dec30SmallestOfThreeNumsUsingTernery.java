package itsJanuary2022;
import java.util.*;
public class Dec30SmallestOfThreeNumsUsingTernery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int result = (a<b && b<c)? a:(b<a && b<c)? b:c;
		System.out.println(result);
		sc.close();
	}

}
