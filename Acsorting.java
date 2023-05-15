import java.util.Arrays;

public class Acsorting {

    //Bubble Sorting.
//    public static void main(String[] args){
//        int numbers[] = {5,4,1,3,2};
//        for(int turns=0;turns<numbers.length-2;turns++)
//        {
//            for(int j=0;j<numbers.length-1-turns;j++)
//            {
//                if(numbers[j]>numbers[j+1]) {
//                    int temp = numbers[j];
//                    numbers[j] = numbers[j+1];
//                    numbers[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(numbers));
//    }


    //practice
//    public static void main(String[] args){
//        int[] arr ={5,4,1,3,2};
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=0;j<arr.length-i-1;j++){
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }

    //selection Sorting
//    public static void main(String[] args){
//        int numbers[] = {5,4,1,3,2};
//        int i,j;
//        for(i=0;i<numbers.length-1;i++)
//        { int minPos = i;
//            for(j=i+1;j<numbers.length;j++)
//            {
//                if(numbers[minPos] > numbers[j])
//                    minPos = j;
//            }
//            // swap
//            int temp = numbers[minPos];
//            numbers[minPos] = numbers[i];
//            numbers[i] = temp;
////            System.out.println(Arrays.toString(numbers));
//        }
//        System.out.println("Final Array is: "+ Arrays.toString(numbers));
//    }

    //practice
//    public static void main(String[] args){
//        int[] numbers = {5,4,1,3,2};
//
//        for(int i=0;i<numbers.length;i++){
//            int minPos = i;
//            for(int j=i+1;j<numbers.length;j++){
//                if(numbers[minPos] > numbers[j]){
//                    minPos = j;
//                }
//            }
//            int temp = numbers[minPos];
//            numbers[minPos] = numbers[i];
//            numbers[i] = temp;
//        }
//        System.out.println(Arrays.toString(numbers));
//    }


    // Insertion sorting
//    public static void main(String[] args){
//        int numbers[] = {5,4,1,3,2};
//        for(int i=1;i<numbers.length;i++)
//        {
//            int curr = numbers[i];
//            int prev = i-1;
//            while((prev >= 0) && (numbers[prev] > curr))
//            {
//                numbers[prev+1] = numbers[prev];
//                prev--;
//            }
//            numbers[prev+1] = curr;
//        }
//        System.out.println(Arrays.toString(numbers));
//
//    }

    // Counting Sort
//    public static void main(String[] args){
//        int numbers[] = {1,4,1,3,2,4,3,7};
//        int largest = Integer.MIN_VALUE;
//        for(int i=0;i<numbers.length;i++)
//        {
//            largest = Math.max(largest,numbers[i]);
//        }
//        int count[] = new int[largest+1];
//        for(int i=0;i<numbers.length;i++)
//        {
//            count[numbers[i]]++;
//        }
//        //sorting
//        int j=0;
//        for(int i=0;i<count.length;i++)
//        {
//            while(count[i] > 0)
//            {
//                numbers[j] = i;
//                j++;
//                count[i]--;
//            }
//        }
//        System.out.println(Arrays.toString(numbers));
//    }
}
