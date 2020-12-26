import java.lang.*;

class solution {

    public static void main(String[]args)
    {
      int [] test = new int[] {9};
      int [] returned = plusOne(test);
      for (int i : returned)
         System.out.println(i);
    }
    public static int[] plusOne(int[] digits) 
    {
      int index = digits.length-1;
      boolean done = false;
      while(index >= 0 && !done)
      {
         if (digits[index] != 9)
         {
            digits[index]++;
            done = true;
         } 
         else
         {
            digits[index] = 0;
            index--;
         }
         
      }
      if(!done)
      {
         System.out.println("i made it here");
         int[] solution = new int [digits.length+1];
         solution[0] = 1;
         for (int i = 0; i < digits.length-1; i++)
         {
            solution[i+1] = digits[i];
         }
         return solution;
      }
      return digits;
    }
}
