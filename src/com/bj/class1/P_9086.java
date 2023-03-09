package com.bj.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_9086 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String b;
		for(int i=0;i<a;i++) {
			b = br.readLine();
			System.out.println(b.charAt(0)+""+b.charAt(b.length()-1));
			b="";
		}
		
		
		
	}

}
