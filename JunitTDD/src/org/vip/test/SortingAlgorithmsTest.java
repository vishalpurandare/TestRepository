package org.vip.test;

import org.junit.Assert;
import org.junit.Test;
import org.vip.main.SortAlgorithm;

public class SortingAlgorithmsTest {

	@Test
	public final void testBubbleSort() {
		int[] arr = {3, 1, 4, 2, 45, 7, 89};
		int[] checkArr = {1, 2, 3, 4, 7, 45, 89};
		int[] newArr = SortAlgorithm.bubbleSort(arr);
		Assert.assertArrayEquals(checkArr, newArr);
	}
	
	@Test
	public final void testSelectionSort() {
		int[] arr = {3, 1, 4, 2, 45, 7, 89};
		int[] checkArr = {1, 2, 3, 4, 7, 45, 89};
		int[] newArr = SortAlgorithm.selectionSort(arr);
		Assert.assertArrayEquals(checkArr, newArr);
	}
	
}
