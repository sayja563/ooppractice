package ooppractice.thuchanh3;

import java.util.Scanner;

public class Gach {
    private String id;
    private String color;
    private int quantity, width, length;
    private long price;

    public Gach()
    {
        id = "";
        color = "";
        quantity = 0;
        width = 0;
        length = 0;
        price = 0;
    }

    public Gach(String id, String color, int quantity, int width, int length, int price)
    {
        this.id = id;
        this.color = color;
        this.quantity = quantity;
        this.width = width;
        this.length = length;
        this.price = price;
    }

    public Gach(Gach gach)
    {
        this.id = gach.id;
        this.color = gach.color;
        this.quantity = gach.quantity;
        this.width = gach.width;
        this.length = gach.length;
        this.price = gach.price;
    }
    
    public long getPrice()
    {
    	return this.price;
    }
    
    public String getID()
    {
    	return this.id;
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

    public static long getLong()
    {
    	Scanner sc = new Scanner(System.in);
        String input;
        long value = 0;        
        do 
        {
            try
            {
            	input = sc.next();
                value = Long.parseLong(input);
            }
            catch (Exception e)
            {
                System.out.println("Loi nhap lieu. Moi nhap lai.");
            }
            
        } while (value == 0);

        return value;
    }

    public void getInfor()
    {
        System.out.print("Nhap ID: ");
        this.id = getString();

        System.out.print("Nhap mau gach: ");
        this.color = getString();

        System.out.print("Nhap so luong gach trong hop: ");
        this.quantity = getInt();

        System.out.print("Nhap chieu rong cua gach (cm): ");
        this.width = getInt();

        System.out.print("Nhap chieu dai cua gach (cm): ");
        this.length = getInt();

        System.out.print("Nhap gia cua hop gach (vnd): ");
        this.price = getLong();
    }

    public void showInfor()
    {
        System.out.println();
        System.out.println("|================== GACH ===================|");
        System.out.printf("| ID: %37s |\n", this.id);
        System.out.printf("| Mau gach: %31s |\n", this.color);
        System.out.printf("| So luong gach trong hop: %16d |\n", this.quantity);
        System.out.printf("| Chieu rong gach(cm): %20d |\n", this.width);
        System.out.printf("| Chieu dai gach(cm): %21d |\n", this.length);
        System.out.printf("| Gia (vnd): %30d |\n", this.price);
        System.out.println("|===========================================|");
    }

    public float giaBanLe()
    {
        float price_of_each_brick = (float)this.price / (float)this.quantity;
        price_of_each_brick += (price_of_each_brick * 0.2f);

        return price_of_each_brick;
    }

    public float maxArea()
    {
        float area_of_brick = this.width * this.length;
        return area_of_brick * this.quantity;
    }

    public float cost()
    {
        float _cost = 0f;
        _cost = (float)this.price / (float)(this.width * this.length *this.quantity);

        return _cost;
    }

    public int soLuongHop(int d, int n)
    {
        int amount = 0;
        int area = d * n;
        amount = (area * 10000) / (int)this.maxArea();
        amount++;

        return amount;
    }
}
