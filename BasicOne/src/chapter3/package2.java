package chapter3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class package2 {
public static void main(String[] args) {
	
	//Collection Framework : Java 에서 데이터 구조에 대한 표준화된 기법을 제공
	
	//List : 데이터를 저장할 때 중복을 혀용하고 순서가 존재하는 데이터 구조
	//Collection Framework 에서 데이터 타입을 지정할 땐 제너릭을 사용하여 지정,참조형 데이터 타입만 지정가능
	
	List<Integer> list;
	//ArrayList 구현 클래스 : 인덱스를 이용한 검색이 빠름
	list = new ArrayList<>();
	
	//LinkedList 구현 클래스 : 추가,삭제가 빠름
	list = new LinkedList<>();
	
	//add() : list 에 요소를 추가
	//추가할 요소는 제너릭으로 지정한 데이터 타입의 요소여야 한다.
	list.add(99);
	
//	list.add("99");
	System.out.println(list);
	
	list.add(100);
	System.out.println(list);
	
	//get() : List 의 특정 인덱스 값을 가져옴
	//List 의 인덱스 범위를 초과하지 않도록 유의해야한다
	//기본형 데이터 타입 변수로 반환값을 받을 땐 null이 값으로 올 수 있음을 유의
	int number = list.get(0);
	System.out.println(number);
	
	//set() : List 에 특정 인덱스 요소를 변경
	//List 인덱스 범위를 벗어나는 인덱스를 지정할 수 없음
	list.set(1, -100);
	System.out.println(list);
	
	//remove() : List 에 특정 인덱스 요소를 제거
	list.remove(0);
	System.out.println(list);

	List<String> stringList = new ArrayList<>();
	stringList.add("apple");
	stringList.add("Banana");	
	stringList.add("apple");
	
	System.out.println(stringList);
	stringList.remove("apple");
	System.out.println(stringList);
	
	//size() : List 의 크기를 반환 해줌
	System.out.println(list.size());
	
	//set : 데이터를 저장할 때 중복을 허용하지 않고 순서가 존재하지 않는 데이터 구조(집합)
	Set<String> set;
	
	//HashSet 구현 클래스 : 검색이 빠름
	set = new HashSet<>();	
	//TreeSet 구현 클래스 : 요소를 정렬해서 추가
	set = new TreeSet<>();
	
	// add() : Set에 요소를 추가 만약,동일한 요소가 존재한다면 추가하지 않는다.
	//set.add("apple");
	System.out.println(set);
	set.add("banana");
	System.out.println(set);
	set.add("apple");
	System.out.println(set);
	
	//contains() : Set에 특정 요소가 존재 하는지 확인
	System.out.println(set.contains("apple1"));
	
	//remove() : Set에 특정 요소를 제거하는 용도로 사용
	set.remove("apple");
	System.out.println(set);
	
	//Map : 키(key)와 값(value)이 한 쌍으로 이루어진 요소들의 집합
	//키는 중복이 불가능값은 중복이 가능
	
	Map<String,String> map;
	
	//HashMap 구현 클래스 : 검색 속도가 빠르다
	map = new HashMap<>();
	//TreeMap 구현 클래스: 키를 정렬하여 저장
	map = new TreeMap<>();
	
	//put()  : Map에 특정한 키와 값의 쌍 을 추가 한다.
	//만약 동일한 키가 존재하면 원래 값을 덮어 씌운다.
	map.put("apple", "사과");
	System.out.println(map);
	map.put("banana", "바나나");
	System.out.println(map);
	
	
	map.put("banana","버네이러");
		System.out.println(map);
		
	//get() : Map에서 특정 키를 가지는 요소를 반환
	//존재 하지 않는 키를 넣으면 null반환	
	System.out.println(map.get("apple"));
	System.out.println(map.get("Apple"));
	
//	containsKey() : Map에 특정키가 존재하는지 확인
	System.out.println(map.containsKey("apple"));
	
	//remove() : Map에서 특정 키를 가지는 키와 값을 제거
	//	삭제작업에 성공하면 해당 키의 값을 반환해준다
	System.out.println(map.remove("apple"));
	System.out.println(map);
	
	class Human {
		String name;
		String address;
		int age;
	}
	Human human1 = new Human();
	human1.name = "홍길동";
	human1.address = "부산광역시";
	human1.age = 20;
	
	Map<String,Object> human2 =new HashMap<>();
	human2.put("name","홍길동");
	human2.put("adress", "부산광역시");
	human2.put("age", 20);
	
	//1.문제점 : 사용혹은 추가 작업에서 실수의 가능성
	human2.get("neam");
	
	//2.문제점 : 타입의 안정성의 문제
	int age = (int)human2.get("age");
	
	//3.문제점 : 데이터 무결성의 문제
	
	
	
	
	
}
}
