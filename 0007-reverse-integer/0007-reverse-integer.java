class Solution {
    public int reverse(int x) {
        long rev = 0;
        // if(x > 0){
            while(x != 0){
                int digit = x % 10;
               
                rev = rev*10 + digit;
                x = x/10;
                 if((Integer.MAX_VALUE < rev) ||(Integer.MIN_VALUE > rev) ){
                 return 0;
                }
            }
     

      return (int)rev;
    }
}