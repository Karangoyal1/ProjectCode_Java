package lec;

import java.util.Scanner;

public class Binarysearch {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = input();
		display(arr);
		System.out.println();
		System.out.println("Enter number to be searched:");
		int num = scn.nextInt();
		int t = binary(arr, num);
		System.out.println("Index of the number is: "+t);

	}

	public static int[] input() {


		System.out.println(" Enter the number of items: ");
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

	public static int binary(int[] abc, int num) {
		int mid, l = 0, r = abc.length - 1;

		while (l <= r) {
			mid = (l + r) / 2;
			if (num == abc[mid])

			{
				return mid;
			} else if (num > abc[mid]) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return -1;
	}

}
