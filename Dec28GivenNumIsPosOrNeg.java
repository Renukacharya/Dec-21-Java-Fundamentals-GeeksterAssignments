package Startithere;

import java.util.Scanner;

public class Dec28GivenNumIsPosOrNeg {
	public static String PosNeg(int num) {
		String a;
		if(num>0) {
			a="Positive";
		}
		else {
			a="Negative";
		}
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//write a method to print whether given number is positive or negative .
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int eon = sc.nextInt();
		String result = PosNeg(eon);
		System.out.println(result);
		
		sc.close();

	}

}
