import java.util.Scanner;

public class ����4�������ϴ����α׷� {

	private static Scanner s;

	public static void main(String[] args) {
		int a,b,c,d;
		int result;
		
		s = new Scanner(System.in);
		System.out.print("ù��° ����� ���� �Է��ϼ��� ==> ");
		a = s.nextInt();
		System.out.print("�ι�° ����� ���� �Է��ϼ��� ==> ");
		b = s.nextInt();
		System.out.print("����° ����� ���� �Է��ϼ��� ==> ");
		c = s.nextInt();
		System.out.print("�׹�° ����� ���� �Է��ϼ��� ==> ");
		d = s.nextInt();
	
		result = a + b + c + d;
		System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);

	}

}
