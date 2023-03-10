package ooppractice.ThucHanh3;

import ooppractice.ThucHanh2.Date;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
