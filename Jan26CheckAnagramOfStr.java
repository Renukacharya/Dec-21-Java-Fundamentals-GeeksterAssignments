package itsJanuary2022;
import java.util.*;
public class Jan26CheckAnagramOfStr {
	static boolean areAnagram(char[] str1, char[] str2)
    {
        int n1 = str1.length;
        int n2 = str2.length;
 
        if (n1 != n2)
            return false;
 
        Arrays.sort(str1);
        Arrays.sort(str2);
 
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;
 
        return true;
    }
 
    /* Driver Code*/
    public static void main(String args[])
    {
        char str1[] = { 'h', 'e', 'l', 'o' };
        char str2[] = { 'o', 'l', 'h', 'e' };
       
        // Function Call
        if (areAnagram(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("Not anagram");
    }


}
