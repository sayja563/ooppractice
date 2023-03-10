package ooppractice.thuchanh2;

import java.util.Scanner;

public class Diem {
 	private int x, y;
	
	
	public Diem()
	{
		this.x = 0;
		this.y = 0;
	}
	
	public Diem(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	
	public void nhapDiem()
	{
		Scanner sc = new Scanner(System.in);
		String input;
		
		System.out.print("Nhap x: ");
		input = sc.nextLine();		
		try
		{
			this.x = Integer.parseInt(input);
		}
		catch (Exception e)
		{
			System.out.println("Loi nhap lieu.");
		}
		
		System.out.print("Nhap y: ");
		input = sc.nextLine();
		try
		{
			this.y = Integer.parseInt(input);
		}
		catch (Exception e)
		{
			System.out.println("Loi nhap lieu.");
		}
	}
	
	public void hienThi()
	{
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
	
	public int giaTriX()
	{
		return this.x;
	}
	
	public int giaTriY()
	{
		return this.y;
	}
	
	
	public void doiDiem(int dX, int dY)
	{
		this.x += dX;
		this.y += dY;
	}
	
	public float khoangCach()
	{
		double khoang_cach = 0;
		khoang_cach = Math.sqrt(this.x * this.x + this.y * this.y);
		
		return (float)khoang_cach;
	}
	
	public float khoangCach(Diem d)
	{
		double khoang_cach = 0;
		khoang_cach = Math.sqrt((this.x - d.x) * (this.x - d.x) + (this.y - d.y) * (this.y - d.y));
		
		return (float)khoang_cach;
	}

}