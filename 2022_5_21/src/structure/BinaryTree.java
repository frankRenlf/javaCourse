package structure;

public class BinaryTree {

    public static class TreeNode {
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;

        }
    }

    public TreeNode root;


    public TreeNode createBinaryTree() {

        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        TreeNode I = new TreeNode('I');

        A.left = B;
        A.right = C;

        B.left = D;
        B.right = E;

        E.left = I;
        E.right = H;

        C.left = F;
        C.right = G;
        root = A;

        return root;
    }

    // 前序遍历
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // 中序遍历
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    // 后序遍历
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    // 获取树中节点的个数
    public int size(TreeNode root) {
        int countSize = 0;
        if (root == null) {
            return 0;
        }
        countSize += size(root.left);
        countSize += size(root.right);
        countSize++;
        return countSize;
    }

    // 获取叶子节点的个数
    public int getLeafNodeCount(TreeNode root) {
//        int countLeaf = 0;
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafNodeCount(root.left) + getLeafNodeCount(root.right);
    }

    // 子问题思路-求叶子结点个数
    // 获取第K层节点的个数
    int getKLevelNodeCount(TreeNode root) {
        return 0;
    }

    // 获取二叉树的高度
    int getHeight(TreeNode root) {
        return 0;
    }

    // 检测值为value的元素是否存在
    TreeNode find(TreeNode root, int val) {
        return root;

    }

    // 层序遍历
    void levelOrder(TreeNode root) {

    }

    // 判断一棵树是不是完全二叉树
    boolean isCompleteTree(TreeNode root) {
        return false;

    }

}
