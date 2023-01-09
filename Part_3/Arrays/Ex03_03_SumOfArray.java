package Part_3.Arrays;

public class Ex03_03_SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(numbers));

    }
    public static int sumOfNumbersInArray(int[] numbers){
        int index = 0;
        int sum = 0;
        while (index < numbers.length) {
            sum += numbers[index];
            index++;
        }
        return sum;
    }
}
