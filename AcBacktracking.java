public class AcBacktracking {
    // Backtracking on Arrays.
    public static void main(String[] args){
        int[] Arr = new int[5];
        changeArr(Arr,0,1);
        printArr(Arr);
    }
    public static void changeArr(int[] Arr,int i,int val){
        //base case
        if(i==Arr.length) {
            printArr(Arr);
            return;
        }
        //recursion
        Arr[i] = val;
        changeArr(Arr,i+1,val+1);
        Arr[i] = Arr[i] -2; //backtracking
    }
    public static void printArr(int[] Arr){
        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i] +" ");
        }
        System.out.println();
    }
}
