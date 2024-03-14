package api8_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T5 {
	public static void main(String[] args) throws ParseException {
		
		// 예전에 쓰던 방식 =  복잡함
		
		String strDate1 = "2024-03-14";
		String strDate2 = "2024-03-13";
		
//		if(strDate1 > strDate2) System.out.println("비교 불가");
		
		Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(strDate1); // parse 는 Object 에 있는 거라 넘길 수 있음
		Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(strDate2);
		
		if(date1.getTime() > date2.getTime()) System.out.println("strDate1이 더 크다.");
		else System.out.println("strDate2가 더 크다.");
		
		long res1 = (date1.getTime() - date2.getTime()) / 1000; // 초
		long res2 = (date1.getTime() - date2.getTime()) / (1000 * 60); // 분
		long res3 = (date1.getTime() - date2.getTime()) / (1000 * 60 * 60); // 시간
		long res4 = (date1.getTime() - date2.getTime()) / (1000 * 60 * 60 * 24); // 일
		System.out.println("res1: "+res1+"초");
		System.out.println("res2: "+res2+"분");
		System.out.println("res3: "+res3+"시간");
		System.out.println("res4: "+res4+"일");
				
	}
}
