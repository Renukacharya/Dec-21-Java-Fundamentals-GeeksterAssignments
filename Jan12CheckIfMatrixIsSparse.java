package itsJanuary2022;

public class Jan12CheckIfMatrixIsSparse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,0},{0,5,0},{0,0,9}};
		int temp =0;
    	for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            	if(arr[i][j] == 0) {
            		temp++;
            	}
            }
    	}
    	if(temp>9/2)
    		System.out.print("Matrix is sparse");
    	else
    		System.out.print("Matrix is not a sparse one");
    	

	}

}
    	
