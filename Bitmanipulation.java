import java.util.*;
public class Bitmanipulation {
    public static void main(String[] args){

//        1. odd even
//       Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if((n&1) == 1)
//            System.out.println("Odd");
//        else
//            System.out.println("Even");

//       2. get ith bit
//        int i = sc.nextInt();
//        int n = sc.nextInt();
//        int bitmask = 1<<i;
//        if((n& bitmask)==0)
//            System.out.println("0");
//        else
//            System.out.println("1");

//        3. set ith bit
//          System.out.println(n|bitmask);
//        or
//        System.out.println(setbit(n,i));

//        4. clear ith bit
//        int bitmask = ~(1<<i);
//        System.out.println(n&bitmask);
//        or
//        System.out.println(clearbit(n,i));

//        5. update ith bit
//        int newBit = sc.nextInt();
//        System.out.println(updatebit(n,i,newBit));

//        6. clear i bits
//        System.out.println(clearIBits(n,i));

//        7. clear bits in range
//        int j = sc.nextInt();
//        System.out.println(clearBitsinRange(n,i,j));

//        8. isPower of Two
//        System.out.println(isPowerofTwo(n));

//        9. countSetBit
//        System.out.println(countSetBit(50));


//        10. fast Exponentiation
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(fastExpo(a,n));
    }
    public static int clearbit(int n,int i)
    {
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
    public static int setbit(int n,int i)
    {
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int updatebit(int n, int i, int newBit)
    {
//        both has same time complexity
        if(newBit == 0)
           return clearbit(n,i);
        else
          return  setbit(n,i);
//        or
//        n=clearbit(n,i);
//        int bitmask = newBit<<i;
//        return n | bitmask;
    }
    public static int clearIBits(int n, int i)
    {
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int clearBitsinRange(int n, int i, int j)
    {
        int a = (~0)<<(j+1);
        int b = (1<<i) - 1;
        int bitmask = a|b;
        return n & bitmask;
    }
    public static boolean isPowerofTwo(int n)
    {
        return (n&(n-1)) == 0;
    }

    public static int countSetBit(int n)
    {
        int count =0;
        while(n>0)
        {
            if((n & 1) != 0) //check lsb
                count++;
            n=n>>1;
        }
        return count;
    }

    public static int fastExpo(int a,int n)
    {
        int ans =1;
        while(n>0)
        {
            if((n&1) != 0)
                ans = ans * a;
            a =a*a;
            n = n>>1;
        }
        return ans;
    }
}
