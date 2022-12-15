package com.java.collections;

public class Jagged_Array_Example {

	public static void main(String[] args) {
		//datatype[][] name_array = {{},{},{},{}};
		
		int [][] array1 = {{1,2,3,4},
							{5,6,7,9},
							{3,7,5,8,0}};
		
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1[i].length;j++)
			{
				System.out.print(array1[i][j]+"   ");
			}
		}
	}

}
