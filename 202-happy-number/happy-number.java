class Solution {
    public boolean isHappy(int n) {
        if(n<1) return false;

        int slow = n;
        int fast = square(n);

        while(slow!=fast){
            if(slow==1 || fast==1){
                return true;
            }
                slow = square(slow);
                fast = square(square(fast));
            }
            if(slow==1) return true;
            return false;
        
    }
    public int square(int n){
        int sum = 0;

        while(n!=0){
            int digit = n%10;
            sum = sum + digit*digit;
            n /= 10;
        }
        return sum;
    }
}