package school;

public class Student extends People{
	
	
	//��ʼ������
	public Student(String name, int no, int age, int grand, String sex) {
		// TODO Auto-generated constructor stub
		super(name,no,age,grand,sex);
	}

	//�Լ����еķ���
	//ѧϰ
	public void learn(){
	     System.out.println(getName()+"�����������!");	
	}
	//����ͥ��ҵ
	public void doHomeWork(int hour){
		System.out.println(hour+"��"+getName()+"�����������ͥ��ҵ����");
		
		
	}
}
