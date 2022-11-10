def is_possible(a,n):
    #code here


# { Driver Code Starts


import sys
sys.setrecursionlimit(100000) 
t=int(input())
for _ in range(0,t):
    n=int(input())
    l=list(map(int,input().split()))
    a=list()
    i1=0
    i2=n
    for _ in range(0,n):
        a.append(l[i1:i2])
        i1=i1+n
        i2=i2+n
    print(is_possible(a,n))
    
        
    
# } Driver Code