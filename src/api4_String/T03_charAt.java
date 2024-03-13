package api4_String;

public class T03_charAt {
	public static void main(String[] args) {
		
		// 성별코드가 1 또는 3이면 남자, 2 또는 4이면 여자로 출력하세요.
		//              01234567890123
		String jumin = "123456-1234567";
		char gender;
		String strGender = "";
		
		gender = jumin.charAt(7);
		
		if(gender == '1' | gender == '3') strGender = "남자";
		else if(gender == '2' | gender == '4') strGender = "여자";
		else strGender = "주민번호 오류";
		
		System.out.println("주민번호: "+jumin+", 성별: "+strGender);
	}
}
