package arrays;

import java.util.Scanner;

// Creates an inputted array which is displayed as a matrix

public class multiDimensionArrray {
	
	public static void main(String[] args) {
		int[][] nums=new int[3][3];           // [number of columns][number of rows]
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the values for rows and columns");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				nums[i][j]=scn.nextInt();
			}
		}
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(nums[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}