package ooppractice.ThucHanh2;

public class SDDIem {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem a = new Diem(3, 4);
		System.out.print("Toa do diem A la: A");
		a.hienThi();
		System.out.println();
		
		Diem b = new Diem();
		System.out.println("Nhap diem B.");
		b.nhapDiem();
		System.out.print("Diem vua nhap la: B");
		b.hienThi();
		System.out.println();
		
		Diem c = new Diem(-b.giaTriX(), -b.giaTriY());
		System.out.print("Toa do cua diem C doi xung voi B qua goc toa do la: C");
		c.hienThi();
		System.out.println();
		
		System.out.printf("Khoang cach tu B toi goc toa do la: %.3f", b.khoangCach());
		System.out.println();
		System.out.printf("Khoan cach tu diem A toi diem B la: %.3f", a.khoangCach(b));
	}

}
