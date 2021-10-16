import java.util.Arrays;
import java.util.Scanner;

class StringBinarySearch {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String[] x = {
            "abstract", "assert", "boolean", "break", "byte",
            "case", "catch", "cahr", "class", "const",
            "contine", "deefault", "do", "double", "else",
            "enum", "extends", "final", "finally", "float",
            "for", "goto", "if", "implements", "import",
            "instanceof", "int", "interface", "long", "native",
            "new", "pacage", "private", "protected", "public",
            "return", "shorts", "static", "strictfp", "super",
            "switch", "synchronized", "this", "throw", "throws",
            "transient", "try", "void", "volatile", "while"
        };
        System.out.print("何を探しますか？: ");
        String ky = stdIn.next();

        int idx = Arrays.binarySearch(x, ky);

        if (idx < 0) {
            System.out.println("そのキーワードは存在しません。");
        } else {
            System.out.println("それはx[" + idx + "]にあります。")
        }
    }
}
