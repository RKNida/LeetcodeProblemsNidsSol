/*mock-25/5/23


You are given an integer array A of size N. You can jump from index J to index K, such that K > J, in the following way:
 
during odd-numbered jumps (i.e. jumps 1, 3, 5 and so on), you jump to the smallest index K such that AJ < AK and AK - AJ is minimal among all possible K's.
during even-numbered jumps (i.e. jumps 2, 4, 6 and so on), you jump to the smallest index K such that AJ > AK and AJ - AK is minimal among all possible K's.
 
It may be that, for some index J, there is no legal jump. In this case the jumping stops.
 
Write a function that given an integer array A of length N, returns an integer denoting the number of starting points from which you can reach (maybe by jumping more than once) the end of the array A.

For example, given A = [10, 13, 12, 14, 15] the function should return 2*/

