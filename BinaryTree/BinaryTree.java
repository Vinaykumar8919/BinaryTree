class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data) {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class BinaryTree {
    private TreeNode root;
    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
        third.left=six;
    }
    public void inOrder(TreeNode root1) {
        TreeNode root=root1;
        if(root==null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public void postOrder(TreeNode root1) {
        TreeNode root=root1;
        if(root==null) {
            return;

        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public void preOrder(TreeNode root1) {
        TreeNode root=root1;
        if(root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public int findMax(TreeNode root1) {
        TreeNode root=root1;
        if(root==null) {
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if(left>result) {
            result=left;
        } if (right > result) {
            result = right;
        }
        return result;
    }
    public int findMin(TreeNode root1) {
        TreeNode root=root1;
        if (root == null) {
            return Integer.MAX_VALUE; 
        }
        
        int result = root.data;
        int left = findMin(root.left);
        int right = findMin(root.right);
        
        if (left < result) {
            result = left;
        }
        if (right < result) {
            result = right;
        }
        
        return result;
    }
    


    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        System.out.println("Post-order traversal:");
        bt.postOrder(bt.root);

        System.out.println("\nPre-order traversal:");
        bt.preOrder(bt.root);

        System.out.println("\nIn-order traversal:");
        bt.inOrder(bt.root);

        int max = bt.findMax(bt.root);
        System.out.println("\nMaximum value: " + max);

        int min = bt.findMin(bt.root);
        System.out.println("Minimum value: " + min);
    }
}