class Solution {
    public int calculateScore(int a, int b) {
        String binary1 = Integer.toBinaryString(a);
         String binary2 = Integer.toBinaryString(b);

         int s1 = 0;
         for(int i=0; i<binary1.length(); i++){
            if(binary1.charAt(i)=='1'){
                s1++;
            }
         }
         int s2 = 0;
         for(int j=0; j<binary2.length(); j++){
            if(binary2.charAt(j)=='1'){
                s2++;
            }
         }
         if(s1>=s2){
            return s1*s2;
         }
    return (s2/s1);
    }
}