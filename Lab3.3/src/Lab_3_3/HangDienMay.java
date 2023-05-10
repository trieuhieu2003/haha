package Lab_3_3;

import java.util.Scanner;

public class HangDienMay extends HangHoa {
	private static final String Null = null;
	private int thoiGianBaoHanh;
    private float dienAp;
    private float congSuat;
	
    
	public HangDienMay(String maHang, String tenHang, String nhaSanXuat, double gia, int thoiGianBaoHanh, float dienAp,
			float congSuat) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.dienAp = dienAp;
		this.congSuat = congSuat;
	}
	
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public float getDienAp() {
		return dienAp;
	}

	public void setDienAp(float dienAp) {
		this.dienAp = dienAp;
	}

	public float getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(float congSuat) {
		this.congSuat = congSuat;
	}

	public static String getNull() {
		return Null;
	}
    HangHoa hh = new HangHoa(Null, Null, Null, 0);
	public void nhap() {
		hh.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Thoi gian bao hanh la : ");
		setThoiGianBaoHanh(sc.nextInt());
		System.out.println("Dien ap la : ");
		setDienAp(sc.nextFloat());
		System.out.println("Cong Suat la : ");
		setCongSuat(sc.nextFloat());
		
	}

	@Override
	public String toString() {
		hh.toString();
		return "HangDienMay [thoiGianBaoHanh=" + thoiGianBaoHanh + ", dienAp=" + dienAp + ", congSuat=" + congSuat
				+ ", hh=" + hh + "]";
	}

	
	
	
}