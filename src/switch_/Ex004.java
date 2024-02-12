package switch_;

import java.util.Scanner;

public class Ex004 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int num;
		String str= null, str1= null;// 초기화 필요
		
		System.out.println("입력");
		num = input.nextInt();
		
		
		while(true)
		{
			System.out.println("1.우리집");
			System.out.println("2.회사");
			System.out.println("3.등록보기");
			num = input.nextInt();
		
		switch(num) 
		{
		case 1:System.out.println("우리집 등록");str=input.next("우리집");break;
		case 2:System.out.println("회사 등록");str=input.next("회사");break;
		case 3:System.out.println("등록보기");str=input.next("등록 :" +str);
		System.out.println("등록보기");str=input.next("등록 :" +str1);
		}
		}
		
	}
}
