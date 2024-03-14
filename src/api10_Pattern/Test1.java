package api10_Pattern;

import java.util.regex.Pattern;

public class Test1 {
	public static void main(String[] args) {
		// 정규식 Pattern 클래스 사용
		// 숫자: ^[\\d]*$
		
		String str1 = "1234";
		String str2 = "1A234";
		
		// 정규식을 만들고, 입력데이터와 조건 비교처리한다.
		
		// 정규식 만들기
		String regEx = "^[\\d]*$";
		
		// 1번 방법; 잘 사용하진 않음
		Boolean pattern1 = Pattern.compile(regEx).matcher(str1).find(); // 보통 정규식은 래퍼클래스로 한다(객체타입) Boolean
		Boolean pattern2 = Pattern.compile(regEx).matcher(str2).find();
		
		System.out.println("1. "+pattern1);
		System.out.println("2. "+pattern2);
		
		// 2번 방법
		Boolean pattern3 = Pattern.matches(regEx, str1);
		Boolean pattern4 = Pattern.matches(regEx, str2);
		System.out.println("3. "+pattern3);
		System.out.println("4. "+pattern4);
		
		System.out.println("5. "+Pattern.matches(regEx, str1));
		System.out.println("6. "+Pattern.matches(regEx, str2));
		System.out.println();
		
		// 프로그램에서의 적용
		if(Pattern.matches(regEx, str1)) System.out.println("str1은 숫자가 맞습니다.");
		else System.out.println("str1은 숫자가 아닌 값을 포함하고 있습니다.");
		
		if(Pattern.matches(regEx, str2)) System.out.println("str2은 숫자가 맞습니다.");
		else System.out.println("str2은 숫자가 아닌 값을 포함하고 있습니다.");
	}
}
