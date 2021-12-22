package Startithere;
import java.util.*;
public class Week2ArrayOfSize5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		   Scanner sc = new Scanner(System.in);
		   System.out.println("enter 5 array elements:");
		   
		   for(int i=0; i<5; i++)
			    arr[i]=sc.nextInt();
		   
		   for (int element: arr) {
	            System.out.print(element);
	            
		 }
		   sc.close();
}
}
