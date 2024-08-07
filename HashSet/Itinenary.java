import java.util.HashMap;

public class Itinenary {
    public static String startPoint(HashMap<String,String> tickets){
        HashMap<String,String> rewMap = new HashMap<>();

        //! long way
        // Set<String> key1 = tickets.keySet();
        // for(String k: key1){
        //     rewMap.put(tickets.get(k),k);
        // }

        for (String key : tickets.keySet()) {
            rewMap.put(tickets.get(key),key);
        }

        for (String key : tickets.keySet()) {
            if(!rewMap.containsKey(key)){
                return key;
            }
        }
        return null;
        
    }
    public static void main(String args[]){
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start = startPoint(tickets);
        System.out.print(start);
        for(String str:tickets.keySet()){
            System.out.print("-->"+tickets.get(start));
            start=tickets.get(start);
        }
        System.out.println();
    }
}
