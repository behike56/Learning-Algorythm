import java.util.Arrays;
import java.util.Scanner;

/*
 * Arrays.binarySearchによる2分岐探索
 */
public class BinarySearchTester {

    public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("要素数：");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("昇順に入力してください。");

        System.out.println("x[0]：");
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.println("x[" + i + "]：");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);
        }

        System.out.println("探す値：");
        int ky = stdIn.nextInt();

        int idx = Arrays.binarySearch(x, ky);

        if (idx < 0)
            System.out.println("その値は存在しません。");
        else
            System.out.println("その値はx[" + idx + "]にあります。");
    }
}
