package school;

import java.util.Scanner;

public class School {

	//申明20位学生和 3位老师
	
	private Student [] student =new Student[20];
	private Teacher [] teacher= new Teacher[3];
	private int studentNum;
	private int teacherNum;
	
	//创建num个学生
	public void creatStu(int num){
		Scanner input =new Scanner(System.in);
		for (int i = 0; i < num; i++) {
			System.out.println("请输入"+(i+1)+"学生的信息：");
			System.out.print("姓名:");
			String name =input.next();
			System.out.print("学号:");
			int No=input.nextInt();
			System.out.print("年龄:");
			int age=input.nextInt();
			System.out.print("年级:");
			int grand=input.nextInt();
			System.out.print("性别：");
			String sex=input.next();
			student[i]=new Student(name,No,age,grand,sex);
			studentNum++;
		}
	}
	//创建num位老师
	public void createTea(int num){
		Scanner input=new Scanner(System.in);
	
		for (int i = 0; i < num; i++) {
			System.out.println("请输入"+(i+1)+"学生的信息：");
			System.out.print("姓名:");
			String name =input.next();
			System.out.print("学号:");
			int No=input.nextInt();
			System.out.print("年龄:");
			int age=input.nextInt();
			System.out.print("年级:");
			int grand=input.nextInt();
			System.out.print("性别：");
			String sex=input.next();
			System.out.print("教龄:");
			int teachYears=input.nextInt();
			System.out.print("课程:");
			String couse=input.next();
			teacher[i]=new Teacher(name,No,age,grand,sex,teachYears,couse);

		
	}
	
	
}
}