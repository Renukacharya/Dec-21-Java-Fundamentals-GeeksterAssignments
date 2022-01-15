package itsJanuary2022;
public class Jan4thVolume {
	    void area(float x)
	    {
	        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
	    }
	    void area(float x, float y)
	    {
	        System.out.println("the area of the rectangle is "+x*y+" sq units");
	    }
	
	
	public static void main(String args[]) 
	{
		Jan4thVolume ob = new Jan4thVolume();
		ob.area(5);
		ob.area(11,12);
	}
}
