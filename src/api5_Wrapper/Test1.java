package api5_Wrapper;

// Wrapper 클래스: 기본타입을 참조타입으로, 참조타입을 기본타입으로 형변환
public class Test1 {
	public static void main(String[] args) {
		int intSu1 = 100, intSu2 = 200;
		System.out.println("1. intSu1 + 100: "+(intSu1 + 100));
		
		// 정수형 Boxing 처리 (Integer) - 기본타입(int) 참조타입(객체)로 타입변환
		Integer objSu1 = new Integer(intSu1); // integer 에 줄 그어진 이유는 옛날 방식이어서, 신경 X
		System.out.println("2. objSu1 + 100: "+(objSu1 + 100));
		
		// 자동 Boxing 처리의 예
		Integer objSu2;
		objSu2 = intSu1; // Boxing 을 했어도 (기본타입 int였던)성질은 가지고 있기 때문에 초기값을 주어야 함
		System.out.println("3. objSu2 + 100: "+(objSu2 + 100));
		
		// UnBoxing 처리
		String strIntSu1 = "100";
		System.out.println("strIntSu1 + 100: "+(strIntSu1 + 100));
		System.out.println("strIntSu1 + 100: "+(Integer.parseInt(strIntSu1) + 100));
		
		// double <-> Double
		double dblSu = 3.14;
		Double objDblSu = new Double(dblSu);
		System.out.println("objDblSu + 100.5: "+(objDblSu + 100.5));
		
		int su3 = 100;
		Integer objSu3 = Integer.valueOf(su3); // 요즘 방식 Boxing
		System.out.println("objSu3 + 100: "+(objSu3 + 100));
		
		// UnBoxing
		int su4 = Integer.valueOf(objSu3);
		System.out.println("su4+100: "+(su4+100));
	}
}
