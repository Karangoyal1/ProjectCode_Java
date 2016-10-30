package lec;

import java.util.Scanner;

public class BubbleSort {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr=input();
		sort(arr);
		System.out.println("Sorted array is:");
		display(arr);
		}
	
	public static int[] input(){
		
		
		System.out.println(" enter the number of items ");
		int n =scn.nextInt();
		
		int[] retval = new int[n];
		int counter=1;
		while(counter<=n){
			System.out.println("enter "+counter+"th element ");
			retval[counter-1]=scn.nextInt();
			counter=counter +1;
		}
		return retval;
		}
	
	public static void sort(int[] arr){
		int i,j,temp;
		for(i=1;i<=arr.length;i++)
		{
			for(j=0;j<arr.length-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		 }
		
		}
	
	public static void display(int []abc){
		int i;
		for(i=0;i<abc.length;i++)
		{
			System.out.print(" "+abc[i]);
		}
	}
}
