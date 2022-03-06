package BT3;

import java.util.Scanner;

public class HinhLapPhuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float canh;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("nhập cạnh của hình lập phương :");
		canh = scanner.nextFloat();
		float thetich = canh*canh*canh;
		
		System.out.printf("thể tích khối hình chữ nhật là: %f", thetich);
	}

}
