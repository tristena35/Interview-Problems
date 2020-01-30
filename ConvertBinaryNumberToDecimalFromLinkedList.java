/*--------------GOOD SOLUTION--------------*/

public int getDecimalValue(ListNode head) {

        StringBuilder builder = new StringBuilder();
        
        while (head != null) {
            builder.append(head.val);
            head = head.next;
        }
        //Here when we return, using the second argument 2 will return the answer in base 2, or decimal
        return Integer.parseInt(builder.toString(), 2);
        
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*---------------BAD SOLUTION: Runs into too big of an int error---------------*/
class Solution {
    public int getDecimalValue(ListNode head) {
       
        String binaryNumber = getBinaryNumber(head);
        int binaryInt = Integer.parseInt(binaryNumber);
        int decimalNumber = binaryToDecimal(binaryInt);
        return decimalNumber;
    }
    
    public String getBinaryNumber(ListNode head){
        StringBuilder binaryNumber = new StringBuilder();
        ListNode tempNode = head;
        while(tempNode != null){
            binaryNumber.append(tempNode.val);
            tempNode = tempNode.next;
        }
        System.out.println(binaryNumber);
        return binaryNumber.toString();
    }
    
    //Function to convert binary to decimal
    static int binaryToDecimal(int n) 
    { 
        int num = n; 
        int dec_value = 0; 
  
        // Initializing base 
        // value to 1, i.e 2^0 
        int base = 1; 
  
        int temp = num; 
        while (temp > 0) { 
            int last_digit = temp % 10; 
            temp = temp / 10; 
  
            dec_value += last_digit * base; 
  
            base = base * 2; 
        } 
  
        return dec_value; 
    } 
    
    /*
    *STEPS:
    * First, get the binary number given from the linked list by adding it to a string.
    * Then, take the string and cast it to an int.
    * Next, use the function to convert it to a decimal
    * Return.
    */
    
}