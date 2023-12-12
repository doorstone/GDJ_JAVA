package com.google.study2;

public class ArrayStudy2 {

	public static void main(String[] args) {
//		배열선언
//		자바에서는 중괄호를 써여한다.
		int [] ar = {2,4,5};
		
		int [] ar2 = {2,4};
		ar =ar2;
		
		for(int i=0;i<ar.length;i++)
		{System.out.println(ar[i]);
		}
		

	}

}
