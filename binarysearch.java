import java.util.Scanner;
class binarysearch
{
    void main()
    {
        Scanner sc = new Scanner(System.in);
        String a[] = new String[10];
        int i,j;
        //data input
        for(i=0;i<10;i++)
        {
            System.out.print("Enter Element in array: ");
            a[i]= sc.nextLine();
        }
        //sorting the data
        for(i=0;i<10-1;i++)
        {
            for(j=0;j<10-i-1;j++)
            {
                if(a[j].compareToIgnoreCase(a[j+1])>0)
                {
                    String t= a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        //sorted data ⬇⬇⬇
        System.out.println("Sorted in element ⬇⬇⬇ ");
        for(i=0;i<10;i++)
        {
            System.out.print(a[i]+",");         
        }
        System.out.println();
        System.out.println("Enter Searching element: ");
        String sn= sc.nextLine();
        int l=0,h=a.length-1,f=-1;
        while(l<=h)
        {
            int m= (l+h)/2;
            if(a[m].equalsIgnoreCase(sn))
            {
                f=m;
                break;
            }
            else if(sn.compareToIgnoreCase(a[m]) >0)
                l=m+1;
            else if(sn.compareToIgnoreCase(a[m]) <0)
                h=m-1;
        }
        if(f>=0)
            System.out.println("Number is found at index: "+f);
        else 
            System.out.println("Number is not found ");
    }
}