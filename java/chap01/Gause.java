import java.util.Scanner;

class Gause{
    public static void main (String[] args){
	Scanner stdIn = new Scanner(System.in);

	System.out.println("Enter A: ");
	int a = stdIn.nextInt();
	System.out.println("Enter B: ");
	int b = stdIn.nextInt();

	int resultNum = sumOf(a, b);
	
	System.out.println("Sum: ");
	System.out.println(String.valueOf(resultNum));
    }

    static int sumOf(int a, int b){
	int addNum = 0;
	int stopNum = 0;
	int resultNum = 0;

	if (a > b) {
	    stopNum = (a - b) + 1;
	    addNum = b;
	}

	if (a < b) {
	    stopNum = (b - a) + 1;
	    addNum = a;
	}
	
	for (int i = 1; i <= stopNum; i++) {
	    resultNum += addNum;
	    addNum += 1;
	}

	return resultNum;
    }
}
