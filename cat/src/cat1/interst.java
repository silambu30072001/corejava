package cat1;

import java.util.Scanner;

public class interst {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the prize 0r amount");
		int p=sc.nextInt();
		System.out.println("enter the time(month)");
		int t=sc.nextInt();
		System.out.println("total rate");
		double r=sc.nextDouble();
		double ptr=p*t*r/100;
		System.out.println(ptr);
	}

}
