package school;

public class Teacher extends People{
	//��ʦ���е�����
	private int teachYears;
	private String course;
	//��ʼ������
	public Teacher(String name, int no, int age, int grand, String sex,int teachYears,String couse) {
		// TODO Auto-generated constructor stub
		super(name,no,age,grand,sex);
		this.course=couse;
		this.teachYears=teachYears;
		
	}

	//��ʦ��ѧ
	public void teach(){
		System.out.println(getName()+"������Ľ�\t"+course+"\t�Ŀγ̣���");
	}
	//���ļ�ͥ��ҵ
	public void checkHomeWork(Student students){
		System.out.println(getName()+"   �����������   "+students.getName()+"  ��ҵ��");
		
	}
	
	
	public int getTeachYears() {
		return teachYears;
	}

	public void setTeachYears(int teachYears) {
		this.teachYears = teachYears;
	}
	
	
}
