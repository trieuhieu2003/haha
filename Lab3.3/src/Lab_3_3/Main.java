package Lab_3_3;

import java.util.ArrayList;
import java.util.Scanner;1

public class Main {
	public static void main(String[] args) {
    	ArrayList<HangHoa> dsHH = new ArrayList<HangHoa>();
    	int luaChon =0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Nhap tuy chon : ");
			System.out.println(
					  "1.Nhap hang dien may \n"
					+ "2.Nhap hang sanh su \n"
					+ "3.Nhap hang thuc pham\n"
					+ "4.in ra \n"
					+ "0.Thoat  \n");
			System.out.println("Nhap Lua Chon Cua Ban 	: ");
			luaChon = sc.nextInt();
			sc.nextLine();
			switch (luaChon) {
			case 1: {
				HangDienMay hdm = new HangDienMay(null, null, null, 0, 0, 0, 0);
                hdm.nhap();
                dsHH.add(hdm);
                break;
			}
			case 2: {
				HangSanhSu hss = new HangSanhSu(null, null, null, 0, null);
				hss.nhap();
				dsHH.add(hss);
				break;
			}
			case 3: {
				HangThucPham htp = new HangThucPham(null, null, null, 0, null, null, null);
				htp.nhap();
				dsHH.add(htp);
				break;
			}
			case 4: {
				if(dsHH.size() == 0) {
					System.out.println("Danh Sach Rong!!!");
				}
				else {
					 for (HangHoa hangHoa : dsHH) {
							System.out.println(hangHoa);
							System.out.println();
							}
				}
			}
			default:
				System.out.println("Nhap sai lua chon (1->4) : ");
				break;
			}
		
		}while(luaChon !=0);
		
	}
}