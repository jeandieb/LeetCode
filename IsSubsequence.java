public class IsSubsequence
{
   public static void main(String[]args)
   {
      System.out.println(isSubsequence("b", "abc"));
   }
   
   public static boolean isSubsequence(String s, String t)
   {
      if(t.length() < s.length()) return false; 
      if(t.equals(s)) return true;
      String ans = "";
      int j = 0;
      int i = 0;
      while(i < s.length() && j < t.length())
      {
         if (s.charAt(i) == t.charAt(j)) 
         {
            ans += s.charAt(i);
            i++;
         }
         j++;

      }

      return i == s.length();
   }
}
