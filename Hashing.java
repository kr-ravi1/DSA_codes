import java.sql.SQLOutput;
import java.util.*;

public class Hashing {
    public static void main(String[] args){
        //country(key) , population(value)
        HashMap<String,Integer> map = new HashMap<>();
        // insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);
        System.out.println(map);

        //search
        if(map.containsKey("Indonesia"))
        {
            System.out.println("key is present");
        }
        else
        {
            System.out.println("key is not present");
        }

        //for getting value
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        //Iteration in HashMap
        //Entry set
        for(Map.Entry<String,Integer> var : map.entrySet()){
            System.out.println(var.getKey());
            System.out.println(var.getValue());
        }
        //key set
        Set<String> keys = map.keySet();
        for(String key : keys ){
            System.out.println(key + " " + map.get(key));
        }
        // key set
//        for(int e : map.values())
//            int num = e;   values k sath aise hi khelna hai.
    }
}
