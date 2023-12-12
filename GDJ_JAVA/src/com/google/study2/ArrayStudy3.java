package com.google.study2;

import java.util.Arrays;

public class ArrayStudy3 {

	public static void main(String[] args) {
		int [] ar = {2,5,4,1,3};
		
		
		for(int i=1;i<ar.length;i++) {
		for(int j = 0; j<i;j++) {
		if(ar[i]<ar[j]) {
		int temp;
		temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
		}
		}System.out.println(Arrays.toString(ar));
		}
	}

}
