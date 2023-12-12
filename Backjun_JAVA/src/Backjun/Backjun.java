package Backjun;

import java.util.Scanner;

public class Backjun {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 
	 System.out.println("시험점수는 몇점입니까?");
	 int result = sc.nextInt();
	 
	 if(result<=100&&result>=0) {
	 if(90<=result && result<=100) {
		 System.out.println("A등급");
	 }else if(80<=result&&result<=89) {
		 System.out.println("B등급");
	 }else if(70<=result&&result<=79) {
		 System.out.println("C등급");

	 }else if(60<=result&&result<=69) {
		 System.out.println("D등급");

	 }else System.out.println("F등");
	 
	}else System.out.println("시험점수는 0~100점 사이로 입력해주세요");
	}}
