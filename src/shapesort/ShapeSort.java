package shapesort;

import java.util.Arrays;
import java.util.List;

public class ShapeSort {
	
	
	/**
	 * @param shapeLR Object array containing shapes to Shape array to Quicksort
	 */
	protected static void sort(Object[] shapeLR) {
		System.out.println(Arrays.deepToString(shapeLR));
		quicksort(shapeLR, 0, shapeLR.length - 1);
		System.out.println(Arrays.deepToString(shapeLR));
	}

	private static <T> void quicksort(T[] items, int i, int j) {
		if (i < j) {
			int l = partition(items, i, j);
			quicksort(items, i, l);
			quicksort(items, l + 1, j);
		}
	}

	private static <T> int partition(Object[] items, int p, int q) {
		Object x = items[p];
		int m = (p + q) / 2;

		if ((compare(items[p], items[m]) <= 0 && compare(items[m], items[q]) <= 0)
				|| (compare(items[q], items[m]) <= 0 && compare(items[m], items[p]) <= 0))
			x = items[m];
		if ((compare(items[p], items[q]) <= 0 && compare(items[q], items[m]) <= 0)
				|| (compare(items[m], items[q]) <= 0 && compare(items[q], items[p]) <= 0))
			x = items[q];
		int i = p - 1;
		int j = q + 1;
		while (true) {
			do
				i++;
			while (!(i > q || compare(items[i], x) >= 0));
			do
				j--;
			while (!(j < p || compare(items[j], x) <= 0));
			if (i < j)
				swap(items, i, j);
			else
				return j;
		}

	}

	private static <T extends Comparable<T>> void swap(Object[] a, int i, int j) {
		Object x;
		x = a[i];
		a[i] = a[j];
		a[j] = x;
	}

	/**
	 * @param a An object that is a Shape
	 * @param o Another object that is a shape
	 * @return
	 */
	public static int compare(Object a, Object o) {
		// TODO write the right Java code here to support the comparison
		return ((Shape)a).compareTo((Shape)o);
	}

}
