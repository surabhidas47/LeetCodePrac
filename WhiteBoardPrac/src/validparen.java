import java.util.Stack;

public class validparen {

    //Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

//    Example 2:
//
//    Input: s = "()[]{}"
//    Output: true
//    Example 3:
//
//    Input: s = "(]"
//    Output: false



    //solution donesnt work for cases like [{}]
    class Solution {
        public boolean isValid(String s) {


            for (int i=0;i<s.length();i++){
                char temp =s.charAt(i);
                char next =s.charAt(i+1);

                if (temp=='('&& next==')'){
                    return true;
                } else if (temp=='{'&& next=='}') {
                    return true;

                } else  if (temp=='['&& next==']'){
                    return true;
                } else{
                    return false;
                }


            }


            return false;
        }
    }


    class Solution2 {
        public boolean isValid(String s) {

            if(s.length()%2!=0) return false;

            Stack<Character> stack = new Stack <> ();

            for (int i=0;i<s.length();i++){

                char temp = s.charAt(i);

                if (temp == '('|| temp == '['|| temp == '{') {
                    stack.push(temp);
                } else if (temp==')' && !stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                } else if (temp==']'&& !stack.isEmpty() && stack.peek()=='['){
                    stack.pop();
                }
                else if (temp=='}'&& !stack.isEmpty() && stack.peek()=='{'){
                    stack.pop();
                }


            }

            return stack.isEmpty();

        }
    }


}
