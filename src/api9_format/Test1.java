package api9_format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Test1 {
	public static void main(String[] args) {
		// DecimalFormat(): 데이터 출력 포맷을 지정한다. 소숫점은 마지막자리 반올림
		// 서식기호: 0 => 숫자를 표시(해당 자리에 숫자가 없으면 0으로 표시)
		//        # => 숫자를 표시(의미가 없는 0(무효의 제로)을 화면에 출력시켜주지 않는다.
		
		double su = 12345.0;
		System.out.println("원본: "+su);
		
		DecimalFormat df = new DecimalFormat();
		System.out.println("1. "+df.format(su));
		
		// 정수로 포맷 출력
		df = new DecimalFormat("0");
		System.out.println("2. "+df.format(su));
		
		// 1000단위로 쉼표 찍어줌, 큰 단위는 상관없지만 작은 단위는 이상해짐
		// ex) su = 12.6789; 0.013으로 출력
		df = new DecimalFormat("0,000");
		System.out.println("3. "+df.format(su));
		
		df = new DecimalFormat("#,###"); // 1000단위로 쉼표 찍어줌
		System.out.println("4. "+df.format(su));
		
		df = new DecimalFormat("#");
		System.out.println("5. "+df.format(su));
		
		df = new DecimalFormat("#,##0");  // 1000단위로 쉼표 찍어줌
		System.out.println("6. "+df.format(su));
		
		df = new DecimalFormat("#,##0.#");  // 1000단위로 쉼표 찍어줌, 소수점이 없으면 무시하겠다
		System.out.println("7. "+df.format(su));
		
		df = new DecimalFormat("#,##0.0");  // 1000단위로 쉼표 찍어줌, 소수점이 없어도 0으로 표시하겠다
		System.out.println("8. "+df.format(su));
		
		df = new DecimalFormat("@@@@@@@@@@.0");
		System.out.println("9. "+df.format(su));
		
		double su2 = 0.9576;
		df = new DecimalFormat("0.0%"); // 백분율
		System.out.println("10. "+df.format(su2));
		
		df = new DecimalFormat("W#,##0");
		System.out.println("11. "+df.format(su));
		
		df = new DecimalFormat("\u00A4#,##0");
		System.out.println("12. "+df.format(su));
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		nf.setMinimumFractionDigits(2);
		System.out.println(nf.format(su));
		
	}
}
