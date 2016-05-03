package school;

public class Student extends People{
	
	

	public Student(String name, int no, int age, int grand, String sex) {
		// TODO Auto-generated constructor stub
		super(name,no,age,grand,sex);
	}

	public void learn(){
	     System.out.println(getName()+"在认真的听讲!");	
	}
	
	public void doHomeWork(int hour){
		System.out.println(hour+"点"+getName()+"在认真的做家庭作业！！");
		
		
	}
}
