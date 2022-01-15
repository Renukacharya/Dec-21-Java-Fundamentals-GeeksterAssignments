package itsJanuary2022;

public class Jan6BinaryToDecimal {
	static int binToDec(int n) {
		int num= n;
		int decimal=0;
		int base = 1;//initialize to 2^0;
		int temp = num;
		while(temp>0) {
			int last_digit = temp%10;
			temp /= 10;
			decimal += last_digit*base;
			base*=2;
		}
		return decimal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000;
		System.out.println(binToDec(n));
	}

}
