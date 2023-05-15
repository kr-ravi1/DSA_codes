import java.util.*;
public class Arraylist {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

//        List<Integer> list = new ArrayList<>();  // ArrayList through list interface.
//        List<Integer> list = new LinkedList<>(); //LinkedList through list interface.


        list.add(49);
        list.add(30);
        list.add(78);
        System.out.println(list);
        list.add(1,34);
        System.out.println(list);
        System.out.println(list.get(0));
        list.remove(Integer.valueOf(34));
        System.out.println(list);
        list.set(1,23);
        System.out.println(list);


//        input from keyboard
//        for(int i=0;i<n;i++)
//        {
//            list.add(i,sc.nextInt());
//        }
//        System.out.println(list);


    }


}
