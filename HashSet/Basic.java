import java.util.*;
public class Basic {
    public static void main(String args[]){
        HashSet<String> city = new HashSet<>();
    
        city.add("Delhi");
        city.add("Chenani");
        city.add("Mumbai");
        city.add("Patna");
        city.add("Gutnur");
        System.out.println(city);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Chenani");
        lhs.add("Mumbai");
        lhs.add("Patna");
        lhs.add("Gutnur");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Chenani");
        ts.add("Mumbai");
        ts.add("Patna");
        ts.add("Gutnur");
        System.out.println(ts);


        // // using iterator
        // Iterator it = city.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // // advance loop

        // for (String c : city) {
        //     System.out.println(c);
        // }
    }
}
