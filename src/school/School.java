package school;

import java.util.Scanner;

public class School {

	//����20λѧ���� 3λ��ʦ
	
	private Student [] student =new Student[20];
	private Teacher [] teacher= new Teacher[3];
	private int studentNum;
	private int teacherNum;
	
	//����num��ѧ��
	public void creatStu(int num){
		Scanner input =new Scanner(System.in);
		for (int i = 0; i < num; i++) {
			System.out.println("������"+(i+1)+"ѧ������Ϣ��");
			System.out.print("����:");
			String name =input.next();
			System.out.print("ѧ��:");
			int No=input.nextInt();
			System.out.print("����:");
			int age=input.nextInt();
			System.out.print("�꼶:");
			int grand=input.nextInt();
			System.out.print("�Ա�");
			String sex=input.next();
			student[i]=new Student(name,No,age,grand,sex);
			studentNum++;
		}
	}
	//����numλ��ʦ
	public void createTea(int num){
		Scanner input=new Scanner(System.in);
	
		for (int i = 0; i < num; i++) {
			System.out.println("������"+(i+1)+"ѧ������Ϣ��");
			System.out.print("����:");
			String name =input.next();
			System.out.print("ѧ��:");
			int No=input.nextInt();
			System.out.print("����:");
			int age=input.nextInt();
			System.out.print("�꼶:");
			int grand=input.nextInt();
			System.out.print("�Ա�");
			String sex=input.next();
			System.out.print("����:");
			int teachYears=input.nextInt();
			System.out.print("�γ�:");
			String couse=input.next();
			teacher[i]=new Teacher(name,No,age,grand,sex,teachYears,couse);

		
	}
	
	
}
}