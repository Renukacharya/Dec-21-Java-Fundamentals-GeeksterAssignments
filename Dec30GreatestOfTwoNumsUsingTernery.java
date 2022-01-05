package itsJanuary2022;
import java.util.*;

public class Dec30GreatestOfTwoNumsUsingTernery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result  = (a>b)? a:b;
		System.out.println(result);
		sc.close();
}
}
