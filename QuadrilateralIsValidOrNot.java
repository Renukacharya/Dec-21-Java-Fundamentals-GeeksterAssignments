package Startithere;

import java.util.Scanner;

public class QuadrilateralIsValidOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int S1 = sc.nextInt();
		int S2 = sc.nextInt();
		int S3 = sc.nextInt();
		int S4 = sc.nextInt();
		
		if(S1+S2+S3+S4 == 360)
			System.out.println("Valid Quadrilateral");
		else
			System.out.println("Invalid");
		
		sc.close();
			
	}

}
