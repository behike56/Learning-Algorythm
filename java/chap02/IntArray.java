class IntArray{

    public static void main(String[] args){
        int[] a = new int[5];

        a[1] = 37;
        a[2] = 51;
        a[4] = a[1] * 2;

        for (int num: a){
            System.out.println(num);
        }
    }
}
