package school;

public class School {

	//����20λѧ���� 3λ��ʦ
	
	private Student [] student =new Student[20];
	private Teacher [] teacher= new Teacher[3];
	private int studentNum;
	private int teacherNum;
	
	//����num��ѧ��
	public void creatStu(int num){
		for (int i = 0; i < num; i++) {
			System.out.println("������"+(i+1)+"ѧ������Ϣ��");
		}
	}
	//����numλ��ʦ
	public void createTea(){
		
	}
	
	
}
