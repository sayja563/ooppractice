package ooppractice.ThucHanh3;

import java.util.Scanner;

public class DoanThang {
	
	private Diem from, to;
	
	
	
	public DoanThang()
	{
		this.from = new Diem();
		this.to = new Diem();
	}
	
	public DoanThang(Diem from, Diem to)
	{
		this.from = new Diem(from);
		this.to = new Diem(to);
	}
	
	public DoanThang(int ax, int ay, int bx, int by)
	{
		this.from = new Diem(ax, ay);
		this.to = new Diem(bx, by);
	}
	
	public static int getInt()
    {
		Scanner sc = new Scanner(System.in);
	    String input;
        int value = 0;           
        do 
        {
            try
            {
            	input = sc.nextLine();
                value = Integer.parseInt(input);
            }
            catch (Exception e)
            {
                System.out.println("Loi nhap lieu. Moi nhap lai.");
            }
            
        } while (value == 0);

        return value;
    }
	
	public void nhapToaDo()
	{
		int x, y;
		System.out.print("Nhap diem dau:\n");
		System.out.print("Nhap x: ");
		x = getInt();
		System.out.print("Nhap y: ");
		y = getInt();
		this.from.setDiem(x, y);
		
		System.out.print("\nNhap diem cuoi:\n");
		System.out.print("Nhap x: ");
		x = getInt();
		System.out.print("Nhap y: ");
		y = getInt();
		this.to.setDiem(x, y);
	}
	
	public void hienThiDoanThang()
	{
		System.out.printf("Doan thang co hai dau A(%d, %d) va B(%d, %d).\n", from.getX(), from.getY(), to.getX(), to.getY());
	}
	
	public void tinhTien(int dx, int dy)
	{
		this.from.tinhTien(dx, dy);
		this.to.tinhTien(dx, dy);
	}
	
	public float doDai()
	{
		float do_dai = 0f;
		float x_2 = (to.getX() - from.getX()) * (to.getX() - from.getX());
		float y_2 = (to.getY() - from.getY()) * (to.getY() - from.getY());
		do_dai = (float)Math.sqrt((double)(x_2 + y_2));
		
		return do_dai;
	}
	
	public double gocVsTrucHoanh()
	{
		double t = (Math.abs((double)(to.getY() - from.getY()))) / this.doDai();
		return Math.toDegrees(Math.acos(t));
	}
}
