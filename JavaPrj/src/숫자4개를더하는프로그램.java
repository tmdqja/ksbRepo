import java.util.Scanner;

public class 숫자4개를더하는프로그램 {

	private static Scanner s;

	public static void main(String[] args) {
		int a,b,c,d;
		int result;
		
		s = new Scanner(System.in);
		System.out.print("첫번째 계산할 값을 입력하세요 ==> ");
		a = s.nextInt();
		System.out.print("두번째 계산할 값을 입력하세요 ==> ");
		b = s.nextInt();
		System.out.print("세번째 계산할 값을 입력하세요 ==> ");
		c = s.nextInt();
		System.out.print("네번째 계산할 값을 입력하세요 ==> ");
		d = s.nextInt();
	
		result = a + b + c + d;
		System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);

	}

}
