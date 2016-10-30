package lec;

import java.util.Scanner;

public class InsertionSort {
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
			int i,j,l,temp;
			l=arr.length;
			for(i=0;i<l;i++)
			{
				for(j=i;j>0 && arr[j-1]>arr[j];j--)
				{
					
					if(arr[j-1]>arr[j])
					{temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
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

