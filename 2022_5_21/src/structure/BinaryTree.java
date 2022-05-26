package structure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree<E> {

    public static class TreeNode<E> {
        public E val;
        public TreeNode<E> left;
        public TreeNode<E> right;

        public TreeNode(E val) {
            this.val = val;

        }
    }

    public TreeNode<E> root;


    int index = 0;
    public TreeNode<Character> createTree(String dest){
        // 根 左子树 右子树
        TreeNode<Character> root = new TreeNode<>(dest.charAt(index));
        index++;
        if(dest.charAt(index) != '#') root.left = createTree(dest);
        index++;
        if(dest.charAt(index) != '#') root.right = createTree(dest);
        return root;
    }

    // 前序遍历
    public void preOrder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // 中序遍历
    public void inOrder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    // 后序遍历
    public void postOrder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    // 获取树中节点的个数
    public int size(TreeNode<E> root) {
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
    public int getLeafNodeCount(TreeNode<E> root) {
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
    public int getKLevelNodeCount(TreeNode<E> root, int k) {
        if (root == null) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return getKLevelNodeCount(root.left, k - 1) + getKLevelNodeCount(root.right, k - 1);
    }

    // 获取二叉树的高度
    public int getHeight(TreeNode<E> root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    // 检测值为value的元素是否存在
    public TreeNode<E> find(TreeNode<E> root, E val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        TreeNode<E> ret = find(root.left, val);
        if (ret != null) {
            return ret;
        }
        ret = find(root.right, val);
        return ret;
    }

    // 层序遍历
    public void levelOrder(TreeNode<E> root) {
        Queue<TreeNode<E>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode<E> tmp = queue.poll();
            if (tmp.left != null) {
                queue.add(tmp.left);
            }
            if (tmp.right != null) {
                queue.add(tmp.right);
            }
            System.out.println(tmp.val);
        }
    }

    public List<List<E>> writeLevelOrder(TreeNode<E> root) {
        List<List<E>> retList = new ArrayList<>();
        if (root == null) {
            return retList;
        }
        Queue<TreeNode<E>> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<E> ret = new ArrayList<>();
            while (size != 0) {
                TreeNode<E> tmp = queue.poll();

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
    public boolean isCompleteTree(TreeNode<E> root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode<E>> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode<E> tmp = queue.poll();
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
