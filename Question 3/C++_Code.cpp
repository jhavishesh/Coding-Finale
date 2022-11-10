// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

bool is_possible(int** a, int n);

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        
        int** a = new int*[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i] = new int[n];
            for(int j=0 ; j<n ; j++)
                cin>> a[i][j];
        }
        
        cout<< is_possible(a,n) << endl;
    }
    return 1;
}

// } Driver Code Ends

bool is_possible(int** a, int n)
{
    //Code Start from Here
}


