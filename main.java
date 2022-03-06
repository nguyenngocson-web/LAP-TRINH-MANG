package BT2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//khởi tạo một object hcn thuộc class HinhChuNhat để sử dụng các thuộc tính trong class này
        HinhChuNhat hcn = new HinhChuNhat();
        Scanner scanner = new Scanner(System.in);
        
        //yêu cầu người dùng nhập vào chiều dài và chiều rộng
        System.out.println("nhập vào chiều dài : ");
        hcn.setDai(scanner.nextDouble());
        System.out.println("nhập vào chiều rộng : ");
        hcn.setRong(scanner.nextDouble());
        
        //gọi hàm tính chu vi và diện tích ở class HinhChuNhat bằng cách sử dụng object vừa mới được tạo là hcn
        System.out.println("chu vi hình chữ nhật là : " + hcn.tinhChuVi());
        System.out.println("diện tích hình chữ nhật là : " + hcn.tinhDienTich());
        
        
    }

}
