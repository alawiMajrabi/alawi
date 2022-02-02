import java.util.Scanner;

/**
 * Created by user on 12/01/2022.
 */
public class Array1 {
    public static void main(String[] args) {

        int[] Array = new int[5];
        input_array(Array);
        print_array(Array);
    }


    public static void input_array(int[] x) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number Arry[5]");
        for (int i = 0; i < x.length; i++) {
            System.out.println("Enter Array [" + i + "]=");
            x[i] = input.nextInt();
        }
    }

    public static void print_array(int[] y) {
        System.out.println("print element Array:");
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);

        }
    }
}



