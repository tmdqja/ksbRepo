import java.util.Scanner;

public class 입력된문자열을거꾸로출력 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
String str;
int i;

System.out.print("문자열을 입력 ==> ");
str = s.nextLine();

for(i= str.length() -1; i>=0; i--) {
	System.out.printf("%C", str.charAt(i));
}
System.out.printf("\n");
	}

}
