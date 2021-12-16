package Startithere;

import java.util.Scanner;

public class TriangleIsValidOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int S1 = sc.nextInt();
		int S2 = sc.nextInt();
		int S3 = sc.nextInt();
		
		if(S1+S2>S3 || S2+S3>S1 || S3+S2>S1)
			System.out.println("Triangle is valid");
		else
			System.out.println("Invalid");
		sc.close();
	}

}
