class Solution {
    public int findNumbers(int[] nums) {
        String str=""; //형변환
        int digit=0;
        int count=0; //2자리수 개수 카운트
        
        for(int i=0; i<nums.length;i++){
            str = String.valueOf(nums[i]);
            digit = str.length();
            
            if(digit % 2 == 0){
                count++;
            }
        }
        
        return count;
    }
}