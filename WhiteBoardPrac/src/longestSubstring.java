import java.util.Arrays;

public class longestSubstring {
    //Input: strs = ["flower","flow","flight"]
    //Output: "fl"
    public String longestCommonPrefix(String[] strs) {

        if (strs.length==0) return "";

        String prefix = strs[0];

        for (int i=0;i< strs.length;i++){

            //will be equal to 0 when the match?
            //flow.indexOf(flower)
            while (strs[i].indexOf(prefix)!=0){
                //remove a letter
                prefix = prefix.substring(0,prefix.length()-1);

            }

        }

        return prefix;
    }

    public String longestCommonPrefix2(String[] strs) {

        Arrays.sort(strs);
        //when we sort, then we can compare the first and last string
        //if there is a common prefix in first and last, will def be there in
        //the middle elements too


        String stringF = strs[0];
        String stringL =strs[strs.length-1];
        int index =0;
        while(index<stringF.length()){
            if(stringF.charAt(index)==stringL.charAt(index)){
                index++;
            }else {

                break;
            }
        }
        if (index ==0){
            return "";
        } else {
            return stringF.substring(0,index);
        }

    }




}

