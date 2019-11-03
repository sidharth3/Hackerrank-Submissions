import java.util.ArrayList;

class Allseq {
    static void printAllKLength(char[] set, int k) {
        int n = set.length;
        printAllKLengthRec(set, "", n, k);
    }

    static void printAllKLengthRec(char[] set, String prefix, int n, int k) {

        // Base case: k is 0,
        // print prefix
        if (k == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < n; ++i) {
            System.out.print("value of i is");
            System.out.println(i);
            // Next character of input added
            String newPrefix = prefix + set[i];
            printAllKLengthRec(set, newPrefix, n, k - 1);
        }
    }
    public static void main(String[] args){
        System.out.println("First Test"); 
        char[] set1 = {'a', 'b'}; 
        int k = 3; 
        printAllKLength(set1, k); 
    }
}
