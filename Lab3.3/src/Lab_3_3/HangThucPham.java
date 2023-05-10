package Lab_3_3;

import java.util.Scanner;

public class HangThucPham extends HangHoa {
	private static final String Null = null;
	private String ngaySanXuat;
	private String ngayHetHan;
	
	
	public HangThucPham(String maHang, String tenHang, String nhaSanXuat, double gia, String ngaySanXuat,
			String ngayHetHan, HangHoa hh) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}
	
	public String getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(String ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public String getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(String ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	HangHoa hh = new HangHoa(Null, Null, Null, 0);
	public void nhap() {
		hh.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ngay san xuat : ");
		System.out.print("Nhap Ngay - Thang - Nam : ");
		ngaySanXuat = sc.nextLine();
		System.out.println("Nhap han su dung : ");
		System.out.print("Nhap Ngay - Thang - Nam : ");
		ngayHetHan = sc.nextLine();
	}
	@Override
	public String toString() {
		hh.toString();
		return "HangThucPham [ngaySanXuat=" + ngaySanXuat + ", ngayHetHan=" + ngayHetHan + ", hh=" + hh + "]";
	}
	
	
}