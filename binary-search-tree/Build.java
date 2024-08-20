package bst;

public class Build {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left = null;
            this.right = null;
        }
    }
    // build or insert the bst
    public static Node insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }

        if(root.data>val){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    //  print the in order treee
    public static void inOrderPrint(Node root){
        if(root == null){
            return;
        }
        inOrderPrint(root.left);
        System.out.print(root.data + " ");
        inOrderPrint(root.right);
    }

    //  search the data in bst
    public static boolean search(Node root,int key){
        if ( root == null){
            return false;
        }
        if (root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }

    public static void main(String args[]){
        int values[]={5,13,4,2,7};
        Node root = null;
        
        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        inOrderPrint(root);
        System.out.println();        
        if(search(root, 10)){
            System.out.println("found");
        }
        else{
            System.out.println(" not found");
        }
    }
}
