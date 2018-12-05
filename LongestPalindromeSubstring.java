package Facebook_Leetcode;

public class LongestPalindromeSubstring {

   public String longestPalindrome(String s) {
       if (s == null || s.length() == 0) return s;
       int length = s.length();

       boolean[][] isPalindrome = new boolean[length][length];

       int left=0, right=0;

       for (int j = 1; j<s.length(); j++){
           for (int i = 0; i<j; i++){

                   boolean isInnerPalindrome = isPalindrome[i+1][j-1] || j-i<=2;

               if (s.charAt(i) == s.charAt(j) && isInnerPalindrome){
                   isPalindrome[i][j] = true;

                   if (j-i > right - left)
                       left = i;
                        right = j;
               }
           }

       }
       return s.substring(left, right+1);
   }
}
