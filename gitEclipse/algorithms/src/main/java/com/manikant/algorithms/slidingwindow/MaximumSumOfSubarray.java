package com.manikant.algorithms.slidingwindow;

import java.util.Scanner;

public class MaximumSumOfSubarray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[] = {1,4,2,10,2,3,1,0,20};
		System.out.println("Please enter the length of subarray for which you want to find maximum sum");
		int k=sc.nextInt();
		sc.close();
		int size=arr.length;
		System.out.println(maxSum(arr,size,k));
	}

	
	static int maxSum(int arr[],int size,int k) {
		if(size<k) {
			System.out.println("Invalid Input");
			return -1;
		}
		
		int max_sum=0;
		for(int i=0;i<k;i++) {
			max_sum+=arr[i];
		}
		
		int window_sum=max_sum;
		for(int i=k;i<size;i++) {
			window_sum+=arr[i] -arr[i-k];
			max_sum=Math.max(max_sum, window_sum);
		}
		
		return max_sum;
	}
}

