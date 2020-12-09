public ListNode mergeTwoLists(ListNode l1, ListNode l2)
     {
         ListNode toBeReturned = new ListNode(-1);
         ListNode HeadPointer = toBeReturned;
         if (l1 == null)
            return l2;
         else if (l2 == null)
            return l1;
            
         while(l1 != null && l2 != null)
         {
            if (l1.val < l2.val)
            {
               HeadPointer.next = l1;
               l1 = l1.next;
            }
            else
            {            
               HeadPointer.next = l2;
               l2 = l2.next;
            }
            
            HeadPointer = HeadPointer.next;
            
         }
         if(l1 != null)
            HeadPointer.next = l1;
         else
            HeadPointer.next = l2;
             
         return toBeReturned.next;
    }
