package Java;

public class SummativeSums {

    public static int addListValues (int[] list) {
        int sum = 0;
        for (int x : list){
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args){

        int[][] numberArray = {
            {1, 90, -33, -55, 67, -16, 28, -55, 15},
            {999, -60, -77, 14, 160, 301},
            {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99}
        };

        int array1 = addListValues(numberArray[0]);
        int array2 = addListValues(numberArray[1]);
        int array3 = addListValues(numberArray[2]);
        
        System.out.println("#1 Array Sum: " + array1);
        System.out.println("#2 Array Sum: " + array2);
        System.out.println("#3 Array Sum: " + array3);

    }
    
}
