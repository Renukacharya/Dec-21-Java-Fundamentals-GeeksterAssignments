package itsJanuary2022;

public class Jan7thCountNoOfAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "C656793harya";
	      int count = 0;
	      System.out.println("String: "+str);
	      for (int i = 0; i < str.length(); i++) {
	         if (Character.isLetter(str.charAt(i)))
	         count++;
	      }
	      System.out.println("Letters: "+count);
	   }
	}
	

