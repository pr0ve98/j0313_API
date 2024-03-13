package api3_Class;

public class Test2 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String"); // 확장자명 제외
			System.out.println("String 클래스파일이 존재합니다.");
			
			// 객체의 정보(Test1.class) 알아내 출력하기
			Class clazz = Test1/*클래스파일*/.class; // 타입을 Class 로 해야 한다
			System.out.println("전체이름(패키지명+파일명): "+clazz.getName());
			System.out.println("패키지명: "+clazz.getPackage());
			System.out.println("타입: "+clazz.getTypeName());
			System.out.println("simple이름: "+clazz.getSimpleName());
			System.out.println();
			
			Class imgPath = Test2.class;
			System.out.println("그림파일의 경로명: "+imgPath.getResource("./images/two read 방식 알고리즘.png").getPath()); // .(내 자신)/images/two read 방식 알고리즘.png (상대경로)
			System.out.println("Test2.class의 경로명: "+imgPath.getResource("Test2.class").getPath()); // 내 자신
			System.out.println("Test2.class의 경로명: "+clazz.getResource("Test2.class").getPath());
			System.out.println("현재 작업 경로의 루트(/)명: "+clazz.getResource("/").getPath()); // 루트(/): bin(src로 생각)
			System.out.println("그림파일의 경로명: "+imgPath.getResource("/api3_Class/images/기본 알고리즘.png").getPath());
			
			// 잘못된 경로와 파일명을 입력했을 때
//			System.out.println("그림파일의 경로명: "+imgPath.getResource("/images/기본 알고리즘.png").getPath()); // 없어서 NullPointerException
			
			System.out.println("api2_System 패키지의 Test1.class 경로명1: "+imgPath.getResource("/api2_System/Test1.class").getPath());
			System.out.println("api2_System 패키지의 Test1.class 경로명2: "+imgPath.getResource("../api2_System/Test1.class").getPath()); // .. (상위폴더)
			
			// 최상위 폴더(src(또는 bin))를 벗어나면 경로와 파일명을 찾아올 수 없다.
//			System.out.println("api2_System 패키지의 Test1.class 경로명3: "+imgPath.getResource("../../src/api2_System/Test1.class").getPath()); //루트를 벗어나서 NullPointerException
		
		} catch (ClassNotFoundException e) {
			System.out.println("클래스파일이 존재하지 않습니다. "+e.getMessage());
		} finally {
			System.out.println("작업 끝!");			
		}
	}
}
