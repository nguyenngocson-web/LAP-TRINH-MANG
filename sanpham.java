package sanpham;

import java.util.Scanner;

public class sanpham {
	private String tenSP;
	private double donGia;
	private double giamGia;
	//Hàm tạo đủ 3 tham số
	public sanpham(String _tenSP, double _donGia, double _giamGia)
	{
		tenSP = tenSP;
		donGia= donGia;
		giamGia=giamGia;
	}
	public double getThueNhapKhau(){
		return donGia*0.1;
	}
	public  void nhap(){
		Scanner bp = new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm :");
		tenSP = bp.nextLine();
		System.out.print("Nhập đơn gia sp  :");
		donGia = bp.nextDouble();
		System.out.print("Nhập mã giảm giá sp :");
		giamGia = bp.nextDouble();
		
		}
	public void xuat(){
	System.out.println("tên sản phẩm :" + tenSP);
	System.out.println("giá sản phẩm :" + String.valueOf(donGia));
	System.out.println("Giam giá :" + String.valueOf(giamGia));
	System.out.println("Thuế nhập khẩu :" + String.valueOf(getThueNhapKhau()));
	}
}
