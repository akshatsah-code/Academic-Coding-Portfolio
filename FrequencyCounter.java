import java.util.Scanner;
public class FrequencyCounter 
{
    public static void findFrequency(int[] arr) 
    {
        // Create a new array to store the frequencies
        int[] f = new int[arr.length];       
        // Initialize all frequencies to 0
        for (int i = 0; i < f.length; i++)
        {
            f[i] = 0;
        }      
        // Count the frequencies
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    // Set the frequency of the repeated element to -1 to avoid recounting
                    f[j] = -1;
                }
            }
            if (f[i] != -1) {
                f[i] = count;
            }
        }   
        // Print the frequencies
        for (int i = 0; i < arr.length; i++) {
            if (f[i] != -1) {
                System.out.println(arr[i] + " occurs " + f[i] + " times");
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.print("Enter 10 Element in Array: ");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        FrequencyCounter.findFrequency(a);
    }
}




