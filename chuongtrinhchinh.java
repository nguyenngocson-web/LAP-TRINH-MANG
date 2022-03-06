package sanpham;

public class chuongtrinhchinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			sanpham sp1 = new sanpham("Màn hinh", 100000,0.2);
			sanpham sp2 = new sanpham("CPU",220000,0.1);
		// Nhập dữ liệu
			sp1.nhap();
			sp2.nhap();
		// xuất dữ liệu
			sp1.xuat();
			sp2.xuat();
	}

}
