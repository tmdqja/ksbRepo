
public class While구구단 {

	public static void main(String[] args) {
		
		int i=3;
		int j=1;
		while(i<10) {
			if(i==3 || i==5)
			{
				System.out.println("<" + i + "단" + ">");
			}
			while(j<10) {
				System.out.println(i + "*" + j + "=" + i*j);
				j++;
			}
			j=1;
			System.out.println();
			i++;
		}
	}
}