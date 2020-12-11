
public class indexOf
{
   public static void main(String[]args)
   {
      System.out.println("howdy");
      String haystack = "", needle = "";
      System.out.println(strStr(haystack, needle));
   }
   //return the index of the first char in needle if needle exists in haystack
   public static int strStr(String haystack, String needle) 
   {
      if (needle == "" || needle == " ") return 0;
      if(needle.length() > haystack.length()) return -1;
      
      boolean found = false;
      int index = -1;
      int i = 0;
      for (i = 0; i < haystack.length() && !found; i++)
      {  
         int j = 0;
         int temp = i;
         if (needle.charAt(j) == haystack.charAt(temp))
         {
            while(j < needle.length() && temp < haystack.length())
            {
               if(needle.charAt(j) == haystack.charAt(temp))
               {
                  j++;
                  temp++;
                  if(j == needle.length()) found = true;
                  continue;
               }
               else break;

            }
         }
      }
         if(!found) return -1;
         else return i-1;
      
   }

}
