package DataStr;

import java.util.Stack;

public class StackB {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class Stack{

    //  ! ******Using LinkedList******
    // static Node head=null;

    // todo : is Empty check

    public static boolean isEmpty(){
        return head==null;
    }

    // todo: push operation
    // todo: always add the node at frist only

    public static void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        return;
    }

    // todo: pop operations
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int temp=head.data;
            head=head.next;
            return temp;
        }

    // todo: peek operations
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    // ! ***********using arraylist**********

    static ArrayList<Integer> list = new ArrayList<>();
    static boolean isEmpty() {
        return list.size() == 0;
    }

    static void push(int data) {
        list.add(data);
    }

    static int pop() {
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    static int peek() {
        return list.get(list.size() - 1);
    }

    }

    // !  Q1: add element at the bottom of stack
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // ! Q2: Print the stack
    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    // ! Q3: Reverse the string using stack and builder
    public static String reverseString(String str) {
        Stack<Character> st = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            st.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb = new StringBuilder("");
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();

    }

    // ! Q4: reverse the stack element

    public static void reverseElement(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseElement(s);
        pushAtBottom(s, top);
    }

    // ! this is Main method here
    public static void main(String args[]) {

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseElement(s);
        printStack(s);
    }
}
