import java.util.Scanner;
public class DienTich {
	public static void main(String[] args) {
		double dientich;
		final double pi = 3.14159;
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        double r = scanner.nextDouble();
        dientich = r*r*pi;
        System.out.print("Dien tich hinh tron la: "+dientich);
	}

}
