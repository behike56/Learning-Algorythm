import java.util.Scanner;

public class Triangle{

    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int n;
	do {
	    System.out.print("短辺の長さ:");
	    n = stdIn.nextInt();
	
	    System.out.println("左下が直角の二等辺三角形");
	    triangleLB(n);
	    
	    System.out.println("左上が直角の二等辺三角形");
	    triangleLU(n);
	    
	    System.out.println("右上が直角の二等辺三角形");
	    triangleRU(n);
	    
	    System.out.println("右下が直角の二等辺三角形");
	    triangleRB(n);

	    System.out.println("ピラミッド");
	    piramid(n);

	    System.out.println("ピラミッド2");
	    piramid2(n);
	    
	} while (n <= 0);
    }

    // 左下
    static void triangleLB(int n){
	for (int i = 1; i <= n; i++) {
	    for (int j = 1; j <= i; j++)
		System.out.print('*');
	    System.out.println();
	}
    }
    // 左上
    static void triangleLU(int n){
	for (int i = n; i >= 1; i--) {	    
	    for (int j = 1; j <= i; j++)
		System.out.print('*');
	    
	    System.out.println();
	}
    }
    // 右上
    static void triangleRU(int n){
	for (int i = n; i >= 1; i--) {
	    // スペース
	    for (int j = 0; n - i > j; j++)
		System.out.print(' ');
	    // アスタリスク
	    for (int k = 1; k <= i; k++)
		System.out.print('*');
	    
	    System.out.println();
	    
	}
    }
    // 右下
    static void triangleRB(int n){
	for (int i = 1; i <= n; i++) {
	    // スペース
	    for (int j = 0; n - i > j; j++)
		System.out.print(' ');
	    // アスタリスク
	    for (int k = 1; k <= i; k++)
		System.out.print('*');
	    
	    System.out.println();
	    
	}
    }
    // 
    static void piramid(int n){
	for (int i = 1; i <= n; i++) {
	    // スペース
	    for (int j = n - i; j > 0; j--)
		System.out.print(' ');

	    // アスタリスク
	    for (int k = 1; k <=  (i-1)*2+1; k++) 
		System.out.print('*');
	    
	    System.out.println();
	}
    }

        static void piramid2(int n){
	for (int i = 1; i <= n; i++) {
	    // スペース
	    for (int j = n - i; j > 0; j--)
		System.out.print(' ');

	    // アスタリスク
	    for (int k = 1; k <= (i-1)*2+1; k++) 
		System.out.print(i % 10);
	    
	    System.out.println();
	}
    }
}
