package api2_System;

public class Test3 {
	public static void main(String[] args) {
		int i, tot=0;
		
		for(i=1; i<=100000000; i++) {
			tot += i;
			if(tot >= 10000) {
				System.out.println("합이 10000이상일 때 i값은? "+i);
//				break;
//				return;
				System.exit(0); // JVM에서 아예 종료
			}
		}
		System.out.println("작업끝!");
	}
}
