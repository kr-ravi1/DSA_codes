public class Acrecursion {
    //basicrecursion
    //1st method.
//    public static void main(String[] args){
//        int N = 1;
//        printInc(N);
//    }
//    public static void printInc(int n){
//        if(n==10){
//            System.out.print("10");
//            return;
//        }
//            System.out.print(n+" ");
//        printInc(n+1);
//    }

     //2nd Method (Best Method)
//    public static void main(String[] args){
//        int N = 10;
//        printInc(N);
//    }
//    public static void printInc(int n){
//        if(n==1){
//            System.out.print("1"+" ");
//            return;
//        }
//            printInc(n-1);
//        System.out.print(n + " ");
//    }

    //fibonacci series
//    public static void main(String[] args){
//        int n = 26;
//        System.out.println(fib(n));
//    }
//    public static int fib(int n){
//        if(n==0)
//            return 0;
//        if(n==1)
//            return 1;
//        return fib(n-1) + fib(n-2);
//
//    }


    //isSorted Array.
//    public static void main(String[] args){
//        int[] arr = {1,2,3,5,4,89,34};
//        System.out.println(isSorted(arr,0));
//    }
//    public static boolean isSorted(int arr[], int i){
//        if(i == arr.length-1){
//            return true;
//        }
//            if(arr[i] > arr[i+1]){
//                return false;
//            }
//            return isSorted(arr,i+1);
//    }


    //firstOccurence of any key in an array
//    public static void main(String[] args){
//        int[] arr = {2,3,5,6,4,7,8,9};
//        if(firstOccurence(arr,6,0) == -1)
//            System.out.println("key not found");
//        else
//        System.out.println(firstOccurence(arr,6,0));
//    }
//    public static int firstOccurence(int arr[], int key, int i){
//        if(i==arr.length)
//            return -1;
//        if(key == arr[i])
//            return i;
//        return firstOccurence(arr,key,i+1);
//    }


    //lastOccurence
//    public static void main(String[] args){
//        int[] arr = {1,2,3,4,5,6,5,8};
//        int key = 5;
//        System.out.println(lastOccurence(arr,key,0));
//    }
//    public static int lastOccurence(int arr[], int key, int i){
//         if(i == arr.length){
//             return -1;
//         }
//         int isFound = lastOccurence(arr,key,i+1);
//         if(isFound == -1 && arr[i] == key){
//             return i;
//         }
//         return isFound;
//    }

    //x to the power n
//    public static void main(String[] args){
//        int x = 5;
//        int n = 3;
//        System.out.println(power(x,n));
//    }
//    public static int power(int x,int n){
//        if(n == 1)
//            return x;
//        return x * power(x,n-1);
//    }


    //x to the power n optimized
//    public static void main(String[] args){
//        System.out.println(optimizedPower(5,89));
//    }
//    public static long optimizedPower(int a,int n){
//        if(n == 0)
//            return 1;
//        long halfPower = optimizedPower(a,n/2);
//        long halfPowerSq = halfPower * halfPower;
//        if(n%2 != 0)
//            halfPowerSq = halfPowerSq * a;
//        return halfPowerSq;
//    }


    // Tilling problem
//    public static void main(String[] args){
//        System.out.println(tileProblem(4));
//    }
//    public static int tileProblem(int n){//2 x n board and 2 x 1 tile{
//        if(n==0 ||  n==1)
//            return 1;
//
//        //verical choice
//        int vertical = tileProblem(n-1);
//
//        //horizontal choice
//        int horizontal = tileProblem(n-2);
//
//        // totalWays
//        int totalWays = vertical + horizontal;
//        return totalWays;
//    }

   //remove duplicates in a string
//    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
//        if(idx == str.length()){ //base case
//            System.out.println(newStr);
//            return;
//        }
//        //kaam
//        char currChar = str.charAt(idx);
//        if(map[currChar-'a'] == true){
//            removeDuplicates(str,idx+1,newStr,map);
//        }
//        else {
//            map[currChar-'a'] = true;
//            removeDuplicates(str,idx+1,newStr.append(currChar),map);
//        }
//    }
//    public static void main(String[] args){
//        String str = "appnnacollege";
//        removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
//    }


    //friends pairing problem
//    public static int frndspair(int n){
//        if(n==1 || n==2)
//            return n;
//        //single
//        int sngl = frndspair(n-1);
//        //pair
//        int pair = frndspair(n-2)*(n-1);
//        int totalWays = sngl + pair;
//        return totalWays;
//    }
//    public static void main(String[] args){
//        System.out.println(frndspair(4));
//    }


     //Binary String Problem
//    public static void printBinStrings(int n, int lastPlace, String str){
//        // base case
//        if(n==0) {
//            System.out.println(str);
//            return;
//        }
//        //kaam
//        printBinStrings(n-1, 0, str+"0");
//        if(lastPlace == 0){
//            printBinStrings(n-1,1,str+"1");
//        }
//    }
//    public static void main(String[] args){
//        printBinStrings(6,0,"");
//    }


}
