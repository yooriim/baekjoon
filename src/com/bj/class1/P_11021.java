package com.bj.class1;

import java.io.IOException;
import java.util.Scanner;

public class P_11021 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();			
		for(int i=1;i<=n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #"+(i)+": "+(a+b));
		}
	}
		
		
}

