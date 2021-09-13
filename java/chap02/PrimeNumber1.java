/*
 * 1000以下の素数を列挙（第１版）
 */

class PrimeNumber {

    public static void main(String[] args) {
        // 除算のん回数
        int counter = 0;

        for (int n = 2; n <= 1000; n++) {
            int i;

            for (i = 2; i < n; i++){
                counter++;
                if (n % i == 0)
                    break;
            }

            if (n == i)
                System.out.println(n);
        }

        System.out.println("除算を行った回数：" + counter);
    }
}
