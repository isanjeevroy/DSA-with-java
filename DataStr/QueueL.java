package DataStr;

public class QueueL {
    static class Queue{

        static class Node{
            int data;
            Node next;
    
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        static Node head=null;
        static Node tail = null;
        // Empty
        static boolean isEmpty(){
            return head== null && tail==null;
        }

        // add
        static void add(int data){
            Node newNode = new Node(data);

            if(head == null && tail == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail=newNode;
        }
        // remove
        static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
            }
            int front = head.data;

            if(head==tail){
                head= tail = null;
            }else{

                head = head.next;
            }
            return front;
        }
        // peek
        static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
