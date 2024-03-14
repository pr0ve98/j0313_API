package api8_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class T4_compare {
	public static void main(String[] args) {
		// 날짜시간 비교(주의: 시간 비교시는 ms 까지 비교된다)
		
		LocalDateTime startDateTime = LocalDateTime.now();
		System.out.println("오늘 날짜와 시간: "+startDateTime);
		System.out.println();
		
		String tempToday = startDateTime.toString();
		String strToday = tempToday.substring(0, tempToday.indexOf("."));
		System.out.println("오늘(현재) 날짜/시간: "+strToday);
		
		// 날짜와 시간 구분하기(T문자를 기준으로 split() 메소드 이용하여 자르기)
		String strDate = strToday.split("T")[0];
		String strTime = strToday.split("T")[1];
		System.out.println("오늘 날짜: "+strDate+", 현재 시간: "+strTime);
		System.out.println("====================================================");
		
		// 비교할 날짜/시간
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 1, 14, 14, 30, 20);
		System.out.println("타겟(비교) 날짜와 시간: "+targetDateTime);
		System.out.println();
		
		String strTarget = targetDateTime.toString();
//		String bigyoToday = strTempToday.substring(0, strTempToday.indexOf(".")); // 입력받은 날짜와 시간이라 .이 없음
		System.out.println("타겟(비교) 날짜/시간: "+strTarget);
		
		// 날짜와 시간 구분하기(T문자를 기준으로 split() 메소드 이용하여 자르기)
		String bigyoDate = strTarget.split("T")[0];
		String bigyoTime = strTarget.split("T")[1];
		System.out.println("오늘 날짜: "+bigyoDate+", 현재 시간: "+bigyoTime);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		if(strDate.equals(bigyoDate)) System.out.println("같은날");
		else System.out.println("다른날");
		
		// 날짜를 날짜형식으로 비교하고자 한다면?
		// isEqual(): 동일날짜비교, isBefore(): 이전날짜비교, isAfter(): 이후날짜비교, Period: 날짜차이
		System.out.println("isEqual(): "+startDateTime.isEqual(targetDateTime));
		System.out.println("isBefore(): "+startDateTime.isBefore(targetDateTime));
		System.out.println("isAfter(): "+startDateTime.isAfter(targetDateTime)); // startDateTime:알고싶은날짜 targetDateTime: 기준
		
		// 날짜의 계산(Period 클래스)
		LocalDate startDate = LocalDate.now();
		LocalDate targetDate = LocalDate.of(2024, 1, 14);
		Period preiod = Period.between(startDate, targetDate); // startDate:알고싶은날짜 targetDate: 기준
		System.out.println(preiod.getYears());
		System.out.println(preiod.getMonths());
		System.out.println(preiod.getDays());
		
		// 해당 월의 마지막 날짜 찾기(__.atEndOfMonth())
		String lastDay = "2024-03-10"; // 그냥 하나 대입해본 값(원래는 시간을 받거나 지정해서 String 변환)
//		LocalDate bigyoDate2 = LocalDate.parse(lastDay, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//		System.out.println(lastDay+" 달의 마지막 일자?: "+YearMonth.from(bigyoDate2).atEndOfMonth());
		System.out.println(lastDay+" 달의 마지막 일자?: "+YearMonth.from(LocalDate.parse(lastDay, DateTimeFormatter.ofPattern("yyyy-MM-dd"))).atEndOfMonth());

		String lastDay2 = "24-02-01";
		System.out.println(lastDay+" 달의 마지막 일자?: "+YearMonth.from(LocalDate.parse(lastDay2, DateTimeFormatter.ofPattern("yy-MM-dd"))).atEndOfMonth());
		// lastDay 변수에 값만 넣으면 저 내용만 있으면 마지막 일자를 알 수 있다. (날짜패턴은 같아야 함)
		// DateTimeFormatter 년월, 월일만 비교는 불가
		// LocalDate.parse : LocalDate 로 변환해주겠다
		
		
	}
}
