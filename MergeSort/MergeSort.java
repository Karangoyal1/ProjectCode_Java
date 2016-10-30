package searchindAndsorting;

import java.util.Scanner;

public class MergeSort {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = input();
		int[] sorted = mergeSort(arr, 0, arr.length-1);
		System.out.println("Sorted array is:");
		for(int i=0;i<sorted.length;i++){
			System.out.print(sorted[i]+" ");
		}
	}

	public static int[] merge(int[] one, int[] two) {
		int[] retval = new int[one.length + two.length];

		int i = 0, j = 0, k = 0;
		while (i < one.length && j < two.length) {

			if (one[i] <= two[j]) {
				retval[k] = one[i];
				k++;
				i++;

			} else {
				retval[k] = two[j];
				k++;
				j++;

			}
		}

		while (i < one.length) {
			retval[k] = one[i];
			k++;
			i++;

		}
		while (j < two.length) {
			retval[k] = two[j];
			k++;
			j++;

		}
		return retval;

	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] baseresult = new int[1];
			baseresult[0] = arr[lo];
			return baseresult;

		}

		int mid = (lo + hi) / 2;

		int[] fhalf = mergeSort(arr, lo, mid);
		int[] shalf = mergeSort(arr, mid + 1, hi);

		int[] result = merge(fhalf, shalf);
		return result;
	}

	public static int[] input() {

		System.out.println(" enter the number of items ");
		int n = scn.nextInt();

		int[] retval = new int[n];
		int counter = 1;
		while (counter <= n) {
			System.out.println("enter " + counter + "th element ");
			retval[counter - 1] = scn.nextInt();
			counter = counter + 1;
		}
		return retval;
	}

	public static void display(int[] abc) {
		int i;
		for (i = 0; i < abc.length; i++) {
			System.out.print(" " + abc[i]);
		}
	}

}
