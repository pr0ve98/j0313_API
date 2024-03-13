package api4_String;

import java.util.HashMap;

public class T08_valueOf {
	public static void main(String[] args) {
		// String.valueOf(): ~ 자료형들을 '문자열'로 변환한다.
		
//		int intSu = 1234;
//		double db1Su = 1234.0;
		Integer intSu = 1234; // 일반 타입에서 참조 타입으로 변경 [boxing]
		Double dblSu = 1234.0; // [boxing]
		String strSu = "1234";
		HashMap<String, Integer> map = new HashMap</*String, Integer 생략 가능*/>(); // <,>: 제너릭
		
		System.out.println(strSu);
		System.out.println("============변수들의 타입 확인============");
		System.out.println(strSu.getClass().getName()/*Name 이지만 Class 에서 사용하면 타입명이 됨*/);
		System.out.println(intSu.getClass().getName()); // boxing 안 하면 오류남
		System.out.println(dblSu.getClass().getName());
		System.out.println(map.getClass().getName());
		System.out.println();
		
		System.out.println("===========형변환 하기============");
		int intSu2 = 1234;
		System.out.println("1. intSu + 100 = "+(intSu + 100));
//		String strSu2 = (String)intSu2; // 에러
//		String strSu2 = intSu2.toString; // 에러
		String strSu2 = intSu + "";
		strSu2 = intSu2 + "";
		
		String strSu3 = String.valueOf(intSu2); // 강제 형변환
		System.out.println(strSu3.getClass().getName());
		
		double dblSu4 = 3.14;
		String strSu4 = String.valueOf(dblSu4); // 강제 형변환
		System.out.println(strSu4.getClass().getName());
		System.out.println();
		
		System.out.println("===========형변환 하기2============");
		int a1 = 100, a2 = 200;
		int res = a1 + a2;
		System.out.println("기본 타입 연산: "+res);
		
		String str5 = String.valueOf(a1) + String.valueOf(a2);
		System.out.println(str5);
		
//		int res6 = (int)String.valueOf(a1) + (int)String.valueOf(a2);
		int res6 = Integer.parseInt(String.valueOf(a1)) + Integer.parseInt(String.valueOf(a2));
		System.out.println(res6);
	}
}
