import java.util.ArrayList;
import java.util.List;

public class List_Arraylist1 {

	public static void main(String[] args) {
		
		List<String> rList = new ArrayList<>();
		
		//List �������̽��� �޸𸮿� �ø��� ���� ������ ArrayList Ŭ������ ���� �޸𸮸� �ø�
		rList.add("��¹�");
		rList.add("ȫ�浿");
		rList.add("�Ӳ���");
		rList.add("��浿");
		
		//List �÷��� ������ ��ũ�� �����͸� �߰���
		System.out.println("�迭�� ũ��" + rList.size());
		
		//�迭ũ�� ���
		for (int i=0; i< rList.size(); i++) {
			System.out.println("[" + i + "]��° �迭 ������ :" + rList.get(i));
		}
			
	}
}