package BT1;

import java.util.Scanner;

public class Lab1Bai1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		// Nhập họ tên
		System.out.print("Họ tên: ");
		String hoTen = sc.nextLine();
		// Nhập điểm 
		System.out.print("Điểm: ");
		double diemTB = sc.nextDouble();
		System.out.println("========================");
		// Xuất ra màn hình
		System.out.printf("%s %f điểm", hoTen, diemTB);
	}
}