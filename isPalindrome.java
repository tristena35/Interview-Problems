// BEST ANSWER

class Solution {
    public boolean isPalindrome(int x) {
        return IsPalindrome(x);
    }
    
    public boolean IsPalindrome(int x) {
        // Special cases
        if(x < 0 || (x % 10 == 0 && x != 0)) 
        {
            return false;
        }

        int reversedNumber = 0;
        while(x > reversedNumber) 
        {
            reversedNumber = reversedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == reversedNumber || x == reversedNumber / 10;
    }
}


// MY ORIGINAL ANSWER

class Solution {
    public boolean isPalindrome(int x)
    {
        String number = x + "";
        
        if(number.substring(0,1) == "-")
        {
            return false;
        }
        
        return isFlipped(x);
    }
    
    public boolean isFlipped(int number)
    {
        int originalNumber = number, flippedNumber = 0;
        
        while(number > 0)
        {
            flippedNumber += number % 10;
            flippedNumber *= 10;
            
            number /= 10;
        }
        
        flippedNumber /= 10;
        
        if(originalNumber == flippedNumber)
        {
            return true;
        }
        
        return false;
            
    }
    
    /*
        First, check if there is a negative sign, automatically not a palindrome
        Second, start to check if each mod 10 of each number and make it into a new number
        then divide number, and check if they are equal.
    */
}