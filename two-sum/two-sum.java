class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>(); 
    
        for(int i=0;i<nums.length;i++)
        {
            Integer testNumber = (Integer)(target - nums[i]);
            if(indexMap.containsKey(testNumber))
            {
                int toReturn[] = {indexMap.get(testNumber),i};
                return toReturn;
            }
            indexMap.put(nums[i],i);
        }
        return null;
    }
}