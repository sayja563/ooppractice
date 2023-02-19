import java.util.Scanner;

public class PhanSo {
	private int tu_so, mau_so;
	
	public PhanSo()
	{
		this.tu_so = 0;
		this.mau_so = 1;
	}
	
	public PhanSo(int tu_so, int mau_so){
		this.tu_so = tu_so;
		this.mau_so = mau_so;
	}
	
	public void hienThi()
	{
		if (this.tu_so == 0)
		{
			System.out.print("0");
		}
		else if (this.mau_so == 1)
		{
			System.out.print(this.tu_so);
		}
		else
		{
			System.out.print(this.tu_so + "/" + this.mau_so);
		}
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
	
	public boolean hopLe()
	{
		if (this.mau_so == 0)
			return false;
		
		return true;
	}
	
	public void nhapPhanSo()
	{
		do
		{
			System.out.print("Nhap tu so: ");
			this.tu_so = getValue();
			System.out.print("Nhap mau so: ");
			this.mau_so = getValue();
			
			if (!this.hopLe())
			{
				System.out.println("Phan so khong hop le. Moi nhap lai.");
			}
		}
		while (!this.hopLe());
	}
	
	public float giaTriThuc()
	{
		return (float)this.tu_so/this.mau_so;
	}
	
	public boolean lonHon(PhanSo a)
	{
		return (this.tu_so * a.mau_so) > (this.mau_so * a.tu_so);
	}

	public int uocChungLonNhat(int a, int b)
	{		
		int ucln = 0;
		while(ucln != 0)
		{	
			if (a % b == 0)
				ucln = b;
			if (b % a == 0)
				ucln = a;
			
			if (a > b)
			{
				b = a % b;
				a /= b;
			}
			if (a < b)
			{
				a = b % a;
				b /= a;
			}
		}

		return ucln;
	}

	public void rutGonPhanSo()
	{
		int ucln = uocChungLonNhat(this.tu_so, this.mau_so);
		this.tu_so /= ucln;
		this.mau_so /= ucln;
	}


	// public PhanSo congPhanSo(PhanSo x)
	// {

	// }

	public static void main(String[] args) {
		PhanSo a = new PhanSo();
		a.nhapPhanSo();
		System.out.println("Gia tri thuc cua phan so la: " + a.giaTriThuc());		
		a.rutGonPhanSo();
		System.out.println("Gia tri thuc cua phan so sau khi rut gon la: ");	
		a.hienThi();

		// PhanSo b = new PhanSo(4, 6);
		
		// if (a.lonHon(b))
		// {
		// 	System.out.print("Phan so ");
		// 	a.hienThi();
		// 	System.out.print(" lon hon phan so ");
		// 	b.hienThi();
		// }
		// else
		// {
		// 	System.out.print("Phan so ");
		// 	a.hienThi();
		// 	System.out.print(" nho hon phan so ");
		// 	b.hienThi();
		// }
	}

}