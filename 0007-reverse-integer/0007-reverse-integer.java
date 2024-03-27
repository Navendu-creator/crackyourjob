class Solution {
    public int reverse(int x) {
          StringBuffer sb = new StringBuffer(String.valueOf(x));
        int rev=0;
            while(x != 0){
                if( (long)rev*10 + x%10 > Integer.MAX_VALUE || (long)rev*10 + x%10 < Integer.MIN_VALUE )
                    return 0;
                else
                    rev = rev*10 + x%10;
                x=x/10;
            }
        return rev;
    }
}