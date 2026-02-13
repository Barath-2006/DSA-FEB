class max_ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int longc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                longc=Math.max(count,longc);
            }else{
                count=0;
            }
            
        }return longc;
        
    }
}