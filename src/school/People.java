package school;

public  abstract class People {
	// 属性
	private String Name;
	private int No;
	private String sex;
	private int grand;
	private int age;

	public People(String name, int no, int age, int grand, String sex) {
		// TODO Auto-generated constructor stub
		this.Name=name;
		this.No=no;
		this.sex =sex;
		this.age=age;
		this.grand=grand;
	}

	// 成员方法
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getNo() {
		return No;
	}

	public void setNo(int no) {
		No = no;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getGrand() {
		return grand;
	}

	public void setGrand(int grand) {
		this.grand = grand;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
