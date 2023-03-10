//package oop-practice.ThucHanh3;

public class SDGach {
    public static void showMinCost(Gach dsGach[], int n)
    {
        Gach min_cost = dsGach[0];
        for (int i = 0; i < n; i++)
        {
            if (dsGach[i].cost() < min_cost.cost())
            {
                min_cost = dsGach[i];
            }
        }

        min_cost.showInfor();
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap n: ");
        n = Gach.getInt();
        Gach dsGach[] = new Gach[n];
        for (int i = 0; i < n; i++)
        {
            dsGach[i] = new Gach();
            System.out.printf("\nNhap loai gach thu %d:\n", i+1);
            dsGach[i].getInfor();
        }
        
        System.out.printf("\nTrong mang co %d phan tu.", n);
        for (int i = 0; i < n; i++)
        {
            dsGach[i].showInfor();
        }

        System.out.printf("\nLoai gach co chi phi lot thap nhat la:\n");
        showMinCost(dsGach, n);
    }
}
