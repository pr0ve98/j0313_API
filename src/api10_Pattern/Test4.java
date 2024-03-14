package api10_Pattern;

import java.util.regex.Pattern;

public class Test4 {
	public static void main(String[] args) {
		// 문자열 정규식
		
		String regEx1 = "^[abc]*$"; // a 또는 b 또는 c 문자가 포함? == ^[a|b|c]*$
		
		String str1 = "1234";
		String str2 = "1234zxvf";
		String str3 = "aaa";
		String str4 = "bc";
		String str5 = "asdf";
		String str6 = "asdf ";
		String str7 = "asDf";
		String str8 = "abcsDf";
		
		System.out.println("1. "+Pattern.matches(regEx1, str1));
		System.out.println("2. "+Pattern.matches(regEx1, str2));
		System.out.println("3. "+Pattern.matches(regEx1, str3));
		System.out.println("4. "+Pattern.matches(regEx1, str4));
		System.out.println("5. "+Pattern.matches(regEx1, str5));
		System.out.println("6. "+Pattern.matches(regEx1, str6));
		System.out.println("7. "+Pattern.matches(regEx1, str7));
		System.out.println("8. "+Pattern.matches(regEx1, str8));
	}
}
