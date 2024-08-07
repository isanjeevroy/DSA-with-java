import java.util.*;
public class Basic {
    public static void main(String args[]){

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",110);
        hm.put("China",150);
        hm.put("Pakistan",30);
        hm.put("Nepal",6);
        System.out.println(hm);

        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",110);
        lhm.put("China",150);
        lhm.put("Pakistan",30);
        lhm.put("Nepal",6);
        System.out.println(lhm);

        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India",110);
        tm.put("China",150);
        tm.put("Pakistan",30);
        tm.put("Nepal",6);
        System.out.println(tm);
        // Set<String> keys = hm.keySet();
        // System.out.println(keys);

        // for (String k : keys) {
        //     System.out.println("Key: "+k +" , " + "value: "+hm.get(k));
        // }
    }
}
