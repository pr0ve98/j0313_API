package api10_Pattern;

import java.util.regex.Pattern;

public class Test3 {
	public static void main(String[] args) {
		// 공백 유무 체크: ^[\\s]*$
		
		String regEx1 = "^[\\s]*$";
		
		String str1 = "1234";
		String str2 = "12 3 4";
		String str3 = "12!!";
		String str4 = "12	"; 		// 숫자(문자)+Tab 공백
		String str5 = "    "; 		// Space(trim() 메소드로 먼저 걸러낸다)
		String str6 = "			".trim(); 	// 모두 Tab(trim() 메소드로 먼저 걸러낸다)
		
		System.out.println("1. "+Pattern.matches(regEx1, str1));
		System.out.println("2. "+Pattern.matches(regEx1, str2));
		System.out.println("3. "+Pattern.matches(regEx1, str3));
		System.out.println("4. "+Pattern.matches(regEx1, str4));
		System.out.println("5. "+Pattern.matches(regEx1, str5));
		System.out.println("6. "+Pattern.matches(regEx1, str6));
	}
}
