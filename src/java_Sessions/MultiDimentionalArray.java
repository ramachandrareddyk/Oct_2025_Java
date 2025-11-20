package java_Sessions;

import java.util.Arrays;

public class MultiDimentionalArray {
	
	public static void main(String[] args) {
		int arr[][]=new int[3][4];
		
		System.out.println(arr.length);
		arr[0][0]=3;
		arr[0][1]=5;
		arr[0][2]=7;
		arr[1][0]=2;
		arr[1][1]=4;
		arr[1][2]=6;
		
		
		//System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[1][0]);//2
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
