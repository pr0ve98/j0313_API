package api1_Object;

import java.util.HashMap;

class Aa {
	String name;
	
	public Aa(String name) {
		this.name = name;
	}
}

class Bb {
	String name;
	
	public Bb(String name) {
		this.name = name;
	}
	@Override
	// objcet 객체를 상속받아서 오버라이드 할 수 있음(object 자바의 제일 상위객체)
	public boolean equals(Object obj) {
		if(this.name == ((Bb)obj).name) return true;
		else return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}

public class T1_hashCode1 {
	public static void main(String[] args) {
		// HashMap 키가 절대로 중복될 수 없음
		HashMap<Integer, String> map = new HashMap<>(); // 뒤의 타입은 넣어도 되고 생략해도 됨. 앞의 타입과 같음
		
		// hashCode 로 같은지 확인한다
		// 데이터 1과 2를 같은 것으로 보고 덮어써서 데이터가 2개만 나옴
		map.put(1, "데이터1");
		map.put(1, "데이터2"); // 덮어쓰기
		map.put(2, "데이터3");
		System.out.println(map);
		
		// 주소로 같은지 확인한다
		// 출력했을 때 다 다르게 본다 = 데이터 3개
		HashMap<Aa, String> map2 = new HashMap<Aa, String>();
		map2.put(new Aa("첫번째"), "데이터1");
		map2.put(new Aa("첫번째"), "데이터2");
		map2.put(new Aa("두번째"), "데이터3");
		System.out.println(map2);
		
		// hashCode 로 같은지 확인한다
		// 주소는 달라도 데이터는 같으니까 같은 것으로 본다 = 데이터 2개
		HashMap<Bb, String> map3 = new HashMap<Bb, String>();
		map3.put(new Bb("첫번째"), "데이터1");
		map3.put(new Bb("첫번째"), "데이터2");
		map3.put(new Bb("두번째"), "데이터3");
		System.out.println(map3);
		
		// 주소와 hashCode가 같아야 같은 데이터로 본다
		
	}
}
