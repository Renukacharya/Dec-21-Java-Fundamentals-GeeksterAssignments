package itsJanuary2022;

public class Jan6DifferenceOfTwoArrays {
	public static void diffArrays(int a1[], int a2[]) {
		int arr[] =new int[a1.length];
		for(int i=0;i<a1.length;i++) {
			arr[i]= Math.abs(a1[i]-a2[i]);
		}
		for(int i=0;i<a1.length;i++) {
		System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {1,2,3,4,5,6,7};
		int[] a2= {9,8,7,6,5,4,3};
		diffArrays(a1,a2);

	}

}
