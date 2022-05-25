package structure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

//        E.left = I;
        E.right = H;
        H.left = I;

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
    public int getKLevelNodeCount(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return getKLevelNodeCount(root.left, k - 1) + getKLevelNodeCount(root.right, k - 1);
    }

    // 获取二叉树的高度
    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    // 检测值为value的元素是否存在
    public TreeNode find(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        TreeNode ret = find(root.left, val);
        if (ret != null) {
            return ret;
        }
        ret = find(root.right, val);
        return ret;
    }

    // 层序遍历
    public void levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            if (tmp.left != null) {
                queue.add(tmp.left);
            }
            if (tmp.right != null) {
                queue.add(tmp.right);
            }
            System.out.println(tmp.val);
        }
    }

    public List<List<Character>> writeLevelOrder(TreeNode root) {
        List<List<Character>> retList = new ArrayList<>();
        if (root == null) {
            return retList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Character> ret = new ArrayList<>();
            while (size != 0) {
                TreeNode tmp = queue.poll();
                ret.add(tmp.val);
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
                size--;
            }
            retList.add(ret);
        }
        return retList;
    }

    // 判断一棵树是不是完全二叉树
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            if (tmp != null) {
                queue.offer(tmp.left);
                queue.offer(tmp.right);
            } else {
                break;
            }
        }
        while (!queue.isEmpty()) {
            if (queue.poll() != null) {
                return false;
            }
        }
        return true;
    }

}
