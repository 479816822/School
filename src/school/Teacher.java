package school;

public class Teacher extends People{
	private int teachYears;
	private String course;

	public Teacher(String name, int no, int age, int grand, String sex,int teachYears,String couse) {
		// TODO Auto-generated constructor stub
		super(name,no,age,grand,sex);
		
	}

	public void teach(){
		System.out.println(getName()+"������Ľ�"+course+"�Ŀγ̣���");
	}
	
	public void checkHomeWork(){
		
	}
	
	
	public int getTeachYears() {
		return teachYears;
	}

	public void setTeachYears(int teachYears) {
		this.teachYears = teachYears;
	}
	
	
}
