import java.util.Scanner;

public class ChuVi {
	public static void main(String[] args) {
	try {
		double chuvi;
		final double pi = 3.14159;
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        double r = scanner.nextDouble();
        chuvi = 2*r*pi;	
        System.out.print("Chu vi hinh tron la: "+chuvi);	
	} catch (Exception e) {
		System.out.println("Nhập sai dữ liệu.");
	}

	}

}
