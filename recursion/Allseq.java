// //q. Given a set of characters and a positive integer k, print all possible strings of length k that can be formed from the given set.
// //sol - for every i in character set, recurse k times

// import java.util.ArrayList;

// class Allseq {
//     static void printAllKLength(char[] set, int k) {
//         int n = set.length;
//         printAllKLengthRec(set, "", n, k);
//     }


//     static void printAllKLengthRec(char[] set, String prefix, int n, int k) {


//         if (k == 0) {
//             System.out.println(prefix);
//             return;
//         }
//         for (int i = 0; i < n; ++i) {
//             System.out.print("value of i is");
//             System.out.println(i);
//             // Next character of input added
//             String newPrefix = prefix + set[i];

//             printAllKLengthRec(set, newPrefix, n, k - 1);
//         }
//     }
//     public static void main(String[] args){
//         System.out.println("First Test"); 
//         char[] set1 = {'a', 'b'}; 
//         int k = 3; 
//         printAllKLength(set1, k); 
//     }
// }

//notes - Dog g = new Hound(); ==> g will only have functions available to Dog(not hound)
// if A x = new B(), x only has A functions, but overriden methods in B will be implemented
// if I is an interface, you cant have K x = new I(), but you can have I x = new K() == I can be an object because it acts like a 
//superclass of the class that implements it but it cannot be instantiated. if you have I x = new K(); then x can only call I's functions, not functions in k not in I
// void firstMethod(K k) vs void secondMethod(I i) second is better for flexibility purposes, easier to write new code
