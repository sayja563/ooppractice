package ooppractice.ThucHanh3;

public class SDDoanThang {

	public static void main(String[] args) {
		Diem a = new Diem(2, 5);
		Diem b = new Diem(20, 35);
		DoanThang ab = new DoanThang(a, b);
		ab.hienThiDoanThang();
		ab.tinhTien(5,  3);
		System.out.print("AB sau khi tinh tien : \n");
		ab.hienThiDoanThang();
		
		DoanThang cd = new DoanThang();
		cd.nhapToaDo();
		cd.hienThiDoanThang();
		System.out.printf("Goc giua CD va truc hoanh la %.2f.\n", cd.gocVsTrucHoanh());

	}

}
