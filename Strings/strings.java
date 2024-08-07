package Strings;
public class strings {
    // check palindrome 
    public static boolean isPalindrome(String name){
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)!=name.charAt(name.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    // shortest path using directions
    public static float getShortestpath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            int dir=path.charAt(i);
            // top
            if(dir=='N'){
                y++;
            }
            // bottom
            else if(dir=='S'){
                y--;
            }
            // right
            else if(dir=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        return (float)Math.sqrt((x*x)+(y*y));
    }
    
    // string comparison

    public static void stringComparison(){
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");

        if(s1==s2){
            System.out.println("Both strings are equals");
        }
        else{
            System.out.println("Both strings are not equals");
        }

        if(s2.equals(s3)){
            System.out.println("Both r equals");
        }
        else{
            System.out.println("Not equals");
        }
    }
    
    // sub strings

    public static void subString(){

        String str="HelloWorld";
        String subStr="";
        for(int i=0;i<5;i++){
            subStr+=str.charAt(i);
        }
        System.out.print(subStr);
    }

    // print the largest strings
    public static String printLargestString(String fruits[]){
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        // String name="madam";
        // System.out.println(isPalindrome(name));
        // String path="WN";
        // System.out.println( getShortestpath(path));
        // stringComparison();
        // subString();

        // String str1="HelloWorldd";
        // System.out.println(str1.substring(0,5));

        String fruits[]={"apple","mango","banana","tomato"};
        System.out.println(printLargestString(fruits));
    }
}
