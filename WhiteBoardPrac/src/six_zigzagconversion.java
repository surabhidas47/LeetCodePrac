public class six_zigzagconversion {

    class Solution {
        public String convert(String s, int numRows) {


            //first DECLARE a stringbuilder of arrays thats = to the num of rows
            StringBuilder [] sb = new StringBuilder[numRows];

            //now we iterate through each row and INITIALIZE
            // Inside the loop, a new StringBuilder object is created for each row.. before was null
            for (int i=0;i<numRows;i++){
                sb[i] = new StringBuilder();
            }

            //convert String to char array
            char [] arr = s.toCharArray();
            int index =0;
            int n = arr.length;

            while (index<n) {

                //going down until we reach the last row
                //need to check index is less then n bc then we know when to stop
                for (int j = 0; j < numRows && index < n; j++) {
                    sb[j].append(arr[index++]);
                }

                //starting from the second last row, so if 5 rows
                //5-2 bc the last spot is the 4th index
                for (int j = numRows - 2; j > 0 && index < n; j--) {
                    sb[j].append(arr[index++]);
                }
            }

                //combining
                StringBuilder res = sb[0];
                for (int i=1;i<numRows;i++){
                    res.append(sb[i].toString());
                }
                return res.toString();
            }

    }


}
