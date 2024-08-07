import java.util.*;
public class Anagram {

    public static boolean isAnagram(String s,String t){

        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }
            else{
                hm.put(s.charAt(i), 1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(hm.containsKey(t.charAt(i))){
                hm.remove(t.charAt(i));
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s ="tulip";
        String t ="iulip";
        System.out.println(isAnagram(s, t));
    }
    
}
