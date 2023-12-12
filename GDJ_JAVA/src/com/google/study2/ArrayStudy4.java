package com.google.study2;

import java.util.Scanner;

public class ArrayStudy4 {

	public static void main(String[] args) {
//		1.학생정보생성
//		-학생수를 입력받음
//		-학생수 만큼 이름,번호,학점
//		2.학생정보출력
//		3.학생정보검색
//		-검색할 학생번호를 입력받아서 해당학생의 정보를 출력
//		4.학점별 출력
//		5.프로그램 종료
		Scanner sc = new Scanner(System.in);
		boolean result = true;
		String[]name=null;
		int[]num=null;
		double[]jumsu=null;
		int student=0;
		
		
		
		
		while(result) {
		
			
			System.out.println("1.학생정보생성   2.학생정보출력  3.학번검색  4.학점별 출력  5.프로그램종료");
			
			int check = sc.nextInt();
			
			if(check ==1) {
			System.out.println("학생수를 입력하세요.");
			student = sc.nextInt();
			name = new String[student];
			num = new int[student];
			jumsu = new double[student];
			
			for(int i=0;i<student;i++) {
			System.out.println("이름을 입력하세요.");
			name[i] = sc.next();
			System.out.println("학번을 입력하세요.");
			num[i] = sc.nextInt();
			System.out.println("학점을 입력하세요.");
			jumsu[i] = sc.nextDouble();
			}
			
		}else if(check ==2) {
		 for(int i =0; i< name.length;i++) {
			System.out.println("이름:"+ name[i]);
			System.out.println("학번:"+ num[i]);
			System.out.println("학점:"+ jumsu[i]);
			}
			
		}else if(check ==3) {
			System.out.println("학번을 입력하세요");
			int search = sc.nextInt();
			for(int i =0;i<num.length;i++) {
				if(search==num[i]) {
					System.out.println("이름:"+name[i]+"   학번:"+num[i]+"    학점"+jumsu[i]);
				}
			}
		}else if(check ==4) {
			for(int i =1;i<jumsu.length;i++) {
				for(int j=0;j<i;j++) {
					if(jumsu[i]>jumsu[j]) {
						double temp;
						temp = jumsu[i];
						jumsu[i]=jumsu[j];
						jumsu[j]=temp;
						
						String name2;
						name2 = name[i];
						name[i]=name[j];
						name[j]=name2;
						
						int num2;
						num2 = num[i];
						num[i]=num[j];
						num[j]=num2;
						
						
						
						
					}
				}
			}for(int i =0; i<name.length;i++) {
				System.out.println("학점순으로 정렬합니다.");
				System.out.println("이름:"+name[i]+"   학번:"+num[i]+"    학점"+jumsu[i]);
			}
			
			
			
			
		}else {System.out.println("프로그램 종료"); break;}
		 
		
		
	

	}

	}}
















