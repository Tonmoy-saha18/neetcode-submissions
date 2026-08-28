class Solution {
    public boolean isPalindrome(String s) {
        String st = "";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                st += Character.toLowerCase(s.charAt(i));
            }
        }
        int low = 0, high = st.length() - 1;
        while(low <= high){
            if(st.charAt(low) != st.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
