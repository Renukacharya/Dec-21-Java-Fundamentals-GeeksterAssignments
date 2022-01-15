package itsJanuary2022;

public class Jan6LastIndexOfElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,3,2,3,2,2,2};
		int n = 2;
		boolean isPresent=false;
        int pos=-1;
        for (int i = 0; i < num.length; i++) {
            if(num[i]==n){
                isPresent=true;
                pos=i;
            }

        }
        if (isPresent){
            System.out.println("Item is present at "+pos+"  index");
        }
        else{
            System.out.println("Absent");
        }
    }
}