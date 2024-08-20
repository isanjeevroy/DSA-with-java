package bt;

public class Diameter {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info{
        int diam;
        int ht;
        Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    // approach-1 o(n2)
    public static int diamter2(Node root){
        if(root == null){
            return 0;
        }
        int leftDiam = diamter2(root.left);
        int lh = height(root.left);
        int rightDiam = diamter2(root.right);
        int rh = height(root.right);
        return Math.max(Math.max(leftDiam,rightDiam),lh+rh+1);
    }

    // approach-2 o(n)
    public static Info diamter(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diamter(root.left);
        Info rightInfo = diamter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diam,ht);
    }

    // SubTree of another tree

    public static boolean isIdentical(Node root, Node subRoot){
        if(root==null && subRoot==null){
            return true;
        } else if(root == null || subRoot == null || root.data!=subRoot.data){
            return false;
        }
        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root, Node subRoot){
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public static void main(String args[]){

        // Tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // subTree
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(diamter(root).diam);
        System.out.println(isSubtree(root, subRoot));
        
    }
}
