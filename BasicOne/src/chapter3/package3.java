package chapter3;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class package3 {

	public static void main(String[] args) {

		//Random 클래스 : 난수를 생성하는 클래스
		Random random = new Random();
		System.out.println(random.nextInt());
		//범위 제약 
		System.out.println(random.nextInt(3));//0-2의 난수 생성
		System.out.println(random.nextInt(3)+1);//1-3의 난수
		
		//SEED지정 
		random = new Random(1);
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(45));
		
		//UUID 클래스 : 고유한 식별자를 만들기 위해 사용하는 랜덤한 문자열
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);

		
		//Date클래스 : 날짜를 다루는 클래스
		//Date클래스의 대부분의 메서드는 java1.1부터 사용하지 않도록 권장
		Date dateNow = new Date();
		System.out.println(dateNow);
		System.out.println(dateNow.getDate());
		
		// LocalDateTime 클래스 : java8부터 Date를 대신하기 위해 사용되는 클래스
		// LocalDate클래스 LocalTime 클래스 LocalDateTime클래스
		
		//현재 날짜 및 시간의 인스턴스 생성
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//특정 날짜 및 시간의 인스턴스 생성
		LocalDateTime date1 = LocalDateTime.of(2024, 7,9,9,0,0);
		System.out.println(date1);
		
		//특정 날짜 및 시간의 요소 불러오기
		//getXXX();
		int year = now.getYear();
		System.out.println(year);
		int month = now.getMonthValue();
		System.out.println(month);
		int day = now.getDayOfMonth();
		System.out.println(day);
		
		//특정 날짜 및 시간 요소 변경
		//withXXX();
		//인스턴스가 직접 변경되지 않고 변경한 값을 반
		now = now.withYear(2025).withHour(21);
		System.out.println(now);
	
		//날짜 및 시간 계산하기
		//특정 요소에 값을 더하거나 빼기
		//plusXXX(),minXXX()
		//인스턴스가 직접 변경되지 않고 변경된 값을 반환
		now = now.plusDays(20).minusHours(22);
			System.out.println(now);
		//LocalDateTime을 Date로 변경
		//Date클래스의 from메서드를 이용		
			
		Date localToDate = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
		System.out.println(localToDate);
		
		//Date 를LocalDateTime 으로 변경
		//Date 인스턴스의 toInstant(),toLocalDateTime()
		LocalDateTime dateToLocal = 
				localToDate.toInstant()
				.atZone(ZoneId.systemDefault())
				.toLocalDateTime();
		
		System.out.println(dateToLocal);
		
		//Date를 String으로 변경
		//SimpleDateFormat 클래스를 사용하여 지정한 포멧의 문자열로 변경 가능
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		String stringDate = simpleDateFormat.format(dateNow);
		System.out.println(stringDate);
		//Y:연도 M:월 d:일 a:오전오후 H: 시간(24) h: 시간(12) s:초 E:요일 
		
		Format computerFormat = new SimpleDateFormat("a hh : mm yyyy-MM-dd");
	
		String computerDate = computerFormat.format(dateNow);
		System.out.println(computerDate);
		//LocalDateTime을 String으로 변경
		
		computerDate = now.format(DateTimeFormatter.ofPattern("a hh : mm yyyy-MM-dd"));
		System.out.println(computerDate);
		
	}

}
