package com.demo.beans;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {3,5,1,2,34,23,7,89,0,4};
		System.out.println("Before : ");
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("After : ");
		System.out.println(Arrays.toString(arr));

	}

	private static void selectionSort(int[] arr) {
		int n = arr.length-1;
		for(int i=0; i<n; i++)
		{
			int min = i;
			for(int j=i+1; j<n; j++)
			{
				if(arr[j]<arr[min])
				{
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
	}

}
