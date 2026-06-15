import java.util.Scanner;

public class DecimalToBinaryConverter 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int d = input.nextInt();
        
        String b = convertToBinary(d);
        
        System.out.println("Binary representation: " + b);
    }
    
    public static String convertToBinary(int d)
    {
        if (d == 0)
        {
            return "0";
        }
        
        String b = "";
        
        while (d > 0) 
        {
            int r = d % 2;
            b = r + b;
            d /= 2;
        }
        
        return b;
    }
}
