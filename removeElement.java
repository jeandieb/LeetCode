    //this function removes an element from an array by modifying the input array in-place with O(1) extra memory
    
    public static int removeElement(int[] nums, int val) 
    {
      int j = 0;
      for (int i = 0; i < nums.length; i++)
      {
         if(nums[i] != val)
         {
            nums[j] = nums[i];
            j++;
         }
      }  
      for (int s : nums)
      System.out.print(s);
      return j; 
    }
