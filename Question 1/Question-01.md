**Problem Statement**

You are given an array of integers. You have to start from the first index and reach the end. The only steps you can take are +3 or -1. Cost of a path is equal to the sum of all integers in the path. Find the cost of the lowest cost path. If no path is possible, print -1.

**Input:** 

First line of input contains number of test cases T. Then T test cases follow. In each test case, first line contains n, i.e.,number of integers in the array a[ ]. Second line of each test case contains n space separated integers of the array. Input will be read by driver code.


**Output:** 


Output for every test case is the minimum cost to travel from start of array to end.

**Your Task:**

Your task is to complete the function min_cost(). This function takes array a[ ] and its length n as argumments and returns the cost of most optimal path. Returned value will be automatically printed by driver code.

Constraints: 

T<=100 ; </br> 
4 <= n <= 10 ; </br>
1 <= a[i] <= 10 </br>

**Example:**

Input :

2 </br>
8 </br>
3 1 2 5 10 100 200 20 </br>
6 </br>
4 3 2 1 5 6

Output:

41 </br>
13

