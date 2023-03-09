package com.bj.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P_1157 {

	public static void main(String[] args) throws IOException {
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] arr = new int[26];
		
		for(int i=0;i<s.length();i++) {
			int a = s.charAt(i);
			if(65<=a&&a<=90) {
				arr[a-65]+=1;
			}else if(97<=a&&a<=122) {
				arr[a-97] += 1;				
			}			
			
		}
	
		//System.out.println(Arrays.toString(arr));
		
		int max = arr[0];
		int maxIndex = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				maxIndex = i;				
			}
		}
		
		//System.out.println(maxIndex);		
		
		//System.out.println(maxIndex+65);
		maxIndex=maxIndex+65;
		char c = (char)maxIndex;
		
		Arrays.sort(arr);
		if(arr[25]==arr[24]) {
			System.out.println("?");
		}else {
			
			System.out.println(c);	
		}
		
		
	}

}
