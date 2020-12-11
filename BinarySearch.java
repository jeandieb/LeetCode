public class BinarySearch
{
   public static void main(String[]args)
   {
      System.out.println("howdy");
      int [] arr = {1,3,5,6};
      System.out.println(searchInsert(arr, 2));
      
   }
   public static int searchInsert(int[] nums, int target) 
   {

      int index = -1;
      int first = 0;
      int last = nums.length-1;
      
      while(first <= last)
      {
         int mid = (first + last)/2;
         
            
         if (target < nums[mid])
         {
            last = mid-1;
         } 
         else if(target > nums[mid])
         {
            first = mid+1;
         }
         else if (target == nums[mid])
         {
            index = mid;
            break;
         }
         if(mid ==last || mid == first)
            index = first;

      }
        
        return index;
      }
    
}
