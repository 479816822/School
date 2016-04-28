package school;

import java.util.Scanner;

public class Package_course {

	public static void main(String[] args) {
		System.out.println("请随机输入一个数：");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		
		int num=(int)(Math.random()*100*n)%n;
		System.out.println(num);
	}
}
