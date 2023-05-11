class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    public int sumBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = root.val;
        sum += sumBinaryTree(root.left);
        sum += sumBinaryTree(root.right);
        return sum;
    }

    public static void main(String[] args) {
        // Construct a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Compute the sum of all keys in the tree
        BinaryTree bt = new BinaryTree();
        int sum = bt.sumBinaryTree(root);
        System.out.println("The sum of all keys in the binary tree is: " + sum);
    }
}
