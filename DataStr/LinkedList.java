package DataStr;

public class LinkedList {

    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    // print the linked List
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    // add at first
    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }
      
        newNode.next=head;
        head = newNode;
    }
    // add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
 
        tail.next=newNode;
        
    }
    // add in middle
    public void addMiddle(int idx,int data){
        Node newNode = new Node(data);
        Node temp=head;
        int i=0;
        if(idx==0){
            addFirst(data);
            return;
        }
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    // remove Frist Nodee
    public int removeFirst(){
        if(sizeofLL()==0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }
        if(sizeofLL()==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        return val;
    }

    // remove Last Node
    public int removeLast(){
        if(sizeofLL()==0){
            System.out.println("LL is empty!");
            return Integer.MIN_VALUE;
        }
        else if(sizeofLL()==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int i=0;
        Node temp=head;
        while(i<sizeofLL()-2){
            temp=temp.next;
            i++;
        }
        int val=temp.next.data;
        temp.next=null;
        tail=temp;
        return val;
    }

    // remove from Nth element from last
    public void removeNthLast(int n){
        int i=0;
        Node temp=head;
        while(i<sizeofLL()-n-1){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
    }

    // search by iterative method
    public int searchKey(int key){
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;   
        }
        return -1;
    }
    // calculate size
    public int sizeofLL(){
        Node temp=head;
        int size=0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        return size;
    }
    public static void main(String args[]){

        LinkedList ll = new LinkedList();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(9);
        ll.addLast(5);
        ll.addLast(12);
        ll.addFirst(16);
        ll.addLast(14);
        ll.addMiddle(2, 5);
        ll.removeFirst();
        ll.removeFirst();
        ll.addFirst(23);
        ll.addFirst(89);
        ll.print();
        System.out.println(ll.sizeofLL());
        System.out.println(ll.searchKey(14));
    }
}
