import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] numbers1 = {2, 3, 4, 5};
        int[] numbers2 = {6, 7, 8, 9};

        for (int i = 1; i <= 9; i++) {
            if (i % 4 == 0) {
                continue;
            }
            for (int j = 0; j < numbers1.length; j++) {
                System.out.print(numbers1[j] + " * " + i + " = " + (numbers1[j] * i) + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 9; i++) {
            if (i % 4 == 0) {
                continue;
            }
            for (int j = 0; j < numbers2.length; j++) {

                System.out.print(numbers2[j] + " * " + i + " = " + (numbers2[j] * i) + "\t");

            }
            System.out.println();
        }
    }
}
