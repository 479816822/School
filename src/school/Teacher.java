package school;

public class Teacher extends People{
	private int teachYears;
	private String course;

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
