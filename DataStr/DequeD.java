package DataStr;
import java.util.*;
import java.util.LinkedList;
public class DequeD {
    // ! stack using Deque
    static class Stack{
        Deque<Integer> d = new LinkedList<>();

        public void push(int data){
            d.addLast(data);
        }
        public int pop(){
            return d.removeLast();
        }
        public int peek(){
            return d.getLast();
        }

    }
    static class Queue{
        Deque<Integer> d = new LinkedList<>();
        public void add(int data){
            d.addLast(data);
        }
        public int remove(){
            return d.removeFirst();
        }
        public int peek(){
            return d.getFirst();
        }
    }
    // ! queue using deque

    public static void main(String args[]){
        Queue d = new Queue();
        d.add(1);
        d.add(2);
        d.remove();
        System.out.println(d.remove());
        
    }
}
