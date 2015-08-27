package test.java;

import main.java.SortAlgorithm;

import org.junit.Assert;
import org.junit.Test;

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
        int[] arr = {3, 1, 4, 2, 54, 7, 89};
        int[] checkArr = {1, 2, 3, 4, 7, 54, 89};
        int[] newArr = SortAlgorithm.selectionSort(arr);
        Assert.assertArrayEquals(checkArr, newArr);
    }
   
    @Test
    public final void testInsertionSort() {
        int[] arr = {3, 1, 4, 2, 45, 7, 89};
        int[] checkArr = {1, 2, 3, 4, 7, 45, 89};
        int[] newArr = SortAlgorithm.insertionSort(arr);
        Assert.assertArrayEquals(checkArr, newArr);
    }
   
    @Test
    public final void testMergeSort() {
        int[] arr = {3, 1, 4, 32, 2, 88, 45, 7, 89, 123};
        int[] checkArr = {1, 2, 3, 4, 7, 32, 45, 88, 89, 123};
        int[] newArr = SortAlgorithm.mergeSort(arr, 0, arr.length-1);
        Assert.assertArrayEquals(checkArr, newArr);
    }
   
    @Test
    public final void testQuickSort() {
        int[] arr = {3, 1, 4, 32, 2, 88, 45, 7, 89, 123};
        int[] checkArr = {1, 2, 3, 4, 7, 32, 45, 88, 89, 123};
        int[] newArr = SortAlgorithm.quickSort(arr);
        Assert.assertArrayEquals(checkArr, newArr);
    }
   
}