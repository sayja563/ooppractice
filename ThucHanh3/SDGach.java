package ooppractice.ThucHanh3;

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
    
    public static float costForArea(Gach gach, int i, int j) {
		float result = 0;
		result = gach.soLuongHop(i, j) * gach.getPrice();
		
		return result;
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
        
        System.out.printf("\nCo %d loai gach duoc nhap.", n);
        for (int i = 0; i < n; i++)
        {
            dsGach[i].showInfor();
        }

        System.out.printf("\nLoai gach co chi phi lot thap nhat la:\n");
        showMinCost(dsGach, n);
        
        for (int i = 0; i < n; i++)
        {
        	System.out.printf("Chi phi mua gach de lot phan nen 5 x 20 cua loai gach %s la %.3f.\n", dsGach[i].getID(), costForArea(dsGach[i], 5, 20));
        }            
    }
	
}
