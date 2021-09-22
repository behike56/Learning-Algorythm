import java.util.Scanner;

class PhysicalExamination {

    static final int VMAX = 21;

    static class PhyscData {
        String name;
        int height;
        double vision;

        PhyscData(String name, int heihgt, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double aveHeight(PhyscData[] dat) {
        double sum = 0;

        for (int i = 0; i < dat.length; i++)
            sum += dat[i].height;

        return sum / dat.length;
    }

    static void distVision(PhyscData[] dat, int[] dist) {
        int i = 0;

        dist[i] = 0;
        for (i = 0; i <  dat.length; i++)
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                dist[(int)(dat[i].vision * 10)]++;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        PhyscData[] x = {
            new PhyscData("赤坂忠雄", 162, 0.3),
            new PhyscData("加藤冨秋", 173, 0.7),
            new PhyscData("斉藤正二", 175, 2.0),
            new PhyscData("武田信也", 171, 1.5),
            new PhyscData("長浜良一", 168, 0.4),
            new PhyscData("浜田哲明", 174, 1.2),
            new PhyscData("松富明夫", 169, 0.8)
        };

        int[] vdist = new int[VMAX];

        System.out.println("■身体検査一覧表■");
        System.out.println("氏名　　　　　身長　視力");
        System.out.println("------------------");

        for (int i = 0; i < x.length; i++)
            System.out.println("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

        System.out.println("\n平均身長：%5.1fcm\n", aveHeihgt(x));

        distVision(x, vdist);

        System.out.println("\n視力の分布");

        for (int i = 0; i < VMAX; i++)
            System.out.println("%3.1f〜：%2d人\n", i / 10.0, vdist[i]);
    }
}
