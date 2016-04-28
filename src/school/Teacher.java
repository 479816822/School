package school;

public class Teacher extends People{
	private int teachYears;
	private String course;

	public void teach(){
		System.out.println(getName()+"在认真的教"+course+"的课程！！");
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
