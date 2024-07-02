import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vd = sc.nextInt();
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int korMax = sc.nextInt();
		int mathMax = sc.nextInt();

		kor = (kor % korMax == 0) ? kor / korMax : kor / korMax + 1;
		math = (math % mathMax == 0) ? math /
				mathMax : math / mathMax + 1;
		if (math > kor)
			vd = vd - math;
		else
			vd = vd - kor;
		System.out.println(vd);

		sc.close();
	}

}
