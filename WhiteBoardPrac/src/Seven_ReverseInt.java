public class Seven_ReverseInt {

    class Solution {
        public int reverse(int x) {

            int rev = 0;
            //123%10 = 3
            int lastNum;

            while(x!=0){
                lastNum=x%10;
                rev = rev * 10 +lastNum;
                x= x/10;
            }

            return rev;

        }
    }


}
