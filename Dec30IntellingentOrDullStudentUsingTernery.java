package itsJanuary2022;
import java.util.*;
public class Dec30IntellingentOrDullStudentUsingTernery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		String result = (marks>75)? "Intelligent":(marks<75 && marks>35)? "Average":"Dull";
		System.out.println(result);
		sc.close();
	}

}
