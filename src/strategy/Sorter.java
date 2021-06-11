package strategy;

import java.util.Comparator;

public class Sorter {
		
	public static <T> void sort(T[] arr, Comparator<? super T> comparator) {
		int i, j;
		for(i=0; i<arr.length-1; i++) {
			int minPos = i;
			
			for(j=i+1; j<arr.length; j++) {
				minPos = comparator.compare(arr[j], arr[minPos]) < 0 ? j : minPos;
			}
			
			swap(arr, i, minPos);
		}
	}
	
	private static <T> void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	//original codes from class Arrays
//	public static <T> void sort(T[] a, Comparator<? super T> c) {
//	    if (c == null) {
//	        sort(a);
//	    } else {
//	        if (LegacyMergeSort.userRequested)
//	            legacyMergeSort(a, c);
//	        else
//	            TimSort.sort(a, 0, a.length, c, null, 0, 0);
//	    }
//	}
}
