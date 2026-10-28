class Solution {
    public boolean checkGoodInteger(int n) {
        int digsum = 0;
        int squaresum = 0;

        while(n!=0){
            int digit = n%10;
            digsum += digit;
            n /= 10;
            int square = digit*digit;
            squaresum += square;
            if(squaresum-digsum>=50){
                return true;
            }
            
        }
        return false;
    }
}