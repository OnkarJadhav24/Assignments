// Q1 write a java program that calculates 
//the average of elements in an integer array

class AverageCalculator{
    public static void main(String[] args){
        
        int[] array = {5, 4, 3, 9, 1, 7, 9};

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        double average = (double) sum / array.length;

        System.out.println("The average is: " + average);
    }
}