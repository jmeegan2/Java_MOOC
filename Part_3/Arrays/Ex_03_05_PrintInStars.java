package Part_3.Arrays;

public class Ex_03_05_PrintInStars {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array){
        for(int e : array){

            for(int i= 1; i <= e;i++){
                System.out.print("*");
            }
            //accidentally put /n instead of \n the first run
            System.out.print("\n");

        }
    }
}
