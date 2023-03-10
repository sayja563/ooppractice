package ooppractice.thuchanh3;

import java.util.Scanner;

import ooppractice.thuchanh2.Date;


public class SinhVien {
	
	private String id;
	private String ten;
	private Date ngay_sinh;
	private int so_hp;
	private String[] ten_hp;
	private String[] diem;
	
	public SinhVien() {}
	
	public SinhVien(String id, String ten, Date ngay_sinh, int so_hp, String[] ten_hp, String[] diem)
	{
		this.id = id;
		this.ten = ten;
		this.ngay_sinh = new Date(ngay_sinh);
		this.so_hp = so_hp;
		for (int i = 0; i < ten_hp.length; i++)
		{
			this.ten_hp[i] = ten_hp[i];
		}		
		for (int i = 0; i < diem.length; i++)
		{
			this.diem[i] = diem[i];
		}
	}
	
	public SinhVien(SinhVien s)
	{
		this.id = s.id;
		this.ten = s.ten;
		this.ngay_sinh = new Date(s.ngay_sinh);
		this.so_hp = s.so_hp;
		for (int i = 0; i < s.ten_hp.length; i++)
		{
			this.ten_hp[i] = ten_hp[i];
		}		
		for (int i = 0; i < s.diem.length; i++)
		{
			this.diem[i] = diem[i];
		}
	}

	public static String getString()
    {             
    	Scanner sc = new Scanner(System.in);
        String input;
        String value = "";        
        do
        {	
        	value = sc.nextLine();
        } while (value.length() <= 0);

        return value;
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


	public void nhapThongTin()
	{
		System.out.printf("Nhap Ma So Sinh Vien: ");
		this.id = getString();
		System.out.printf("Nhap Ho Ten Sinh Vien: ");
		this.ten = getString();
		System.out.printf("Nhap Ngay Sinh: ");
		this.ngay_sinh.getDate();
		System.out.printf("Nhap So Luong Hoc Phan Cua Sinh Vien: ");
		this.so_hp = getInt();

		System.out.printf("Nhap Ten Hoc Phan: \n");
		for (int i = 0; i < this.so_hp; i++)
		{
			System.out.printf("Hoc phan thu %d: ", i+1);
			ten_hp[i] = getString();
		}

		for (int i = 0; i < this.so_hp; i++)
		{
			System.out.printf("Nhap diem cua hoc phan %s: ", ten_hp[i]);
			diem[i] = getString();
		}
	}

	public static void main(String[] args) {
		SinhVien s = new SinhVien();
		s.nhapThongTin();
	}

}
