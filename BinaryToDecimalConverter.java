import java.util.Scanner;
public class BinaryToDecimalConverter
{
    public int convertBinaryToDecimal(String b) 
    {
        int d = 0;
        int p = 0;
        for (int i = b.length() - 1; i >= 0; i--) 
        {
            int n = b.charAt(i) - '0';
            if(n!=1 && n!=0)
            {
                return 0;
            }
            else
            {
                d += n * Math.pow(2, p);
                p++;
            }
        }
        return d;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String bn =  input.next();
        BinaryToDecimalConverter c = new BinaryToDecimalConverter();
        int dn = c.convertBinaryToDecimal(bn);
        if(dn ==0 )
        {
            System.out.println("Entered Number is not binary.....");
        }
        else
            System.out.println("Decimal equivalent of " + bn + " is: " + dn);
    }
}

