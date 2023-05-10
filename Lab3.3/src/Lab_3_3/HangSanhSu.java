package Lab_3_3;

import java.util.Scanner;


public class HangSanhSu extends HangHoa {
	private static final String Null = null;
	private String loaiNhienLieu;

	public HangSanhSu(String maHang, String tenHang, String nhaSanXuat, double gia, String loaiNhienLieu) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}
	HangHoa hh = new HangHoa(Null, Null, Null, 0);
	public void nhap() {
		hh.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap loai nhien lieu : ");
		setLoaiNhienLieu(sc.nextLine());
	}

	@Override
	public String toString() {
		hh.toString();
		return "HangSanhSu [loaiNhienLieu=" + loaiNhienLieu + ", hh=" + hh + "]";
	}

	
	
}