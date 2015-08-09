package org.vip.main;

public class SortAlgorithm {

	/**
	 * Bubble sort: repeatedly compare neighbor pairs and swap if necessary.
	 * 
	 * @param arr
	 * @return Scan the array, swapping adjacent pair of elements if they are
	 *         not in relative order. This bubbles up the largest element to the
	 *         end. Scan the array again, bubbling up the second largest
	 *         element. Repeat until all elements are in order.
	 */
	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = i; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = false;
				}
				if (flag) {
					continue;
				}
			}
		}
		return arr;
	}

	/**
	 * Selection sort: repeatedly pick the smallest element to append to the
	 * result.
	 * 
	 * @param arr
	 * @return Find the smallest element, and put it to the first position. Find
	 *         the next smallest element, and put it to the second position.
	 *         Repeat until all elements are in the right positions.
	 *
	 */
	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	/**
	 * Insertion sort: repeatedly add new element to the sorted result.
	 * 
	 * @param arr
	 * @return Take the first element as a sorted sub-array. Insert the second
	 *         element into the sorted sub-array (shift elements if needed).
	 *         Insert the third element into the sorted sub-array. Repeat until
	 *         all elements are inserted.
	 *
	 */
	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j;
			for (j = i; j > 0; j--) {
				if (arr[j - 1] < temp) {
					break;
				}
				arr[j] = arr[j - 1];
			}
			arr[j] = temp;
		}
		return arr;
	}

	/**
	 * Merge sort: divide and conquer
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			arr = merge(arr, low, mid, high);
		}
		return arr;
	}

	private static int[] merge(int[] arr, int low, int mid, int high) {
		int tempArr[] = new int[arr.length];

		for (int l = low; l <= high; l++) {
			tempArr[l] = arr[l];
		}

		int i = low;
		int j = mid + 1;
		int k = low;

		while (i <= mid && j <= high) {
			if (tempArr[i] <= tempArr[j]) {
				arr[k] = tempArr[i];
				i++;
			} else {
				arr[k] = tempArr[j];
				j++;
			}
			k++;
		}

		while (i <= mid) {
			arr[k] = tempArr[i];
			i++;
			k++;
		}
		return arr;
	}

	
	
	public static int[] quickSort(int arr[]) {

		return arr;
	}
	
}
