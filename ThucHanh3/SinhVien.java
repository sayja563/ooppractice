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
	
	public SinhVien() {
		this.id = "";
		this.ten = "";
		this.ngay_sinh = new Date();
		this.so_hp = 0;
		this.ten_hp = null;
		this.diem = null;
	}
	
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

	public String Ten()
	{
		return this.ten;
	}

	public String getID()
	{
		return this.id;
	}

	public static String[] add(String arr[], String x, int n)
	{
		String newarr[] = new String[n + 1];
		for (int i = 0; i < n; i++)
		{
			newarr[i] = arr[i];
		}
		newarr[n] = x;

		return newarr;
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
		System.out.printf("Nhap Ngay Sinh: \n");
		this.ngay_sinh.getDate();
		System.out.printf("Nhap So Luong Hoc Phan Cua Sinh Vien: ");
		this.so_hp = getInt();

		System.out.printf("Nhap Ten Hoc Phan: \n");
		this.ten_hp = new String[so_hp];
		for (int i = 0; i < this.so_hp; i++)
		{
			System.out.printf("Hoc phan thu %d: ", i+1);
			ten_hp[i] = getString();
		}		
	}

	public static int ktDiem(String x)
	{
		switch (x)
		{
			case "a":
			case "A":
			case "b+":
			case "B+":
			case "b":
			case "B":
			case "c+":
			case "C+":
			case "c":
			case "C":
			case "d+":
			case "D+":
			case "d":
			case "D":
			case "f":
			case "F":
				return 1;
			default:
				return 0;
		}
	}

	public void nhapDiem()
	{
		this.diem = new String[so_hp];
		for (int i = 0; i < this.so_hp; i++)
		{
			System.out.printf("Nhap diem cua hoc phan %s: ", ten_hp[i]);			
			do {
				diem[i] = getString();
				if (ktDiem(diem[i]) == 0)
				{
					System.out.printf("Diem khong hop le. Moi nhap lai: ");
				}
			} while (ktDiem(diem[i]) == 0);
		}
	}

	public String toString()
	{
		String result = "MSSV: " + this.id + "\nHo Ten Sinh Vien: " + this.ten
						+ "\nNgay Sinh: " + this.ngay_sinh.printDate() 
						+ "\nSo luong hoc phan: " + this.so_hp;

		for (int i = 0; i < this.so_hp; i++)
		{
			result += "\n\t" + this.ten_hp[i] + "\t" + this.diem[i];
		}

		return result;
	}

	public static float doiDiem(String x)
	{
		switch (x)
		{
			case "a":
			case "A":
				return 4f;
			case "b+":
			case "B+":
				return 3.5f;
			case "b":
			case "B":
				return 3f;
			case "c+":
			case "C+":
				return 2.5f;
			case "c":
			case "C":
				return 2f;
			case "d+":
			case "D+":
				return 1.5f;
			case "d":
			case "D":	
				return 1f;	
			default:
				return 0f;	
		}
	}

	public float trungBinh()
	{
		float tb = 0f;
		for (int i = 0; i < this.so_hp; i++)
		{
			tb += doiDiem(this.diem[i]);
		}
		tb /= (float)this.so_hp;

		return tb;
	}

	public void themHocPhan()
	{
		System.out.print("Thuc Hien Them Hoc Phan:\n");		
		this.ten_hp = add(this.ten_hp, "", this.ten_hp.length);
		this.diem = add(this.diem, "", this.diem.length);
		
		System.out.printf("Hoc phan thu %d: ", (this.so_hp + 1));
		ten_hp[this.so_hp] = getString();

		System.out.printf("Nhap diem cua hoc phan %s (diem chu): ", (this.ten_hp[this.so_hp] + 1));
		diem[this.so_hp] = getString();
		
		this.so_hp++;
	}

	public void xoaHocPhan()
	{
		System.out.printf("\nThuc Hien Thao Tac Xoa Hoc Phan.\n");
		int key = 0;
		for (int i = 0; i < this.so_hp; i++)
		{
			System.out.printf((i + 1) + ". " + this.ten_hp[i] + "\n");
		}
		System.out.printf("\nNhap so thu tu cua hoc phan muon xoa: ");
		key = getInt();

		for (int i = key; i < this.so_hp; i++)
		{
			this.ten_hp[i - 1] = this.ten_hp[i];
			this.diem[i - 1] = this.diem[i];
		}

		this.so_hp--;
	}
}
