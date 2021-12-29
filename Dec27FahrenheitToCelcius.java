package Startithere;

import java.util.Scanner;

public class Dec27FahrenheitToCelcius {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
	        System.out.println("enter the temperature in Fahrenheit");
	        int a= sc.nextInt();
	        double b= (a-32)/1.8;

	        System.out.println("Celcius value of this is : "+b);
	        sc.close();
	    }
	}
