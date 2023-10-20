import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {


    class Solution {
        public List<String> fizzBuzz(int n) {

            List<String> bloop = new ArrayList<>();

            for (int i=1;i<=n;i++){
                if(i%3==0&&i%5==0){
                    bloop.add("FizzBuzz");
                } else if (i%3==0){
                    bloop.add("Fizz");
                } else if ( i%5==0){
                    bloop.add("Buzz");
                } else if (i%3!=0 || i % 5!=0) {
                    bloop.add(Integer.toString(i));
                }

            }
            return bloop;

        }
    }

}
