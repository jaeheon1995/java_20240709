package chapter1;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		
		//콘솔입력
		//java.util.Scanner클래스의 객체를 생성해서 nextXXXX()메서드로 입력을 받음
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("입력 : ");
		int inputNumber = scanner.nextInt();
		
		System.out.println("사용자가 입력한 수 : " + inputNumber);
	
		//시스템으로 받은 입력 리소스를 반환
	scanner.close();
	
		
	}

}
