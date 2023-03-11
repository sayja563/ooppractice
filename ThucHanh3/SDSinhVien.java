package ooppractice.thuchanh3;

public class SDSinhVien {

    public static SinhVien[] add(SinhVien ds[], SinhVien s)
    {
        SinhVien ds_moi[] = new SinhVien[ds.length + 1];
        for (int i = 0; i < ds.length; i++)
        {
            ds_moi[i] = ds[i];
        }
        ds_moi[ds.length] = s;

        return ds_moi;
    }

    public static void sapXepTen(SinhVien ds[])
    {
        for (int i = 0; i < ds.length; i++)
        {
            for (int j = i + 1; j < ds.length; j++)
            {
                if (ds[i].Ten().compareTo(ds[j].Ten()) > 0)
                {
                    SinhVien t = ds[j];
                    ds[j] = ds[i];
                    ds[i] = t;                    
                }
            }
        }
    }

    public static SinhVien tbCaoNhat(SinhVien ds[])
    {
        float max = 0f;
        int i_max = -1;
        for (int i = 0; i < ds.length; i++)
        {
            if (ds[i].trungBinh() > max)
            {
                max = ds[i].trungBinh();
                i_max = i;
            }
        }

        return ds[i_max];
    }

    public static SinhVien[] canhBao(SinhVien ds[])
    {
        SinhVien cb[] = new SinhVien[0];
        for (SinhVien s : ds)
        {
            if (s.trungBinh() < 1f)
            {
                cb = add(cb, s);
            }
        }

        return cb;
    }

    public static void hienThiDanhSach(SinhVien ds[])
    {
        System.out.println("============================");
        for (SinhVien s : ds)
        {
            System.out.println(s.toString());
            System.out.println("============================\n");
        }
    }
    public static void main(String[] args) {
        //tao, nhap, hien thi thong tin cua 1 sinh vien.
        SinhVien a = new SinhVien();
        a.nhapThongTin();
        a.nhapDiem();
        a.themHocPhan();
        System.out.printf("\nThong tin sinh vien A:\n" + a.toString());

        System.out.println("\n\t\t___TAO DANH SACH SINH VIEN___\n");
        int n;
        System.out.print("Nhap so luong sinh vien: ");
        n = SinhVien.getInt();
        SinhVien dsSV[] = new SinhVien[n];
        System.out.println("___________________________\n");
        
        //nhap thong tin cho tung sinh vien.
        for (int i = 0; i < n; i++)
        {
            dsSV[i] = new SinhVien();
            System.out.printf("Nhap thong tin cho sinh vien thu %d.\n", (i + 1));
            dsSV[i].nhapThongTin();
            dsSV[i].nhapDiem();
            System.out.println("___________________________\n");
        }

        //sap xep danh sach sinh vien theo ten.
        sapXepTen(dsSV);
        System.out.println("\n\t\t___DANH SACH SINH VIEN SAP XEO THEO TEN___\n");
        hienThiDanhSach(dsSV);

        //tim sinh vien co diem trung binh cao nhat.
        System.out.printf("\nSinh vien co diem trung binh cao nhat la sinh vien co ma so %s.\n", tbCaoNhat(dsSV).getID());
        System.out.println("Voi diem trung binh la " + tbCaoNhat(dsSV).trungBinh());

        //danh sach sinh vien bi canh bao hoc vu.
        SinhVien cb[] = canhBao(dsSV);
        System.out.println("___DANH SACH SINH VIEN BI CANH BAO HOC VU___\n");
        hienThiDanhSach(cb);
    }
}
