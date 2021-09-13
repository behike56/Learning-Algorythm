import java.util.Arrays;
import java.util.Scanner;

/*
 *読み込んだ１０進整数を２進数〜３６進数へと基数変換して表示する
 */
class exe2of6 {

    /*
     *整数値xをr進数に変換した数字文字の並びを
     *配列dに格納して桁数を返却する。
     */
    static int cardConv(int x, int r, char[] d){
        int digits = 0;

        String dchar = "01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("----------------");
        do {

            // rで割った剰余で文字を取得し格納
            d[digits] = dchar.charAt(x % r);

            if (x != 0)
                System.out.print(r +" | " + x);



            if (digits != 0)
                System.out.println("     --- "  + d[(digits - 1)]);

            if (digits == 0)
                System.out.println();

            if ( x != 0 )
                System.out.println("  +------");

            // xに、xをrで割った、商を格納
            x /= r;
            digits++;

             if (x < 1)
                System.out.println("    " + x + "     ---" + d[(digits - 1)]);

        } while (x != 0);

        // 配列dの並びを反転
        for (int i = 0; i < digits / 2; i++){
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }

        return digits;

    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("１０進数を基数変換します。");
        do{
            do{
                System.out.println("変換する非負の変数：");
                no = stdIn.nextInt();
            } while (no < 0);

            do{
                System.out.println("何進数に変換しますか（２−３６）：");
                cd = stdIn.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);

            System.out.println(cd + "進数では");

            for (int i = 0; i < dno; i++)
                System.out.print(cno[i]);

            System.out.println("です。");

            System.out.println("もう一度しますか？(１・・・はい/０・・・いいえ)");
            retry = stdIn.nextInt();

        } while (retry == 1);
    }
}
