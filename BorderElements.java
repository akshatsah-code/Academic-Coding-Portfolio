import java.util.Scanner;
public class BorderElements
 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);     
        System.out.print("Enter the number of rows: ");
        int r = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = input.nextInt();      
        int[][] a = new int[r][c];     
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++) 
            {
                System.out.print("Enter element at cell: "+i+","+j+" : ");
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Inputted array: ");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The border elements of the array are:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                if (i == 0 || i == r - 1 || j == 0 || j == c - 1) 
                {
                    System.out.print(a[i][j] + " ");
                } else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}