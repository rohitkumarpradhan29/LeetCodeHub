class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n*n;
        int sumEven = n*(n+1);
    
        int large , small;
        if(sumOdd > sumEven){
            large = sumOdd;
            small = sumEven;
        }else{
            small = sumOdd;
            large = sumEven;
        }

      
        while(small != 0){
            int rem = large % small;
            large = small;
            small = rem;
        }


        return large;

    }
}
  //GCD USING EUCLID ALGORITHM
        /*while (b != 0)
                {
                    remainder = a % b;
                    a = b;
                    b = remainder;
                }

                GCD = a;
                */ 
/*Logic
Divide the larger number by the smaller number.
Replace:
Larger number = Smaller number
Smaller number = Remainder
Repeat until the remainder becomes 0.
The last non-zero divisor is the GCD.
*/