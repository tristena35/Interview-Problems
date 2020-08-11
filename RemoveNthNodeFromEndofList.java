/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int size = getLength(head);
        
        /*
            If n is equal to size, that means youre removing the first node
        */
        if(n == size)
        {
            head = head.next;
            return head;
        }
        
        ListNode temp = head;
        
        // Gets you to node where you need to adjust
        int targetNumber = size - n - 1; 
        
        // Test Case
        if(temp.next == null)
        {
            return null;
        }
        
        // Going through the list
        while(temp.next != null)
        {
            if(targetNumber == 0)
            {
                temp.next = temp.next.next;
                break;
            }
            targetNumber --;
            temp = temp.next;
        }
        
        return head;
    }
    
    // --- HELPER FUNCTIONS -- //
    public int getLength(ListNode head)
    {
        int sizeOfList = 0;
        ListNode temp = head;
        
        if(head == null)
        {
            return 0;   
        }
        
        while(temp != null)
        {
            sizeOfList ++;
            temp = temp.next;
        }
        
        return sizeOfList;
    }
}

/*
    First write a loop that gets the size of the array
    Then just do a delete function
*/