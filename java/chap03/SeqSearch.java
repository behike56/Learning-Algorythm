import java.util.Scanner;

/*
 * 線形探索
 */
class SeqSearch {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("探す値：");
        int ky = stdIn.nextInt();

        int idx = seqSearch(x, num, ky);

        if (idx == -1)
            System.out.print("その値の要素は存在しません。");

        if (idx != -1)
            System.out.print("その値はx[" + idx + "]にあります。");
    }

    /*
     * 配列aの先頭n個の要素からkeyと
     * 一致する要素を線形探索
     */
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while(true) {
            // 探索失敗(-1を返却)
            if (i == n) return -1;

            // 探索成功(インデックスを返却)
            if (a[i] == key) return i;

            i++;
        }
    }
}
