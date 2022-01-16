package itsJanuary2022;

public class Jan7thCheckIfStringIsPalindrome {

	static boolean isPalindrome(String str)
    {

        int i = 0, j = str.length() - 1;
        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }
 
        return true;
    }
 
    public static void main(String[] args)
    {
        String str = "rarar";
        System.out.print("String 1 :");
        if (isPalindrome(str))
            System.out.print("It is a palindrome");
        else
            System.out.print("It is not a palindrome");
    }
}