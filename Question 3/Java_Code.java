// { Driver Code start
    
import java.io.*;
import java.util.*;

class Test
{
    public static void main(String args[])throws IOException
    {
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        while(t-->0)
        {
            int n=ob.nextInt();
            int a[][]=new int[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]=ob.nextInt();
                }
            }
            find ab=new find();
            int b=ab.is_possible(a,n);
            System.out.println(b);
        }
    }
}
// } Driver Code Ends

class find
{
    int is_possible(int a[][],int n)
    {
        //code here
        
    }
}
