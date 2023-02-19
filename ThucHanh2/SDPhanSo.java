public class SDPhanSo {

    public static PhanSo tongMang(PhanSo mangPhanSo[], int n)
    {
        PhanSo tong = new PhanSo();

        for (int i = 0; i < n; i++)
        {
            System.out.println();
            System.out.printf("Phan tu thu %d: ", i+1);	
	        mangPhanSo[i].hienThi();
            tong = tong.congPhanSo(mangPhanSo[i]);
        }

        return tong;
    }

    public static PhanSo phanSoLonNhat(PhanSo mangPhanSo[], int n)
    {
        PhanSo max = mangPhanSo[0];

        for (int i = 1; i < n; i++)
        {
            if (mangPhanSo[i].lonHon(max))
            {
                max = mangPhanSo[i];
            }
        }

        return max;
    }

    public static void sapXepMang(PhanSo mangPhanSo[], int n)
    {
        for (int i = 0; i < n-1; i++)
        {
            for (int j = i+1; j < n; j++)
            {
                if (mangPhanSo[i].lonHon(mangPhanSo[j]))
                {
                    PhanSo temp = mangPhanSo[i];
                    mangPhanSo[i] = mangPhanSo[j];
                    mangPhanSo[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        PhanSo a = new PhanSo(3, 7);
        PhanSo b = new PhanSo(4, 9);

        System.out.print("Gia tri cua phan so a la: ");	
		a.hienThi();
        System.out.println();
        System.out.print("Gia tri cua phan so b la: ");	
		b.hienThi();

        PhanSo x = new PhanSo();
        PhanSo y = new PhanSo();
        System.out.println();
        System.out.println("Nhap gia tri cho phan so x: ");	
        x.nhapPhanSo();
        System.out.println("Nhap gia tri cho phan so y: ");	
        y.nhapPhanSo();

        PhanSo nghich_dao_x = x.giaTriNghichDao();
        System.out.println();
        System.out.print("Gia tri nghich dao cua phan so x la: ");	
	    nghich_dao_x.hienThi();

        PhanSo tong = x.congPhanSo(y);
        System.out.println();
        System.out.print("Tong cua x va y la: ");	
	    tong.hienThi();

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
        
        PhanSo tong_mang = tongMang(mangPhanSo, n);
        System.out.println();
        System.out.print("Tong tat ca cac phan tu trong mang la: ");	
	    tong_mang.hienThi();

        PhanSo max = phanSoLonNhat(mangPhanSo, n);
        System.out.println();
        System.out.print("Phan tu lon nhat trong mang la: ");	
	    max.hienThi();

        sapXepMang(mangPhanSo, n);
        System.out.println("\n");
        System.out.print("Mang sau khi sap xep: ");
        for (int i = 0; i < n; i++)
        {
            mangPhanSo[i].hienThi();
            System.out.print("  ");
        }
    }
}
