package itsJanuary2022;
import java.util.*;
public class Jan3rdKthBItAsSet {
	static int setKthBitAsSet(int n, int k)
	{
	    return ((1 << k) | n);
	}

	// Driver code
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(), k = sc.nextInt();
	    System.out.print("Kth bit set number = " + 
	                             setKthBitAsSet(n, k));
	sc.close();
	}
	}
