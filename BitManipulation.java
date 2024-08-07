import java.util.*;
public class BitManipulation {

    // even and odd
    public static void oddEven(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    // get ith bit 
    public static void getIthBit(int n, int i){
        int bitMask=1<<i;
        if((n&bitMask)==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
    // set ith bit (set '1' value)

    public static int setIthBit(int n, int i){
        int bitMask=1<<i;
        return n|bitMask;
    }
    // clear ith bit (set '0' value)

    public static int clearIthBit(int n, int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }
    public static void main(String args[]){
        // oddEven(5);
        // oddEven(8);
        // getIthBit(7, 2);
        System.out.println(setIthBit(8, 0));
        System.out.println(clearIthBit(8, 3));
    }
}
