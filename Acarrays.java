import java.util.*;

public class Acarrays {

    // linearSearch
//    public static void main(String[] args){
//        String menu[] = {"dosa" , "chhole bhature" , "samosha" , "idly" , "jalebi"};
//        Scanner sc = new Scanner(System.in);
//        String key = sc.next();
//        if(linearSearch(menu,key) == 1)
//            System.out.println("Yes");
//        else
//            System.out.println("no");
//    }
//
//    public static int linearSearch(String menu[],String key){
//        for(int i=0;i<menu.length;i++)
//        {
//            if(menu[i].equals(key)) return 1;
//        }
//            return 0;
//    }

    // get the largest number
//    public static void main(String[] args){
//        int nums[] = {2,5,8,7,56,45,90};
//        System.out.println(getLargest(nums));
//    }
//    public static int getLargest(int nums[]){
//        int max = Integer.MIN_VALUE;
//        for(int i=0;i<nums.length;i++) {
//            if (max < nums[i])
//            {
//                max=nums[i];
//            }
//        }
//            return max;
//
//    }


//    binarySearch
//    public static void main(String[] args)
//    {
//        int numbers[] = {2,4,6,8,10,12,14};
//        int key = 10;
//        System.out.println("Index for key is "+ binarySearch(numbers,key));
//    }
//    public static int binarySearch(int numbers[],int key){
//        int start =0,end = numbers.length-1;
//        while(start <= end){
//            int mid = (start+end)/2;
//            // comparisions
//            if(numbers[mid] == key)
//                return mid;
//            if(numbers[mid]<key)
//            {
//                start = mid+1; //right
//            }
//            else
//            {
//                end = mid-1; //left
//            }
//        }
//        return -1;
//    }

    // reverse arrays
//    public static void main(String[] args){
//        int nums[] = {2,4,6,8,10,12};
//
//        reverse(nums);
//        System.out.println(Arrays.toString(nums));
//    }
//    public static void reverse(int nums[]) {
//        int start = 0,end = nums.length-1;
//        while(start<end)
//        {
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//
//            start++;
//            end--;
//        }
//    }

    //pairs in an array
//    public static void main(String[] args){
//        int nums[] = {2,4,6,8,10};
//        for(int i=0;i<nums.length;i++)
//        {
//            for(int j=i+1;j<nums.length;j++)
//            {
//                System.out.print("("+nums[i]+","+nums[j]+"), ");
//            }
//            System.out.println();
//        }
//    }

    //print subArrays
//    public static void main(String[] args){
//        int numbers[] = {2,4,6,8,10};
//        for(int i=0;i<numbers.length;i++)
//        {int start = i;
//            for(int j=i;j<numbers.length;j++)
//            {int end = j;
//                for(int k=start;k<=end;k++)
//                    System.out.print(numbers[k] +" ");
//                System.out.println();
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }

    //sum of subArrays with min and max Bruite Force
//     public static void main(String[] args){
//         int numbers[] = {2,4,6,8,10};
//         int sum =0;
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         for(int i=0;i<numbers.length;i++)
//         {
//             for(int j=0;j<numbers.length;j++)
//             {
//                 sum=0;
//                 for(int k=i;k<=j;k++)
//                 {
//                     sum+=numbers[k];
//                 }
//                     if(max<sum)
//                         max=sum;
//                     if(min>sum && sum!=0)
//                         min=sum;
//             }
//         }
//         System.out.println(min);
//         System.out.println(max);
//     }

      //sum of subArrays by prefix Array
//    public static void main(String[] args){
//        int numbers[] = {1,-2,6,-1,3};
//        int start,end;
//        int sum=0;
//        int maxSum = Integer.MIN_VALUE;
//        int[] prefix = new int[numbers.length];
//        prefix[0]=numbers[0];
//        for(int i=1;i<numbers.length;i++)
//        {
//            prefix[i] = prefix[i-1]+numbers[i];
//        }
//        for(int i=0;i<numbers.length;i++)
//        {
//            start = i;
//            for(int j=i;j<numbers.length;j++)
//            {
//                end = j;
//                sum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
//                if(maxSum<sum)
//                    maxSum=sum;
//            }
//        }
//        System.out.println(maxSum);
//    }







        //KADANE's Algorithm for sum of subArrays.
