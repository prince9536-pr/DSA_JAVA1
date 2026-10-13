class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n = nums.length;
        int count = 0;

        
        for(int i=0; i<n; i++){
            int dig = nums[i];
              
            while(dig!=0){
                int val = dig%10;
                if(val==digit){
                  count++;
                  
                }
            
             dig /= 10;
            }
        }
        return count;
    }
}