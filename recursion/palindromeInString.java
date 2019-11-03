import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

//Given a string, find all possible palindromic partitions of given string.
// solution - a function to check if a substring is a palindrome, a function to generate all substrings
class palindromeInString{
    public static void main(String[] args){
        String inp = "hello";
        System.out.println(inp + ":");
        allPalindromes(inp);
    }
    public static boolean isPalindrome(String s, int start, int end){
        while (start < end)  
        { 
            if (s.charAt(start++) != s.charAt(end--)) 
                return false; 
        } 
        return true; 
    }

    public static void allPalindromes(String s){
        ArrayList<ArrayList<String>> totalPartitions = new ArrayList<>();
        Deque<String> currentPartition = new LinkedList<String>();
        int leng = s.length();
        generatePalPart(totalPartitions, currentPartition, 0, leng, s);
        for(int i = 0; i<totalPartitions.size(); i++){
            for(int j = 0; j<totalPartitions.get(i).size(); j++){
                System.out.println(totalPartitions.get(i).get(j));
            }
        }
    }
    public static void generatePalPart(ArrayList<ArrayList<String>> totalPartitions, Deque<String> currentPartition, int start, int leng, String s){
       if(start==leng){
           totalPartitions.add(new ArrayList<>(currentPartition));
            return;
        }
        for(int i = start; i<leng; i++){
            if(isPalindrome(s, start, i)){
                currentPartition.addLast(s.substring(start, i+1));
                generatePalPart(totalPartitions, currentPartition, i+1, leng, s);
                currentPartition.removeLast();
            }
        }
    }
}