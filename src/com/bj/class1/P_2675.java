package com.bj.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_2675 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			String[] arr =  s.split(" ");
			int a = Integer.parseInt(arr[0]);			
			String b = arr[1];
			String result="";
			
			for(int j=0;j<b.length();j++) {
				for(int k=0;k<a;k++) {
					
					result+=b.charAt(j);
				}
			}
			System.out.println(result);			
			result="";
			
		}		

	}

}
