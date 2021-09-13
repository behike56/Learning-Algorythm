import java.util.Arrays;
import java.util.Scanner;

class exe2of5{
        //--- 配列の要素a[idx1]とa[idx2]の値を交換 ---//
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

     //--- 配列aの要素の並びを反転  ---//
    static void reverse(int[] a){
        for (int i = 0; i < a.length / 2; i++){
            System.out.println(Arrays.toString(a));
            System.out.println("a[" + i + "]とa[" + (a.length - i - 1) + "]を交換します。");
            swap(a, i, a.length - i - 1);
        }

        System.out.println("反転が終了しました。");
    }

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
        // 配列aの要素の並びを反転
        reverse(x);
        copy(y, x);
        System.out.println(Arrays.toString(y));

    }
}
