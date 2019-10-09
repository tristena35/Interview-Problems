
public class HappyNumbers {
	
    public static boolean isHappy(int n) {
        
        int sum = 0;
        int y = 0;
        
        //Here I set the cap at 100 just so it does not check forever
        while(y < 100){
            
        	System.out.println("n = " + n);
        	sum = 0;
        	
            while(n > 0){
            	            
            	//Here we take the last digit of each sum and use the algorithm to find the new sum
                sum += (n % 10) * (n % 10);
                          
                n /= 10;
            
                System.out.println("Sum = " + sum);
                
            }
            
            System.out.println("Next");
            
            //If sum equals to 1 then you found a happy number
            if(sum == 1)
                return true;
            else
                n = sum;
        
            y++;
            
        }
		return false;
        
   }
    
    
    public static void main(String args[]) {
    	
    	System.out.println(isHappy(19));
    
    }
    
    
}
