package api4_String;

public class T02_subString {
	public static void main(String[] args) {
		// 1번 숙제: 글자를 입력받아서 어떤 글자가 있는가 찾기
		
		//             0         1         2
		//             012345678901234567890
		String msg1 = "Welcome to Korea!!!";
		String msg2 = "한국에 방문하신 것을 환영합니다!!!";
		
		// substring() : 지정된 위치(인덱스번지)의 값을 출력
		// substring(n): 저징된 위치(인덱스번지)의 위치부터 마지막까지 문자열을 출력
		// substring(n, m): n위치(인덱스번지)의 위치부터 m-1위치까지 문자열을 출력
		System.out.println("1.msg1에 3번째 인덱스위치부터 출력? " + msg1.substring(3)); 
		System.out.println("2.msg1에 3번째부터 12번째 인덱스 앞까지 출력? " + msg1.substring(3, 12)); 
		
		// Ko로 시작하는 단어를 출력하시오
		System.out.println("Ko~ "+msg1.indexOf("Ko"));
		System.out.println("!!! "+msg1.indexOf("!!!"));
		System.out.println("Korea: "+msg1.substring(msg1.indexOf("Ko"),msg1.indexOf("!!!")));
	}
}
