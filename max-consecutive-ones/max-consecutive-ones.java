class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0; //1개수 세는거
        int max = 0; //최대값 저장
        
        for(int i =0 ; i<nums.length;i++){
            if(nums[i] == 1){
                count ++;
                if(count > max){
                    max = count;
                }
            }else if(nums[i] == 0){
                count = 0;
            }
        }
        return max;
    }
}