package com.bj.step_02;

import java.util.Scanner;

public class P_10818 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] arr=new int[a];
		
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();			
			//System.out.println(arr[i]);
		}
		
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<a;i++) {
			if(max<arr[i]) max=arr[i];
			if(min>arr[i]) min=arr[i];
		}

		
		System.out.println(min+" "+max);

	}

}
