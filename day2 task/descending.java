package addon;

import java.util.Arrays;
import java.util.Scanner;

public class descending {
	public static void main(String []args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=sc.nextInt();
		int arr[] =new int[n];
		for(int a=0;a<arr.length;a++)
		{
			arr[a]=sc.nextInt();}
			System.out.println(Arrays.toString(arr));
		
		int arr1[] =new int[n];
		for(int a=0;a<arr.length;a++)
		{
			arr1[a]=arr[a];
			
		}
		System.out.println(Arrays.toString(arr1));
		int start=0;
		int end=arr1.length-1;
		while(start<end)
		{
			int temp=arr[end];
			arr1[end]=arr1[start];
			arr1[start]=temp;
			start++;
			end--;
		}
	System.out.println(Arrays.toString(arr1));
	}}

