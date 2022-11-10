// { Driver Code Start

#include <bits/stdc++.h>
using namespace std;

int min_cost(int* a ,int n);

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    int* a = new int[n];
	    for(int i=0; i<n; i++)
	        cin>> a[i];
	    cout<< min_cost(a,n) << endl;
	    delete[] a;
	}
	return 0;
}
// } Driver Code Ends


int min_cost(int* a ,int n)
{
        //Code Here    
}
