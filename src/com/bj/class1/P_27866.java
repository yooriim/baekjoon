package com.bj.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P_27866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int a = Integer.parseInt(br.readLine());
		//System.out.println(s+" "+a);
		
		System.out.println(s.charAt(a-1));
		
	}

}
