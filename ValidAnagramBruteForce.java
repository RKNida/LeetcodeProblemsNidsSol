/*Below sol- runtime =37ms(worst) memory=43.9mb
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?*/class Solution {
    public boolean isAnagram(String s, String t) {
        Map  <Character,Integer> sMap=new HashMap<Character,Integer> ();
        Map <Character,Integer>tMap=new HashMap<Character,Integer> ();
int count=1;
        if(s.length()!=t.length())
        return false;
        else{
            for(int i=0;i<s.length();i++){
            if(sMap.containsKey(s.charAt(i))){
              count= sMap.get(s.charAt(i));
                            count++;
              sMap.put(s.charAt(i),count);             
            }else{
              sMap.put(s.charAt(i),1);

            }
            if(tMap.containsKey(t.charAt(i))){
              count=  tMap.get(t.charAt(i));
              count++;
                tMap.put(t.charAt(i), count);
            }else{
              tMap.put(t.charAt(i),1);

            }
            }
         //   System.out.println("sMap"+sMap+"tMap"+tMap);
            if(sMap.equals(tMap))
            return true;
            else return false;
        }
    }
}
