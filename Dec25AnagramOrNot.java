package Startithere;
import java.util.*;

public class Dec25AnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String first= sc.nextLine();
        String second= sc.nextLine();
        int arr[]=new int[26];
        boolean is_anagram=true;
        if(first.length()!=second.length()){
            is_anagram=false;
        }
        for(int i=0;i<first.length();i++){
            arr[Character.valueOf(first.charAt(i))-(Character.valueOf('a'))]+=1;
        }
        for(int i=0;i<second.length();i++){
            arr[Character.valueOf(second.charAt(i))-(Character.valueOf('a'))]-=1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                is_anagram=false;
            }
        }
        sc.close();
        System.out.println(is_anagram);
    }
}