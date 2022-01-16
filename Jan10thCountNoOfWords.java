package itsJanuary2022;

public class Jan10thCountNoOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	        String s= "check your string";
	        int count=0;
	        count=1;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)==' '){
	                count++;
	            }
	        }
	        System.out.println(count);

	}

}
