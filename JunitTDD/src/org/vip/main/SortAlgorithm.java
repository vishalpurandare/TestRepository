package org.vip.main;

public class SortAlgorithm {

	public static int[] bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = false;
				}
				if(flag) {
					continue;
				}
			}
		}
		return arr;
	}

	
	public static int[] selectionSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	
	public static int[] insertionSort(int[] arr) {
			
		return arr;
	}
	
	
	
}
 