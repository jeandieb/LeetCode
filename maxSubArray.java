public static int maxSubArray(int[] nums) 
   {  
      // implents kadane's algo to find the largest sum of subarray in an array
      
      int currentMax = nums[0];
      int globalMax = nums[0];
      for (int i = 1; i<nums.length; i++)
      {
         currentMax = Math.max(nums[i], currentMax+nums[i]);
         if(currentMax > globalMax) globalMax = currentMax;
         
      }
      return globalMax;
   }
