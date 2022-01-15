package itsJanuary2022;

public class Jan4thPrintFibbonacci {
	static int fibbo(int n)
    {
    if (n <= 1)
       return n;
    return fibbo(n-1) + fibbo(n-2);
    }
      
    public static void main (String args[])
    {
    int n = 9;
    System.out.println(fibbo(n));
    }
}