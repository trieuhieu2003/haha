package Lab_3_3;

import java.util.Scanner;

public class HangHoa {
	private String maHang;
    private String tenHang;
    private String nhaSanXuat;
    private double gia;
	public HangHoa(String maHang, String tenHang, String nhaSanXuat, double gia) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.nhaSanXuat = nhaSanXuat;
		this.gia = gia;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
    
    public void nhap() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhap ma hang : ");
    	setMaHang(sc.nextLine());
    	System.out.println("Nhap ten hang : ");
    	setTenHang(sc.nextLine());
    	System.out.println("Nhap nha san xuat : ");
    	setNhaSanXuat(sc.nextLine());
    	System.out.println("Nhap gia : ");
    	setGia(sc.nextDouble());
    }
	@Override
	public String toString() {
		return "HangHoa [maHang=" + maHang + ", tenHang=" + tenHang + ", nhaSanXuat=" + nhaSanXuat + ", gia=" + gia
				+ "]";
	}
}