//    public static void main(String[] args){
//        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
//        int maxSum = Integer.MIN_VALUE;
//        int currSum = 0;
//        for(int i=0;i<numbers.length;i++){
//            currSum = currSum+numbers[i];
//            maxSum=Math.max(currSum,maxSum);
//            if(currSum<0) currSum=0;
////            maxSum=Math.max(currSum,maxSum); //this line cannot handle that case which has all negative numbers.
//        }
//        System.out.println(maxSum);
//    }


        // arr: input array
        // n: size of array
        //Function to find the sum of contiguous subarray with maximum sum.

//        public static void main(String[] args){
//            int[] arr = {-2,-4,-1,-6};
//            long max = Integer.MIN_VALUE;
//            long currSum = 0;
//            for(int i = 0 ; i< arr.length ; i++){
//                currSum+=arr[i];
//                if(currSum > max) max = currSum;  //This line handles all the cases.
//                if(currSum < 0) currSum = 0;
//            }
//            System.out.println(max);
//        }







//    trapping rainwater
//    public static void main(String[] args){
//        int height[] = {4,2,0,6,3,2,5};
//        int n = height.length;
//        //calculate leftMax boundary
//        int[] leftMax = new int[n];
//        leftMax[0] = height[0];
//        for(int i=1;i<n;i++)
//        {
//            leftMax[i] = Math.max(leftMax[i-1],height[i]);
//        }
//        //calculate rightMax boundary
//        int[] rightMax = new int[n];
//        rightMax[n-1] = height[n-1];
//        for(int i=n-2;i>=0;i--)
//        {
//            rightMax[i] = Math.max(rightMax[i+1],height[i]);
//        }
//        //loop
//        int rainWater =0;
//        int width = 1;
//        for(int i=0;i<n;i++)
//        {
//            int waterLevel = Math.min(leftMax[i],rightMax[i]);
//            rainWater += (waterLevel - height[i]) * width;
//        }
//        System.out.println(rainWater);
//    }

//practice
//    public static void main(String[] args){
//        int[] heights = {4,2,0,6,3,2,5};
//        int trappedWater = 0;
//        int[] leftMax = new int[heights.length];
//        leftMax[0] = heights[0];
//        for(int i=1;i<heights.length;i++){
//            leftMax[i] = Math.max(leftMax[i-1],heights[i]);
//        }
//        int[] rightMax = new int[heights.length];
//        rightMax[heights.length-1] = heights[heights.length-1];
//        for(int i= heights.length-2;i>=0;i--){
//            rightMax[i] = Math.max(rightMax[i+1],heights[i]);
//        }
//        for(int i=0;i< heights.length;i++){
//            int waterLevel = Math.min(leftMax[i],rightMax[i]);
//            trappedWater += waterLevel - heights[i];
//        }
//        System.out.println(trappedWater);;
//    }





    // Buy and Sell Stock.
//    public static void main(String[] args) {
//        int price[] = {7,1,5,3,6,4};
//        int buyPrice = Integer.MAX_VALUE;
//        int maxProfit = 0;
//        for (int i = 0; i < price.length; i++) {
//            if (buyPrice < price[i]) {
//                int profit = price[i] - buyPrice;
//                maxProfit = Math.max(profit, maxProfit);
//            } else {
//                buyPrice = price[i];
//            }
//        }
//        System.out.println(maxProfit);
//    }

    // practice
//    public static void main(String[] args){
//        int[] curPrice = {7,6,5,3,1,4};
//        int buyPrice = curPrice[0];
//        int maxPrice = Integer.MIN_VALUE;
//        for(int i=1;i< curPrice.length;i++){
//            if(buyPrice > curPrice[i])
//                buyPrice = curPrice[i];
//            else if(maxPrice < curPrice[i] - buyPrice)
//                maxPrice = curPrice[i] - buyPrice;
//        }
//        System.out.println(maxPrice);
//    }


}
