package lec;

import java.util.Scanner;

public final class linearsearch {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeinput();
		System.out.println("element to be searched: ");
		int item = scn.nextInt();
		int n = linear(arr,item);
		if(n==-1)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("index of element is: "+n);
		}
		

	}
	
	public static int[] takeinput(){
		
		
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
	
	public static int linear(int []arr,int item ){
		
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==item)
			{
				return i;
			}
			
		}
		return -1;
		
	}

}
