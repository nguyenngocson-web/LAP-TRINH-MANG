package BT4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, x1, x2, delta;
        String ketQua = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập a (a # 0): ");
            a = scanner.nextDouble();
        } while (a == 0);
        System.out.print("Nhập b: ");
        b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        c = scanner.nextDouble();
        System.out.println("Phương trình bậc hai bạn vừa nhập có dạng: "+a+"x^2 + "+b+"x + "+c+" = 0");
        // tính delta = b * b - 4 * a * c;
        delta = Math.pow(b, 2) - 4 * a * c;
        double candel = Math.sqrt(delta);
        
        System.out.ptintln("Căn delta là : %f",  candel);
        
	}

}
