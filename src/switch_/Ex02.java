package switch_;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		
		switch(num%2) { // 연산식은 잘 안쓴다
		case 0 :System.out.println("입력값은 짝수");break;
		case 1 :System.out.println("입력값은 홀수");//break생략
		}
		System.out.println("다음문장 실행!!");
	}

}
