package api4_String;

public class T06_replace {
	public static void main(String[] args) {
		
		//             0         1         2
		//             012345678901234567890
		String msg1 = "Welcome to Korea!!!";
		String msg2 = "한국에 방문하신 것을 환영합니다!!!";
		
		System.out.println("msg1: "+msg1);
		System.out.println("msg2: "+msg2);
		
		// replace(): 치환 - 특정문자(열)을 지정한 문자(열)로 (모두)변경한다. 단, 대소문자 구별한다.
		System.out.println("1. 'Korea'를 'USA'로 변경하시오. "+msg1.replace("Korea", "USA"));
		System.out.println("2. '한국'을 '미국'으로 변경하시오. "+msg2.replace("한국", "미국"));
		System.out.println("3. 'o'을 'O'으로 변경하시오. "+msg1.replace("o", "O"));
		System.out.println("4. 'o'을 'O'으로 변경하시오. "+msg1.replaceAll("o", "O")); //regex: 정규식 , 검색어에 '정규식'을 사용할때 replaceAll을 사용한다.
		// replaceAll을 불러올 때 regex 라고 뜨는데 이는 정규식이라고 뜻한다
		System.out.println();
		
		String msg3 = " ! H e l l o ! ";
		System.out.println("msg3: "+msg3);
		System.out.println("msg1+msg3+msg2: "+msg1+msg3+msg2);
		System.out.println("msg1+msg3+msg2: "+msg1+msg3.trim()+msg2);
		
		// msg3번에 포함된 모든 공백을 삭제후 msg1+msg3+msg2 출력하시오.
		System.out.println("msg1+msg3+msg2: "+msg1+msg3.trim().replace(" ", "")+msg2);
		System.out.println("msg1+msg3+msg2: "+msg1+msg3.replace(" ", "")+msg2);
		// replace 는 모두 변경하는 것이기 때문에 trim() 이 없어도 앞뒤 공백까지 전부 변경해줬다.
		
		// msg3 안에는 'hello' 문자열을 포함하고 있는가? indexOf(), contains()
		String msg4 = "hello";
		System.out.println(msg3.replace(" ", "").toLowerCase().indexOf(msg4)); // .을 써서 계속 연결하는 것을 체인기법이라고 한다.
		System.out.println(msg3.replace(" ", "").toLowerCase().contains(msg4));
		System.out.println(msg3.replace(" ", "").contains(msg4));
		
		// 지정한 문자(열)을 반복처리한다. : repeat() [자바 10 이상]
		System.out.println(msg3.repeat(30));
		System.out.println("=".repeat(30));
	}
}
