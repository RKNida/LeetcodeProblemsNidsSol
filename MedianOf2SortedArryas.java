/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 10
*/

class MedianOf2SortedArryas {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

int tot=nums1.length+nums2.length;
List array=new ArrayList<Integer>();
for(int i=0;i<nums1.length;i++)
array.add(nums1[i]);
for(int i=0;i<nums2.length;i++)
array.add(nums2[i]);

Collections.sort(array);
if((tot)%2==0){
    //even n/2 + (n/2 +  1) due to size() +1 -1 cancelled nd below formula
    //     ------------------
    //      2
return (double)((int)array.get((array.size()/2)-1)+(int)array.get(array.size()/2))/2;


}else{
//for odd=n/2+1 due to size() +1 -1 cancelled nd below formula
return (int)array.get((array.size())/2);

}
    }
}
