class Solution {
    public int[] sortedSquares(int[] nums) {
        //Input: nums = [-7,-3,2,3,11]
        //Output: [4,9,9,49,121]
        
        int [] arr = new int[nums.length];
        
        for(int i =0; i<nums.length;i++){
            arr[i] = (int) Math.pow(nums[i],2); //첫번째 매개변수:밑수, 두번째 매개변수:지수
            arr[i] = Math.abs(arr[i]); //abs
        }
        
        //sorting
        Arrays.sort(arr);
        
        return arr;
    }
}