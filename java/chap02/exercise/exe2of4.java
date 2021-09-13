import java.util.Arrays;
import java.util.Scanner;

class exe2of4 {

    /*
     * 配列aと配列bが同じ長さである
     */
    static void copy(int[] a, int[] b){
        for(int i =0; i < b.length; i++){
            a[i] = b[i];
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数は：");
        // 要素数
        int num = stdIn.nextInt();
        // 要素数numの配列
        int[] x = new int[num];
        int[] y = new int[num];

        for (int i = 0; i < num; i++){
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        copy(y, x);
        System.out.println(Arrays.toString(y));

    }
}
