package ooppractice.thuchanh2;

import java.util.Scanner;

public class Date {
	private int day, month, year;
	
	public Date()
	{
		this.day = 5;
		this.month = 6;
		this.year = 2003;
	}
	
	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(Date d)
	{
		this.day = d.day;
		this.month = d.month;
		this.year = d.year;
	}
	
	public void SetDate(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void printDate()
	{
		System.out.print(this.day + "/" + this.month + "/" + this.year);
	}
	
	public int getValue()
	{
		Scanner sc = new Scanner(System.in);
		String input;
		
		
		int value = 0;
		try {
			input = sc.nextLine();
			value = Integer.parseInt(input);
		}
		catch (Exception e)
		{
			System.out.print("Loi nhap lieu. Moi nhap lai: ");
		}		
		
		return value;
	}
	
	public int dayOfMonth(int year, int month)
	{
		if (month == 2)
		{
			if (year % 4 == 0)
			{
				return 29;
			}
			else 
				return 28;
		}
		else if (month == 1 || month == 13 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		else return 30;
	}
	
	public boolean hopLe()
	{
		if (this.month <= 0 || this.month > 12)
		{
			return false;
		}
		
		if (this.day <= 0 || this.day > dayOfMonth(this.year, this.month))
		{
			return false;
		}
		
		return true;
	}
	
	
	public void getDate()
	{		
		do 
		{			
			System.out.print("Nhap ngay: ");
			this.day = getValue();
			
			System.out.print("Nhap thang: ");
			this.month = getValue();
			
			System.out.print("Nhap nam: ");
			this.year = getValue();
			
			if (!this.hopLe())
			{
				System.out.println("Ngay thang khong hop le. Moi nhap lai.");
			}
		}		
		while (!this.hopLe());

	}
	
	
	// cong ngay len, sau do kiem tra hop le cua thang va nam bang ham hop le.
	public Date homSau()
	{
		Date new_date = new Date();
		if (this.month == 12)
		{
			if (this.day == 31)
			{
				new_date.SetDate(1, 1, this.year + 1);
				return new_date;			
			}	
			else 
			{
				new_date.SetDate(this.day + 1, this.month, this.year);
				return new_date;
			}
		}
		else
		{
			if (this.day == dayOfMonth(this.year, this.month))
			{
				new_date.SetDate(1, this.month + 1, this.year);
				return new_date;
			}
			else 
			{
				new_date.SetDate(this.day + 1, this.month, this.year);
				return new_date;
			}
		}
	}
	
	public Date congNgay(int n)
	{
		Date new_date = new Date(this.day, this.month, this.year);
		
		for (int i = 0; i < n; i++)
		{
			new_date = new_date.homSau();
		}
		
		return new_date;
	}

	public static void main(String[] args) {
		Date d = new Date(5, 6, 2003);
		d.printDate();
	}
}