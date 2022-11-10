**Problem Statement**

You will be given a 2-D array a[ ][ ] of size n * n which represents positions in a golf course. A golfer wants to start from the top left corner and reach the bottom right corner of the golf course with any number of shots. Your task is to analyse the 2-D array and determine whether it is possible or not.

The 2-D array has a whole number in each cell. The number represents the maximum distance, a shot taken from that cell can reach. Shots can be taken in any of the 4 directions - UP, RIGHT, DOWN and LEFT. 

**For example :**

if a[i][j] hold a value 'x', then the golfer can go to any cell between a[i-x][j] and a[i+x][j] or between a[i][j-x] and 
a[i][j+x] from that cell. 

If a cell holds the value 0, that cell is a dead end. The golfer cannot go anywhere if he reaches there.


**Input:** 

First line of input contains number of test cases T. Then T test cases follow. In each test case, first line contains the value n. Second line of each test case contains n*n space separated integers that form the 2-D array A[ ][ ]. Input will be read by driver code.


**Output:** 

If it is possible to reach the bottom right celll starting from the top left, 1 is printed, else, 0 is printed.

Your task: Your task is to complete the function is_possible(). This function gets the 2-D array a[ ][ ] and its number of
rows n as argument. Return 1 if it is possible to start from top left and reach bottom right, else return 0. Returned value will be printed y driver code.


**Constraints:** </br> 

T <= 200 ; </br> 
2 <= n <= 150 ; </br> 
0 <= a[i][j] <= 10 </br> 

**Example:** </br> 

**Input:**

2 </br> 
4 </br> 
3 0 0 2 0 2 1 1 1 0 0 0 0 4 0 0 </br> 
3 </br> 
1 2 0 0 0 2 3 0 1 </br> 

**Output:** </br> 

1 </br> 0 

