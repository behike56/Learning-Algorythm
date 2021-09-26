import java.util.Scanner;
import System.out.println;

/*
 * 2分探索
 */
class BinSearch {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        println("要素数：");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        println("昇順に入力してください。");

        println("x[0]: ");
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i ++) {
            do {
                println("x[" + i + "]: ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);
        }

        println("探す値：");
        int ky = stdIn.nextInt();

        int idx = binSearch(x, num, ky);

        if (idx == -1)
            println("その値の要素は存在しません。");
        else
            println("その値はx[" + idx + "]にあります。")
    }

    /*
     * 配列aの先頭n個の要素からkeyと一致する要素を2分探索
     */
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key)
                return pc;
            else if (a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;
        } while (pl <= pr);

        return -1;
    }
}
