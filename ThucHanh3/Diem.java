package ooppractice.ThucHanh3;

public class Diem {
	private int x, y;
	
	public Diem()
	{
		x = 0; 
		y = 0;
	}
	
	public Diem(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Diem(Diem t)
	{
		this.x = t.x;
		this.y = t.y;
	}
	
	public void setDiem(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public void tinhTien(int dx, int dy)
	{
		this.x += dx;
		this.y += dy;
	}
}
