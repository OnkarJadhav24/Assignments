// Q2 Find the minimum and amximum value in an integer array

class MinMax{
    public static void main(String[] args){
        
        int array[] = {5, 4, 3, 9, 1, 7, 9};

        int min = array[0];
        int max = array[0];

        for (int num : array){
			if (num < min){
                min = num;
            } 
			else if (num > max){
                max = num;
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}