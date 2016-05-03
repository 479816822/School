package school;

public class Student extends People{
	
	
	//初始化属性
	public Student(String name, int no, int age, int grand, String sex) {
		// TODO Auto-generated constructor stub
		super(name,no,age,grand,sex);
	}

	//自己特有的方法
	//学习
	public void learn(){
	     System.out.println(getName()+"在认真的听讲!");	
	}
	//做家庭作业
	public void doHomeWork(int hour){
		System.out.println(hour+"点"+getName()+"在认真的做家庭作业！！");
		
		
	}
}
