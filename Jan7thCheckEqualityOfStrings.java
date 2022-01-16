package itsJanuary2022;
import java.util.*;
public class Jan7thCheckEqualityOfStrings {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Str1");
        String a= sc.nextLine();
        
        System.out.println("Str2");
        String b= sc.nextLine();
        //Concatenate
      
       if(a.equals(b)) {
    	   System.out.println("Equal");
       }else
    	   System.out.println("Not Equal");
    sc.close();	   
       }

}
