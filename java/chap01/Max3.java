import java.util.Scanner;

class Max3{

    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);

	System.out.println("三つの整数の最大値を求めます。");
	System.out.print("a  value:");
	int a = stdIn.nextInt();
	System.out.print("b  value:");
	int b = stdIn.nextInt();
	System.out.print("c  value:");
	int c = stdIn.nextInt();

	int max = a;
	if (b > max) max = b;
	if (c > max) max = c;

	System.out.println("Maximmum value is " + max + ".");
    }
}
