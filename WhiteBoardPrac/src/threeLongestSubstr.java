import java.util.HashMap;
import java.util.Map;

public class threeLongestSubstr {
    //no repeated letters allowed
    class Solution {
        public int lengthOfLongestSubstring(String s) {

            int maxLength =0;

            Map<Character, Integer> checkChar = new HashMap<>();

            //incrementing left pointer when we come across duplicate
            //incrementing right at every iteration
            for (int right =0, left =0; right <s.length();right++){
                //want to check if map already contains and if its within the
                //substring we are currently dealing with
                char currentCharacter = s.charAt(right);
                if(checkChar.containsKey(currentCharacter) && checkChar.get(currentCharacter)>=left) {
                    //if all of that is true^^... character is in map and position of the characater
                    //is greater than/ equal to the left pointer, then we move the left pointer over one
                    left = checkChar.get(currentCharacter) + 1;
                }
                //+1 bc what if substring is just first letter, 0+0
                maxLength = Math.max(maxLength, right-left+1);
                //else
                checkChar.put(currentCharacter,right);

            }
            return maxLength;
        }
    }
}
