import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isValid("()"));

	}

	public static boolean isValid(String s) {
		
		//Edge case: This will show imbalance
        if (s.length() % 2 != 0) 
        	return false; 
    
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i ++){
        	
        	//c will hold the current character
            char c = s.charAt(i);
            
            if (c == '[' || c == '(' || c == '{') 
            	stack.add(c);
            else {            
                if (stack.size() == 0) //If the string starts with a closing bracket, its invalid
                	return false; 
                
                //3 Other Cases
                if (c == ')' && stack.peek() == '(') 
                	stack.pop();
                else if (c == ']' && stack.peek() == '[') 
                	stack.pop();
                else if (c == '}' && stack.peek() == '{') 
                	stack.pop();
            }
        }
        //This is to make sure all of the stack was checked
        return (stack.size() == 0);
    }

}