**Problem Statement**

You are given a String S which consists of English lowerCase and UpperCase alphabets. First letter of String S can contain the
Consonant and Vowels ('a', 'e', 'i', 'o' and 'u'). There are two types of query that you have to do on String S.

If the starting letter of S is vowel then you have to remove the first letter from the string S and add "ma" string to the end
of String S.

If the starting letter of S is consonant then you have to remove the first letter from S and add "m" and also you have to add "a" as many times as vowel arrives before that particular consonant to the end of the string S.

**For Example:** 

Let consider a string S = "aaaba" </br>
After the first operation: S = "aabama", because we have removed 'a' which is a vowel and add "ma" to the end of the string.</br>
After the second operating: S = "abamama", same as the first operation. </br>
After the third operation: S = "bamamama", same as second operation.</br>
After the fourth operation: S = "amamamamaaa", here we have removed 'b' and add "maaa" because before 'b' vowels has arrived 3 times that is why we have added 3 a's.

We have to do these operations K times. After that, we have to print the count of the number of vowels and the number of
consonant in the updated string.

**Input:**
The first line contains the number of Test cases T.
For each test case, the first line contains the two space-separated integer N and K denoting the size of String S and the number of times we have to apply the operation on that String S.

**User Task:**

As this is a functional problem. So, you don't have to worry about the input and output. You just have to complete the function
Count_V_W() which takes the parameter String S, Integer value N and K and print the number of vowels and consonant space
separately.

**Output:**

Print the number of vowels and then print the number of consonant space separately.</br>


Constraints:
1 <= T <= 100</br>
1 <= N <= 10^5</br>
1 <= K <= 10^6</br>
All the character in the string contains the lowercase and uppercase alphabets.

**Example:**

Sample Input: </br>
2 </br>
5 7</br>
ababb</br>
5 7</br>
aabab</br>

Sample Output:</br>
9 6 </br>
11 6
