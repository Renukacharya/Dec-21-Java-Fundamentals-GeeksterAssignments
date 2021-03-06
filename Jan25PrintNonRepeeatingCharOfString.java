package itsJanuary2022;

public class Jan25PrintNonRepeeatingCharOfString {
	 static final int NO_OF_CHARS = 256;
	    static char count[] = new char[NO_OF_CHARS];
	    
	    static void getCharCountArray(String str)
	    {
	        for (int i = 0; i < str.length(); i++)
	            count[str.charAt(i)]++;
	    }
	 
	    static int firstNonRepeating(String str)
	    {
	        getCharCountArray(str);
	        int index = -1, i;
	 
	        for (i = 0; i < str.length(); i++) {
	            if (count[str.charAt(i)] == 1) {
	                index = i;
	                break;
	               
	            }
	        }
	 
	        return index;
	    }
	 
	    // Driver method
	    public static void main(String[] args)
	    {
	        String str = "Im Charya";
	        int index = firstNonRepeating(str);
	 
	        System.out.println(
	            index == -1 ? "All characters are repeating"
	                : "First non-repeating character is "
	                      + str.charAt(index));
	    }
	

}
