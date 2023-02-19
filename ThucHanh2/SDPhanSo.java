public class SDPhanSo {
    public static void main(String[] args) {
        PhanSo a = new PhanSo(3, 7);
        PhanSo b = new PhanSo(4, 9);

        System.out.print("Gia tri cua phan so a la: ");	
		a.hienThi();
        System.out.println();
        System.out.print("Gia tri cua phan so b la: ");	
		b.hienThi();

        // PhanSo x = new PhanSo();
        // PhanSo y = new PhanSo();
        // System.out.println();
        // System.out.println("Nhap gia tri cho phan so x: ");	
        // x.nhapPhanSo();
        // System.out.println("Nhap gia tri cho phan so y: ");	
        // y.nhapPhanSo();

        // PhanSo nghich_dao_x = x.giaTriNghichDao();
        // System.out.println();
        // System.out.print("Gia tri nghich dao cua phan so x la: ");	
	    // nghich_dao_x.hienThi();

        // PhanSo tong = x.congPhanSo(y);
        // System.out.println();
        // System.out.print("Tong cua x va y la: ");	
	    // tong.hienThi();

        System.out.println("\n");
        System.out.print("Nhap so luong phan tu cua mang phan so: ");	
        int n = PhanSo.getValue();

        PhanSo mangPhanSo[] = new PhanSo[n];
        for (int i = 0; i < n; i++)
        {
            mangPhanSo[i] = new PhanSo();
            System.out.println();
            System.out.printf("Nhap phan tu thu %d: \n", i + 1);
            mangPhanSo[i].nhapPhanSo();
        }
    }
}
