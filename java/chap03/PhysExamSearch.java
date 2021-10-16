import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

class PhysExamSearch {

    static class PhysData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhysData> HEIGHT_ORDER = new HeightOrderCOmparator();

        private static class HeightOrderComparator implements Comparator<PhysData> {
            return (d1.height > h2.height) ? 1 :
                (d1.height < d2.height) ? -1 : 0;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x = {
            new PhyscData("あかさかただお", 162, 0.3);
            new PhyscData("ながはまりょういち", 168, 0.4);
            new PhyscData("まつとみあきお", 169, 0.8);
            new PhyscData("たけだしんや", 171, 1.5);
            new PhyscData("かとうとみあき", 173, 0.7);
            new PhyscData("はまだてつあき", 174, 1.2);
            new PhyscData("さいとうまさじ", 175, 2.0);
        };

        System.out.print("何ｃｍの人をさがしますか：");
        int height = stdIn.nextInt();
        int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);

        if (idx < 0)
            System.out.println("その値の要素は存在しません。");
        else {
            System.out.println("その値はｘ[" + idx + "]にあります。");
            System.out.println("データ：　" + x[idx]);
        }

}
