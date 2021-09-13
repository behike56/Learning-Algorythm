import java.util.Scanner;

class exe2of3 {
    static int sumOf(int[] a){
        int sum =0;

        for(int num: a)
            sum += num;
        return sum;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("要素数を入力して下さい：");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++)
            x[i] = stdIn.nextInt();

        System.out.println("配列の合計値は：" + sumOf(x));
    }
}
