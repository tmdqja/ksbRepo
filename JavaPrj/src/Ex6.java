import java.util.HashMap;
import java.util.Map;
public class Ex6 {

	public static void main(String[] args) {
		
		//hashmap ������Ÿ�� ���ǽ� Ű�� ���� ����� ������ Ÿ���� �����ϸ�, �޸𸮿� �ø�
		Map<String, String> pMap = new HashMap<>();
		
		//Ű�� ���� ������ ������ �߰��ϱ�
		pMap.put("name", "��¹�");
		pMap.put("email", "tmdqja0906@naver.com");
		pMap.put("dept", "�����ͺм���");
		
		//������ �ҷ�����
		System.out.println("----------------");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));
		System.out.println(pMap.get("��Ÿ"));
		System.out.println("----------------");
	}
}