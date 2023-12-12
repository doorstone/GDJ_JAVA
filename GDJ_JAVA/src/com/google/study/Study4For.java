package com.google.study;

import java.util.Scanner;

public class Study4For {
	
	public static void main(String [] args) {
		//서든 FPS
		//총알 : 30발 탄창 * 3
		
		//1. 단발모드
		//2. 점사모드
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<3;i++) {
			System.out.println("1. 단발모드   2.점사모드");
			int shot = sc.nextInt();
			for(int j=0;j<30;j++) {
				if(shot == 1) {
					System.out.println(j+1+"번째   탕!");
				}else if(shot==2) {
					System.out.println("탕탕탕!");
					j+=2;
				}
			}
			
		}System.out.println("남은 탄창이 없습니다.");
		
		
		
	}

}
