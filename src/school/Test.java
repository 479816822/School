package school;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		School school = new School();
		Scanner input = new Scanner(System.in);
		System.out.print("请输入今年大一学生的数目:");
		int num = input.nextInt();
		System.out.print("请输入今年大一安排的教师数:");
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
				System.out.println("请输入你需要查看学生的名字:");
				String name = input.next();
				System.out.println("请输入查看的时间:");
				int hour = input.nextInt();
				school.showStu(name, hour);
				break;
			case 2:
				System.out.println("请输入你需要查看老师的名字:");
				String name1 = input.next();
				System.out.println("请输入查看的时间:");
				int hour1 = input.nextInt();
				school.showTea(name1, hour1);
				break;

			default:
				break;
			}
		}
	}
}
