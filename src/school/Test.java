package school;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		School school = new School();
		Scanner input = new Scanner(System.in);
		System.out.print("����������һѧ������Ŀ:");
		int num = input.nextInt();
		System.out.print("����������һ���ŵĽ�ʦ��:");
		int nums = input.nextInt();
		school.creatStu(num);
		school.createTea(nums);
		while (true) {
			school.showMenu();
			int choice = input.nextInt();
			if (choice == 0)
				break;
			switch (choice) {
			case 1:
				System.out.println("����������Ҫ�鿴ѧ��������:");
				String name = input.next();
				System.out.println("������鿴��ʱ��:");
				int hour = input.nextInt();
				school.showStu(name, hour);
				break;
			case 2:
				System.out.println("����������Ҫ�鿴��ʦ������:");
				String name1 = input.next();
				System.out.println("������鿴��ʱ��:");
				int hour1 = input.nextInt();
				school.showTea(name1, hour1);
				break;

			default:
				break;
			}
		}
	}
}
