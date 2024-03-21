package arrays;

import java.util.Scanner;

public class Multiarr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= new int[3][];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new int[i+1];
		}
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("row="+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter element");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Data from jogged array");
		for (int row[] : arr) {
			for (int col: row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
}
