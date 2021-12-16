package Startithere;
import java.util.*;

public class MaximumOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c)
			System.out.println("a is Max");
		else if(b>c && b>a)
			System.out.println("b ia Max");
		else
			System.out.print("c is Max");
		
		sc.close();
	}

}
