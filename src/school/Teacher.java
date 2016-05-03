package school;

public class Teacher extends People{
	//老师特有的属性
	private int teachYears;
	private String course;
	//初始化属性
	public Teacher(String name, int no, int age, int grand, String sex,int teachYears,String couse) {
		// TODO Auto-generated constructor stub
		super(name,no,age,grand,sex);
		this.course=couse;
		this.teachYears=teachYears;
		
	}

	//老师教学
	public void teach(){
		System.out.println(getName()+"在认真的教\t"+course+"\t的课程！！");
	}
	//批改家庭作业
	public void checkHomeWork(Student students){
		System.out.println(getName()+"   在认真地批改   "+students.getName()+"  作业！");
		
	}
	
	
	public int getTeachYears() {
		return teachYears;
	}

	public void setTeachYears(int teachYears) {
		this.teachYears = teachYears;
	}
	
	
}
