package chapter1;

public class Variable {

	public static void main(String[] args) {
		
		//한 줄 주석
				/*범위 주석*/
				/** 문서화주석*/
		
		//변수(variable)
		//데이터를 메모리에 저장하는데 사용하는 기본요소
		//변수를 생성(선언)할 때는 반드시 해당변수가 어떤 형태의 데이터(데이터 타입)를 가질수 있는지 지정
		
		//선언방법
		 //데이터 타입 변수명;
		int number1; //정수형 데이터 타입number1이라는 메모리 공간생성
		//초기화(초기값을 넣는) 방법
		//변수 = 데이터;
		number1 = 9;//number1이라는 메모리 공간에 9라는 데이터를 초기값으로 넣음
		
		//선언과 동시에 초기화
		//데이터타입 변수명 = 데이터;
		int number2 = 37;//정수를 담을수 있는 number2라는 이름을 가지는 메모리 공간을 만들고 공간에 37을 넣었다
		
		System.out.println(number1);
		System.out.println(number2);
		
		//변수 선언 후 초기화 후에 사용할수 있다.
//		int number3;
//		System.out.println(number3);
		
		//변수에 지정된 타입의 데이터가 아니면 할당이 불가능
		//int number3 = 3.14;
		
		
		number1 = 12;//처음 변수의 값을 할당하는 것이 아니기 때문에 해당코드는 초기화가 아님(재할당)
		System.out.println(number1);
		
		//변수 명명 규칙
		
		// 1, 중복된 변수명을 사용할수 없다.
	    int number;
//		int number;
	    //double number; 변수의 데이터 타입이 다르더라도 같은 변수명을 사용할 수 없음
	    
	    // 2, 연산자로 사용되는 특수문자는 포함할수 없다. $ _만 사용가능
	    //boolean flag=; 
	    
	    // 3,변수명은 숫자로 시작할 수 없음
	    //int 1number;
	    
	    // 4, 키워드로만 이루어져 있는 단어는 사용할수 없다.
	    int int1;
	    //int int;
	    
	    //비문법상 규칙(암묵적 룰)
	    // 1, 띄워쓰기 규칙
	    //web site address
	    // - Camel Case : 띄워쓰기를 표현할 때 띄워쓰기를 제거하고 바로 뒤 문자를 대문자로 표현
	    String webSiteAdress;
	    // - Snake Case : 띄워쓰기를 표현할때 띄워쓰기 자리에 _로 표현
	   String web_site_adress;
	   
	   // - Upper : 대문자 표현
	   // - Lower : 소문자 표현
	   // UpperCamelCase : 클래스,인터페이스(첫문자를 대문자로 시작)
	   // lowerCamelCase : 변수,함수,메서드(첫문자를 소문자로 시작)(컴파일언어)
	   // UPPER_SNAKE_CASE : 상수형 변수(모든문자를 대문자로 작성)
	   // lower_snake_case : 변수,함수,메서드(모든 문자를 소문자로 작성)(인터프리터언어)
	   
	   // 상수(Constant)
	   //초기화가 이루어지면 변경이 불가능한 변수
	   //변수 선언시에 데이터 타입 앞에 final 키워드를 붙여서 선언
	   //final 데이터타입 변수명(상수명);
	   final int MAX;
	   MAX = 100;
	   
	   final int MIN = 0;
	   
	   //상수는 초기화이후 재할당이 불가능하다
	   //MAX = 999;
	   
	   double size1 = 146.6 * 70.6;
	   //코드의 가독성 향상: 상수는 "리터럴" 대신 의미 있는 이름을 사용하여 코드를 이해하기 쉽게 만드는 데 도움이 된다. 
	   
	   final double IPHONE_15_PRO_HEIGHT = 146.6;
	   final double IPHONE_15_PRO_WIDTH = 70.6;
	   
	   double size2 =IPHONE_15_PRO_HEIGHT * IPHONE_15_PRO_WIDTH;
	   //데이터의 유지보수 측면에서 유용
	   final int HEIGHT = 10;
	   
	   int sum = HEIGHT + 20;
	   int multi = HEIGHT * 20;
	 // 리터럴 상수 : 값 그 자체(코드 상에서)
	  // int age = 32; 라는 구문에서 "32"가 리터럴에 해당.
	//32 =10;
	   
	   
	   
	}

}
