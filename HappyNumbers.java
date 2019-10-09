
public class HappyNumbers {
	
    public static boolean isHappy(int n) {
        
        int sum = 0;
        int y = 0;
        
        while(y < 100){
            
        	System.out.println("n = " + n);
        	sum = 0;
        	
            while(n > 0){
            	            
                sum += (n % 10) * (n % 10);
                          
                n /= 10;
            
                System.out.println("Sum = " + sum);
                
            }
            
            System.out.println("Next");
            
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