package school;

import java.util.Scanner;

public class School {

	// ����20λѧ���� 3λ��ʦ

	private Student[] student = new Student[20];
	private Teacher[] teacher = new Teacher[3];
	private int studentNum;
	private int teacherNum;

	static Scanner input = new Scanner(System.in);

	// ����num��ѧ��
	public void creatStu(int num) {

		for (int i = 0; i < num; i++) {
			System.out.println("������" + (i + 1) + "ѧ������Ϣ��");
			System.out.print("����:");
			String name = input.next();
			System.out.print("ѧ��:");
			int No = input.nextInt();
			System.out.print("����:");
			int age = input.nextInt();
			System.out.print("�꼶:");
			int grand = input.nextInt();
			System.out.print("�Ա�");
			String sex = input.next();
			Student stu = new Student(name, No, age, grand, sex);
			student[i] = stu;
			studentNum++;
		}
	}

	// ����numλ��ʦ
	public void createTea(int num) {

		for (int i = 0; i < num; i++) {
			System.out.println("������" + (i + 1) + "��ʦ����Ϣ��");
			System.out.print("����:");
			String name = input.next();
			System.out.print("ѧ��:");
			int No = input.nextInt();
			System.out.print("����:");
			int age = input.nextInt();
			System.out.print("�꼶:");
			int grand = input.nextInt();
			System.out.print("�Ա�");
			String sex = input.next();
			System.out.print("����:");
			int teachYears = input.nextInt();
			System.out.print("�γ�:");
			String couse = input.next();
			Teacher tea = new Teacher(name, No, age, grand, sex, teachYears, couse);
			teacher[i] = tea;
			teacherNum++;

		}

	}
	// ����ѧ������ʦ���ڵĶ���

	public void showMenu() {
		System.out.println("***********************");
		System.out.println("\nSchool����ϵͳ");
		System.out.println("************************");

		// �˵�ѡ��
		System.out.println("1.�鿴ѧ��\n2.�鿴��ʦ\n0.�˳���");

	}

	// �鿴ѧ��
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
			System.out.println("ѧ�������ڣ�����������:");
	}

	// �鿴��ʦ
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
			System.out.println("��ʦ�����ڣ�����������:");

	}

}