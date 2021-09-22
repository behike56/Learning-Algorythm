import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;


class EnPrimeNumber {

    /*
     *　素数とは、
     *　偶数は２だけが素数である。
     *　nの平方根以下のいずれの素数でも割り切れない。
     */
    public static void main(String[] args) {
        idea1();
        idea2();
    }
    /*
     * 3774回
     * 計算量としては平方根を取り入れたやり方の方が優れている。
     * このクラスでは、既知の素数のん全てで割り切れなかったものを
     * 素数としている。
     * PrimeNumber1よりはずっとマシだが、それでも29410回である。
     * 偶数を排除し、既知の素数の平方根と検査対象を比較するやり方の方が
     * 早い。
     */
    static void idea1(){
        //int[] prime = new int[500];
        List<Integer> prime = new LinkedList<>();
        int pIdx = 0;
        int counter = 0;

        prime.add(2);
        prime.add(3);

        // 小さい素数から割っていけば良い？
        // 奇数のみ確かめる
        for (int n = 5; n <= 1000;  n += 2){

            boolean flag = false;

            for (int i = 1; prime.get(i) * prime.get(i) <= n; i++){
                counter += 2;
                if (n % prime.get(i) == 0){
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                prime.add(n);
                pIdx++;
                counter++;
            }
        }

        // 求めたptr個の素数を表示
        // for (int i = 0; i < pIdx; i++){
        //     System.out.println(prime.get(i));
        // }

        System.out.println(counter);
    }

    /*
     * 2978回
     * 既知の素数の、例えば１の位の素数である３、５、７の
     * で割り切れる1000以下の数字をあらかじめリストアップしておき、
     * このんリストにある数字の場合は検査を行わないことにすれば
     * 計算の回数は減らせる。
     */
    static void idea2(){
        List<Integer> prime = new LinkedList<>();
        Set<Integer> ignore = new HashSet<>();

        Integer num =0;
        for (int i = 11; 1000 / 3 >= i; i+=2){
            ignore.add(i * 3);
        }

        for (int i = 11; 1000 / 5 >= i; i+=2){
            ignore.add(i * 5);
        }

        for (int i = 11; 1000 / 7 >= i; i+=2){
            ignore.add(i * 7);
        }

        int pIdx = 0;
        int counter = 0;

        prime.add(2);
        prime.add(3);

        // 小さい素数から割っていけば良い？
        // 奇数のみ確かめる
        for (int n = 5; n <= 1000;  n += 2){

            boolean flag = false;

            if (ignore.contains(n)) {
                prime.add(n);
                pIdx++;
                continue;
            }

            for (int i = 1; prime.get(i) * prime.get(i) <= n; i++){
                counter += 2;
                if (n % prime.get(i) == 0){
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                prime.add(n);
                pIdx++;
                counter++;
            }
        }

        // 求めたptr個の素数を表示
        // for (int i = 0; i < pIdx; i++){
        //     System.out.println(prime.get(i));
        // }

        System.out.println(counter);
    }
}
