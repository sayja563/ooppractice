import java.util.Scanner;

public class Gach {
    private String id;
    private String color;
    private int quantity, width, length;
    private long price;

    private static Scanner sc = new Scanner(System.in);
    private static String input;

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

    public static String getString()
    {               
        String value = "";
        
        do{
            value = sc.nextLine();
        } while (value == "");

        return value;
    }

    public static int getInt()
    {
        int value = 0;       
        input = sc.nextLine();
        do 
        {
            try
            {
                value = Integer.parseInt(input);
            }
            catch (Exception e)
            {
                System.out.println("Loi nhap lieu. Moi nhap lai.");
            }
            
        } while (value == 0);
        //sc.close();        

        return value;
    }

    public static long getLong()
    {
        long value = 0;  
        input = sc.next();
        do 
        {
            try
            {
                value = Long.parseLong(input);
            }
            catch (Exception e)
            {
                System.out.println("Loi nhap lieu. Moi nhap lai.");
            }
            
        } while (value == 0);
        //sc.close();        

        return value;
    }

    public void getInfor()
    {
        System.out.print("Enter Box ID: ");
        this.id = getString();

        System.out.print("Enter Brick Color: ");
        this.color = getString();

        System.out.print("Enter number of bricks in the box: ");
        this.quantity = getInt();

        System.out.print("Enter Brick Width (cm): ");
        this.width = getInt();

        System.out.print("Enter Brick Length (cm): ");
        this.length = getInt();

        System.out.print("Enter Price of Box (vnd): ");
        this.price = getLong();
    }

    public void showInfor()
    {
        System.out.println();
        System.out.println("================= BRICK BOX =================");
        System.out.printf("| Box ID: %33s |\n", this.id);
        System.out.printf("| Brick color: %28s |\n", this.color);
        System.out.printf("| The number of bricks in the box: %8d |\n", this.quantity);
        System.out.printf("| Brick width(cm): %24d |\n", this.width);
        System.out.printf("| Brick length(cm): %23d |\n", this.length);
        System.out.printf("| Price of the box(vnd): %18d |\n", this.price);
        System.out.println("=============================================");
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
