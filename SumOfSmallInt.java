public class SumOfSmallInt {

    public static void main(String args[]){

        /*
        Given an array of n numbers, find the smallest digit and provide the sum of its digits
         */

        int[] numbers = new int[10];
        numbers[0] = 21;
        numbers[1] = 120;
        numbers[2] = 12;
        numbers[3] = 11;
        numbers[4] = 98;
        numbers[5] = 19;
        numbers[6] = 124;
        numbers[7] = 3243;
        numbers[8] = 392;
        numbers[9] = 94;

        if(numbers.length == 0)
            return;

        System.out.println(smallestNumberSum(numbers));

    }

    public static int smallestNumberSum(int[] passedNumbers){

        //Holds the current minimum
        int min = passedNumbers[0];

        for(int i = 0; i < passedNumbers.length; i ++){

            //Keeps track of current number in the array
            int currentNumber = passedNumbers[i];

            if(currentNumber < min)
                min = currentNumber;

        }

        //Now since you have exited the loop, min holds the minimum value;

        //Sum variable to hold sum when adding digits
        int sum = 0;

        while(min > 0){
            sum += min % 10;
            min /= 10;
        }

        return sum;

    }

}
