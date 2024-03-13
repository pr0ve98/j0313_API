package api4_String;

public class T05_getChars {
	public static void main(String[] args) {
		String str1 = "Hello1";
		
		char[] strArr = new char[str1.length()];
		str1.getChars(0, str1.length(), strArr, 0); // 배열 복사 (str1의 인덱스번지 0번부터 str1의 길이를 strArr에 0번째 인덱스번지서부터 넣는다)
		System.out.println("strArr: "+strArr);
		System.out.println();
		
		String temp = "";
		for(char str : strArr) {
			temp += str + "/";
		}
		System.out.println(temp);
		System.out.println(temp.substring(0, temp.length()-1)); // temp의 0번째 인덱스번지부터 temp의 길이 -1까지 출력  !!!잘 외워두기!!!
	}
}
