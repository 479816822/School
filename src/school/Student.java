package school;

public class Student extends People{
	
	

	public Student(String name, int no, int age, int grand, String sex) {
		// TODO Auto-generated constructor stub
		super(name,no,age,grand,sex);
	}

	public void learn(){
	     System.out.println(getName()+"�����������!");	
	}
	
	public void doHomeWork(int hour){
		System.out.println(hour+"��"+getName()+"�����������ͥ��ҵ����");
		
		
	}
}
