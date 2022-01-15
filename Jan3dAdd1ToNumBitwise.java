package itsJanuary2022;

public class Jan3dAdd1ToNumBitwise {
	static int addOneToNum(int x)
    {
        int m = 1;
         
        while( (int)(x & m) >= 1)
        {
            x = x ^ m;
            m <<= 1;
        }
     
        x = x ^ m;
        return x;
    }
     
    public static void main(String[] args)
    {
    	int n=5;
        System.out.println(addOneToNum(n));
    }
}
