import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,4,6,3,6,3,6,7,4};
        boolean find = false;
        System.out.println("Enter a value");
        int value = scanner.nextInt();
        System.out.println("Array cũ");
        for (int b: array){
            System.out.print(b +"\t");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (value==array[i]){
                find = true;
                System.out.println("Find value in position" + i);
                System.arraycopy(array, i +1, array, i , array.length - 1 - i);
                array[array.length - 1] = 0;
                System.out.println("New Array");
                for (int b : array){
                    System.out.print(b + "\t");
                }
                System.out.println();
                System.out.println();
            }

        }
        if (!find) {
            System.out.println("Value does not exit in array");
        }



    }


}
