package school;

import java.util.Scanner;

public class School {

	// 申明20位学生和 3位老师

	private Student[] student = new Student[20];
	private Teacher[] teacher = new Teacher[3];
	private int studentNum;
	private int teacherNum;

	static Scanner input = new Scanner(System.in);

	// 创建num个学生
	public void creatStu(int num) {

		for (int i = 0; i < num; i++) {
			System.out.println("请输入" + (i + 1) + "学生的信息：");
			System.out.print("姓名:");
			String name = input.next();
			System.out.print("学号:");
			int No = input.nextInt();
			System.out.print("年龄:");
			int age = input.nextInt();
			System.out.print("年级:");
			int grand = input.nextInt();
			System.out.print("性别：");
			String sex = input.next();
			Student stu = new Student(name, No, age, grand, sex);
			student[i] = stu;
			studentNum++;
		}
	}

	// 创建num位老师
	public void createTea(int num) {

		for (int i = 0; i < num; i++) {
			System.out.println("请输入" + (i + 1) + "教师的信息：");
			System.out.print("姓名:");
			String name = input.next();
			System.out.print("学号:");
			int No = input.nextInt();
			System.out.print("年龄:");
			int age = input.nextInt();
			System.out.print("年级:");
			int grand = input.nextInt();
			System.out.print("性别：");
			String sex = input.next();
			System.out.print("教龄:");
			int teachYears = input.nextInt();
			System.out.print("课程:");
			String couse = input.next();
			Teacher tea = new Teacher(name, No, age, grand, sex, teachYears, couse);
			teacher[i] = tea;
			teacherNum++;

		}

	}
	// 调看学生和老师现在的动作

	public void showMenu() {
		System.out.println("***********************");
		System.out.println("\nSchool管理系统");
		System.out.println("************************");

		// 菜单选择
		System.out.println("1.查看学生\n2.查看老师\n0.退出！");

	}

	// 查看学生
	public void showStu(String name, int hour) {
		int i = -1;
		boolean T = false;

		for (int j = 0; j < studentNum; j++) {
			if (name.equals(student[j].getName())) {
				i = j;
				T = true;
				break;
			}

		}
		if (T) {

			if (hour >= 8 && hour <= 17)
				student[i].learn();
			else
				student[i].doHomeWork(hour);

		} else
			System.out.println("学生不存在，请重新输入:");
	}

	// 查看老师
	public void showTea(String name, int hour) {
		int i = -1;
		boolean T = false;

		for (int j = 0; j < teacherNum; j++) {
			if (name.equals(teacher[j].getName())) {
				i = j;
				T = true;
				break;
			}

		}
		if (T) {

			if (hour >= 8 && hour <= 17)
				teacher[i].teach();
			else{
				for (int j = 0; j < studentNum; j++) {
					
					teacher[i].checkHomeWork(student[j]);
				}
			}
			

		} else
			System.out.println("教师不存在，请重新输入:");

	}

}