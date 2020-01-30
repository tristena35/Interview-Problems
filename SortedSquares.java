class Solution {
    public int[] sortedSquares(int[] A) {
        squareArray(A);
        Arrays.sort(A);
        return A;
    }
    
    /*
    * Go through the array
    * For each value, multiply it by its self and replace its own value with its square which can be store tempVal
    * Take care of negative values
    */
    public void squareArray(int[] a){
    
        for(int i = 0; i < a.length; i++){
            int tempVal = 0;
            tempVal = a[i] * a[i];
            a[i] = tempVal;
        }
        
    }
    
}