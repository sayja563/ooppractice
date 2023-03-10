package ooppractice.ThucHanh2;

public class SDDate {
    public static void main(String[] args) {
		
		Date date = new Date();
		date.getDate();
		System.out.print("Ngay: ");
		date.printDate();
		System.out.println();
		Date next_day = date.homSau();
		System.out.print("Ngay hom sau la: ");
		next_day.printDate();
		System.out.println("\n");
		
		
		Date date_2 = new Date(5, 6, 2003);
		if (date_2.hopLe())
		{
			System.out.print("Ngay ");
			date_2.printDate();
			System.out.println(" hop le.");
			

			System.out.print("Ngay ");
			date_2.printDate();
			Date cong_ngay = date_2.congNgay(50);
			System.out.print(" sau khi cong them 50 ngay la: ");
			cong_ngay.printDate();
		}
		else
		{
			System.out.print("Ngay ");
			date_2.printDate();
			System.out.println(" khong hop le.");
		}
		
	}
}
