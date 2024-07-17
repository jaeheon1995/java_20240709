package chapter3;

import java.util.ArrayList;
import java.util.List;

//제너릭 : 클래스나 메서드에서 사용할 데이터 타입을 외부에서 받아오는 기법
//Test1,2,3 의 형태로 클래스를 작성하면 코드 중복 발생

class Test1{
	String subject;
	int score;
}

class Test2{
	String subject;
	double score;
}

class Test3{
	String subject;
	char score;
}

//Test4 의 형태의 클래스로 작성하면 코드의 중복은 해결할 수 있지만
//사용시 코드의 안정성이 떨어진다
class Test4{
	String subject;
	Object score;
}


//제너릭 클래스 : 클래스 내부에 있는 데이터 타입을 컴파일 시에 결정하게 한다
//class 클래스명<매개타입>{매개타입,변수명;...}
class Test5<T>{
	String subject;
	T score;
}

class SuperClass{}
	
class MyClass extends SuperClass{}
	
class SubClass extends MyClass{}

//T extends 클래스명: 특정클래스 혹은 특정클래스를 상속한 클래스만 제너릭 타입으로 받을수 있도록 제한
class ExtandsClass<T extends MyClass>{
	T variable;
}



public class Generic {
	
	//제너릭 메서드 : 해당 메서드의 매개변수 타입이나 반환타입을 컴파일시에 결정하고자 할 때 사용
	//<매개타입> 반환타입 메서드명 (매개변수){....}
	static <T> void method(List<T> arg) {
			System.out.println(arg);
		}
	
	//?: 제너릭의 와일드카드로 모든 타입을 받을수 있도록 함
	//와일드 카드가 사용되는 제너릭은 매개변수 타입이나 반환타입에 사용됨
	static void wildMethod (List<?> arg) {
		System.out.println(arg);
	}
	
	
	//? extends 클래스명 : 특정 클래스 혹은 특정 클래스를 상속받은 클래스만 타입으로 받을수있도록 제한
	
	static void extendsMethod(List<? extends MyClass> arg) {
		
	}
	
	//? super : 특정 클래스 혹은 특정 클래스의 상위만 받을수 있도록 제한
	static void superMathod(List<? super MyClass> arg) {
		System.out.println(arg);
	}
	
	
	public static void main(String[] args) {

		
		
		
		
		Test4 instance1 = new Test4();
		instance1.score = 'A';
		
		int score = (int)instance1.score;
		System.out.println(score);
		
		Test5<Integer> instance2 = new Test5<>();
		instance2.score=10;
		score = instance2.score;
		
		List<SuperClass> list1 = new ArrayList<>();
		list1.add(new MyClass());
		list1.add(new SubClass());
		list1.add(new SuperClass());
		
		ExtandsClass<SubClass> instance3 = new ExtandsClass<>();

		List<String> list2 = new ArrayList<>();
		wildMethod(list2);
		List<String> list3 = new ArrayList<>();
		wildMethod(list3);
			
		//? extends로 클래스 제한이 걸려 있기 때문에 my class 혹은 myclass를 상속한 클래스만 매개변수로 사용가능
		List<MyClass>list4 =new ArrayList<>();
		List<SubClass>list5 = new ArrayList<>();
		
		extendsMethod(list4);
		//? super 로 제한이 걸려있기 때문에
		//superclass 혹은 myclass의 부모 클래스만 매개변수로 사용가능
		superMathod(list1);
	}
}
