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

	public void setPhanSo(int tu_so, int mau_so)
	{
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
	
	public static int getValue()
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

	public void nghichDao()
	{
		this.setPhanSo(this.mau_so, this.tu_so);
	}

	public PhanSo giaTriNghichDao()
	{
		PhanSo result = new PhanSo(this.mau_so, this.tu_so);
		return result;
	}

	public static int uocChungLonNhat(int a, int b)
	{		
		int ucln = 0;
		if ((a * b) < 0)
		{
			if (a < 0)
			{
				a = -a;
			}
			else 
			{
				b = -b;
			}
		}
		else {
			if (a < 0)
			{
				a = -a;
				b = -b;
			}
		}

		while (ucln == 0)
		{	
			if (a > b)
			{
				if (a % b != 0)
				{
					int temp = b;
					b = a % b;
					a = temp;
				}
				else 
				{
					 ucln = b;
				}
			}
			else 
			{
				if (b % a != 0)
				{
					int temp = a;
					a = b % a;
					b = temp;
				}
				else 
				{
					ucln = a;
				}
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


	public PhanSo congPhanSo(PhanSo x)
	{
		int new_tu_so = this.tu_so * x.mau_so + this.mau_so * x.tu_so;
		int new_mau_so = this.mau_so * x.mau_so;

		PhanSo result = new PhanSo(new_tu_so, new_mau_so);
		result.rutGonPhanSo();
		return result;
	}

	public PhanSo congPhanSo(int x)
	{
		int new_tu_so = (x * this.mau_so) + this.tu_so;
		PhanSo result = new PhanSo(new_tu_so, this.mau_so);
		result.rutGonPhanSo();
		return result;
	}

	public PhanSo truPhanSo(PhanSo x)
	{
		PhanSo temp = new PhanSo(-x.tu_so, x.mau_so);
		PhanSo result = this.congPhanSo(temp);
		return result;
	}

	public PhanSo truPhanSo(int x)
	{
		PhanSo result = this.congPhanSo(-x);
		return result;
	}

	public PhanSo nhanPhanSo(PhanSo x)
	{
		PhanSo result = new PhanSo(this.tu_so * x.tu_so, this.mau_so * x.mau_so);
		result.rutGonPhanSo();
		return result;
	}

	public PhanSo nhanPhanSo(int x)
	{
		PhanSo result = new PhanSo(this.tu_so * x, this.mau_so);
		result.rutGonPhanSo();
		return result;
	}

	public PhanSo chiaPhanSo(PhanSo x)
	{
		PhanSo result = new PhanSo(this.tu_so * x.mau_so, this.mau_so * x.tu_so);
		result.rutGonPhanSo();
		return result;
	}

	public PhanSo chiaPhanSo(int x)
	{
		PhanSo result = new PhanSo(this.tu_so, this.mau_so * x);
		result.rutGonPhanSo();
		return result;
	}

	public static void main(String[] args) {
		PhanSo a = new PhanSo();
		a.nhapPhanSo();
		System.out.println("Gia tri thuc cua phan so la: " + a.giaTriThuc());		
		a.rutGonPhanSo();
		

		PhanSo reserve = a.giaTriNghichDao();
		a.nghichDao();
		System.out.print("Gia tri cua phan so a sau khi rut gon la: ");	
		a.hienThi();
		System.out.println();
		System.out.print("Gia tri cua phan so nghich dao cua a sau khi rut gon la: ");	
		reserve.hienThi();


		// PhanSo b = new PhanSo(4, 5);

		// System.out.println();
		// PhanSo c = a.chiaPhanSo(b);
		// System.out.print("Thuong cua ");
		// a.hienThi();
		// System.out.print(" va ");
		// b.hienThi();
		// System.out.print(" la: ");
		// c.hienThi();


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