// { Driver Code Starts
import java.io.*;
import java.util.*;

class Test
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t > 0)
                {
                    int ans;
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    for(int i=0;i<n;i++)
                        arr[i] = sc.nextInt();
                    Minimum g = new Minimum();
                    ans = g.min_cost(arr,n);
                    System.out.println(ans);
                    t--;
                }
        }
        
}// } Driver Code Ends


class Minimum
{
    public int min_cost(int[] arr , int n)
        {
            //code here.
        }
}