package api4_String;

import java.io.UnsupportedEncodingException;

public class T04_getBytes {
	public static void main(String[] args) {
		// 아스키코드: 영문 1글자 1Byte, 한글: 2Byte
		// EUC-KR: 영문 1글자 1Byte, 한글: 2Byte
		// 유니코드: UTF-8 영문 1글자 1Byte, 한글: 3Byte
		
		String str1 = "안녕하세요!";
		String str2 = "Hello!";
		
		System.out.println("str1의 길이: " +str1.length());
		System.out.println("str2의 길이: " +str2.length());
		System.out.println();
		
		// 파일 업로드 다운로드 복사 등 할 때 사용하므로 알아두기
		byte[] b1 = str1.getBytes();
		System.out.println("b1의 길이: "+b1.length); // 한글 다섯글자 (3byte * 5) + 느낌표 1개(1byte) = 16

		byte[] b2 = str2.getBytes();
		System.out.println("b2의 길이: "+b2.length);
		System.out.println();
		
		// 인코딩/디코딩
		try {
			// EUC-KR
			// 한글 인코딩 <> 디코딩
			byte[] b3 = str1.getBytes("EUC-KR");
			System.out.println("b3의 길이: "+b3.length); // 한글 다섯글자 (2byte * 5) + 느낌표 1개(1byte) = 11
			System.out.println("b3: "+b3/*.toString() 생략 가능*/); // override 를 따로 하지 않았으니 주소 출력
			System.out.println("b3[0]: "+b3[0]); // 코드로 출력(안녕하세요! 중 '안'의 EUC-KR 코드 '-66' 출력)
			System.out.println("~~~~~~~~전송중~~~~~~~");
			String str3 = new String(b3, "EUC-KR"); // 복호화 하기 위해서 문자로 변경해 디코딩
			System.out.println("str3: "+str3);
			System.out.println();
			
			// 영문 인코딩 <> 디코딩
			byte[] b4 = str2.getBytes("EUC-KR");
			System.out.println("b2의 길이: "+b2.length); 
			System.out.println("b2: "+b2/*.toString() 생략 가능*/); // override 를 따로 하지 않았으니 주소 출력
			System.out.println("b2[0]: "+b2[0]); // 코드로 출력 (Hello! 중 대문자'H'의 EUC-KR 코드 '72' 출력)
			System.out.println("~~~~~~~~전송중~~~~~~~");
			String str4 = new String(b4, "EUC-KR"); // 복호화 하기 위해서 문자로 변경해 디코딩
			System.out.println("str3: "+str4);
			System.out.println("==============================================");
			
			// UTF-8
			// 한글 인코딩 <> 디코딩
			b3 = str1.getBytes("UTF-8");
			System.out.println("b3의 길이: "+b3.length); // 한글 다섯글자 (2byte * 5) + 느낌표 1개(1byte) = 11
			System.out.println("b3: "+b3/*.toString() 생략 가능*/); // override 를 따로 하지 않았으니 주소 출력
			System.out.println("b3[0]: "+b3[0]); // 코드로 출력(안녕하세요! 중 '안'의 UTF-8 코드 '-20' 출력)
			System.out.println("~~~~~~~~전송중~~~~~~~");
			str3 = new String(b3, "UTF-8"); // 복호화 하기 위해서 문자로 변경해 디코딩
			System.out.println("str3: "+str3);
			System.out.println();
			
			// 영문 인코딩 <> 디코딩
			b4 = str2.getBytes("UTF-8");
			System.out.println("b2의 길이: "+b2.length); 
			System.out.println("b2: "+b2/*.toString() 생략 가능*/); // override 를 따로 하지 않았으니 주소 출력
			System.out.println("b2[0]: "+b2[0]); // 코드로 출력 (Hello! 중 대문자'H'의 EUC-KR 코드 '72' 출력)
			System.out.println("~~~~~~~~전송중~~~~~~~");
			str4 = new String(b4, "UTF-8"); // 복호화 하기 위해서 문자로 변경해 디코딩
			System.out.println("str3: "+str4);
			System.out.println();
		} catch (UnsupportedEncodingException e) {
			
		}
	}
}
