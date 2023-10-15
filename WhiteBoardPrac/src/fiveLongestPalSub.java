public class fiveLongestPalSub {

    class Solution {
        public String longestPalindrome(String s) {
            if(s==null||s.length()<1) return "";
            int start =0;
            int end =0;

            //going through a regular for loop and going through each letter one by one
            for (int i=0;i<s.length();i++){
                // case of odd letters palidrome like "racecar"
                //i,i because we are checkking the single most middle letter
                int len1 = expandFromMiddle(s,i,i);

                //even letters
                int len2 = expandFromMiddle(s,i,i+1);

                int len= Math.max(len1,len2);

                if(len> end-start){
                    //"racecar" 3- ((7-1) /2) =
                    start = i-((len-1)/2);
                    end = i+(len/2);
                }
            }
            //substring doesn't include the end index, not inclusive
            return s.substring(start,end+1);

        }

        public int expandFromMiddle ( String s, int left, int right) {
            if (s==null || left> right) return 0;

            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            //here we are getting the length of the substring
            return (right-1)-left;
        }


    }



}
