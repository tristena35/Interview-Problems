class Solution {
    
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int count = 0;
        int[] smallNumbers = new int[nums.length];
       
        for(int i = 0; i < nums.length; i ++){
            
            for(int j = 0; j < nums.length; j ++){
                if(nums[i] > nums[j])
                    count ++;
            }
            
            if(count != 0){
                System.out.println("For nums[" + i + "] = " + nums[i] + " there exist " + count + " smaller number[s] than it");
                smallNumbers[i] = count;
            }
            else{
                System.out.println("For nums[" + i + "] = " + nums[i] + " there exist no smaller numbers");
                smallNumbers[i] = 0;
            }
            count = 0;            
        } 
        
        return smallNumbers;
        
    }
                                   
}