/*
 * 1,000以下の素数を列挙 (第３版)
 *
 * 素数の条件
 * 1.整数nの平方根以下のいずれの素数でも割り切れない
 * 2.4以上の偶数は素数ではない
 *
 */

class PrimeNumber3 {

    public static void main(String[] args) {
        //　乗除算の回数
        int counter = 0;
        // 得られた素数の個数
        int ptr = 0;
        // 素数を格納する配列
        int[] prime = new int[500];

        // ２と３は素数である
        prime[ptr++] = 2;
        prime[ptr++] = 3;

        // 奇数のみを対象とする
        for (int n = 5; n <= 1000; n += 2) {

            boolean flag = false;
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;

                /*
                 *割り切れると素数ではない
                 *繰り返しは中断
                 */
                if (n % prime[i] == 0) {
                    flag = true;
                    break;
                }
            }

            /*
             * 最後まで割り切れじゃ買ったら
             * 素数として配列に登録する
             */
            if (!flag) {
                prime[ptr++] = n;
                counter++;
            }
        }

        // 求めたptr個の素数を表示
        for (int i = 0; i < ptr; i++){
            System.out.println(prime[i]);
        }

        System.out.println(counter);

    }
}
