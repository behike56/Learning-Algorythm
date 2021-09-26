import java.util.Scanner;

/*
 * 線形探索
 * 番兵法
 */
class SeqSearchSen {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("探す値：");
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if (idx == -1)
            System.out.print("その値の要素は存在しません。");

        if (idx != -1)
            System.out.print("その値はx[" + idx + "]にあります。");
    }

    /*
     * 配列aの先頭n個の要素からkeyと
     * 一致する要素を線形探索
     */
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;

        while(true) {
            // 探索成功(インデックスを返却)
            if (a[i] == key) break;

            i++;
        }
        return i == n ? -1 : i;
    }
}
