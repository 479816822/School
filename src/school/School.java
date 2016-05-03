package school;

public class School {

	//申明20位学生和 3位老师
	
	private Student [] student =new Student[20];
	private Teacher [] teacher= new Teacher[3];
	private int studentNum;
	private int teacherNum;
	
	//创建num个学生
	public void creatStu(int num){
		for (int i = 0; i < num; i++) {
			System.out.println("请输入"+(i+1)+"学生的信息：");
		}
	}
	//创建num位老师
	public void createTea(){
		
	}
	
	
}
