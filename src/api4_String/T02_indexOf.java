package api4_String;

public class T02_indexOf {
	public static void main(String[] args) {
		// 1번 숙제: 글자를 입력받아서 어떤 글자가 있는가 찾기
		
		//             0         1         2
		//             012345678901234567890
		String msg1 = "Welcome to Korea!!!";
		String msg2 = "한국에 방문하신 것을 환영합니다!!!";
		
		// indexOf() : 찾고자 하는 문자(열)을 있는가를 표시? 있으면 위치값(인덱스값)을, 반환 없으면 -1 반환
		System.out.println("1.msg1에 'O'문자가 있는가? " + msg1.indexOf("O")); // 없다
		System.out.println("2.msg1에 'o'문자가 있는가? " + msg1.indexOf("o")); // 있다
		System.out.println("3.msg1에 'korea'문자가 있는가? " + msg1.indexOf("korea")); // 없다
		System.out.println("4.msg1에 'Korea'문자가 있는가? " + msg1.indexOf("Korea")); // 있다
		System.out.println("5.msg2에 '환영'문자가 있는가? " + msg2.indexOf("환영")); // 있다
		
		System.out.println("1.msg1에 'o'문자가 있는가? " + msg1.lastIndexOf("o")); // 뒤에서부터 찾아서 앞에서부터의 위치값
	}
}
