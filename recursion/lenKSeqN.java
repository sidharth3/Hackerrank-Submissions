//Given two positive integers n and k, 
//print all increasing sequences of length k such that the elements in every sequence are from first n natural numbers.
class lenKSeqN{
    
    public static void main(String[] args){
        int k = 3;
        int n = 7;
        int[] arr = new int[k];
        int l = 0;
        allSeq(n, k, l, arr);
    }
    public static void allSeq(int n, int k, int l, int[] arr){
        if(l==k){
            printAll(arr);
            return;
        }
        int i = (l == 0)?1 : arr[l-1]+1;
        l++;
        while(i<=n){
            arr[l-1] = i;
            allSeq(n, k, l, arr);
            i++;
        }
        
    }
    public static void printAll(int[] arr){
        for(int i:arr){
            System.out.print(i + " ");
           
        }
        System.out.print("\n");
    }
    

}