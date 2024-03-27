class Solution {
    public boolean isPalindrome(String s) {
       s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n= s.length();
        int start=0;
        int last= s.length()-1;
        for(int i=0;i<s.length(); i++){
            if(s.charAt(start)!= s.charAt(last)){
                return false;
            }
            start++;
            last--;
               
        }
        return true;
    }
}