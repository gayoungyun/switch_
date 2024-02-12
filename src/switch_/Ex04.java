package switch_;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str= null, str1 = null;
		int num;
		
		while(true) 
		{//반복문 조건식 참거짓
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			num =  input.nextInt();
		
		switch(num) {
		case 1: System.out.println("우리집 등록");
		str = input.next(); System.out.println("등록성공");break;
		case 2: System.out.println("회사 등록");
		str1 = input.next(); System.out.println("등록성공");break;
		case 3: System.out.println("우리집 : "+str);
		System.out.println("회사 : "+str1);
		}
		}
		}
	
}
