import java.util.ArrayList;
import java.util.List;

public class List_Arraylist1 {

	public static void main(String[] args) {
		
		List<String> rList = new ArrayList<>();
		
		//List 인터페이스는 메모리에 올릴수 없기 떄문에 ArrayList 클래스를 통해 메모리를 올림
		rList.add("김승범");
		rList.add("홍길동");
		rList.add("임꺽정");
		rList.add("고길동");
		
		//List 컬렉션 프레임 워크에 데이터를 추가함
		System.out.println("배열의 크기" + rList.size());
		
		//배열크기 출력
		for (int i=0; i< rList.size(); i++) {
			System.out.println("[" + i + "]번째 배열 기억공간 :" + rList.get(i));
		}
			
	}
}