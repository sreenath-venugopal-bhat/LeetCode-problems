class Solution {
    public String longestCommonPrefix(String[] strs) {
        String firstString = strs[0];
        String commonPrefix = "";
        for(int i=0;i<firstString.length();i++){
            int flag=0;
            char symbol = firstString.charAt(i);
            for(int j=1;j<strs.length;j++){
                String currentString = strs[j];
                if(currentString.length()<=i || currentString.charAt(i)!=symbol){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                commonPrefix += symbol;
            }
            else{
                break;
            }
        }
        if(commonPrefix.length()>0){
            return commonPrefix;
        }
        else{
            return "";
        }
    }
}