package staticex;

public class StudentTest1 {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum); // �ʱ갪 ���
		studentLee.serialNum++;
		System.out.println("현재값 : "+studentLee.serialNum);// static ���� ����
		
		Student studentSon = new Student();
		studentSon.setStudentName("순수경");
		studentSon.serialNum++;
		System.out.println(studentSon.serialNum); // ������ �� ���
		System.out.println(studentLee.serialNum); // ������ �� ���
	}
}

