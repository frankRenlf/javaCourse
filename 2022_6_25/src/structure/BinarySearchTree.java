package structure;


/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_6_25
 * @Package : structure
 * @createTime : 2022/6/25 11:39
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
public class BinarySearchTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode root;

    public void createTree(int[] arr) {
        for (int x : arr) {
            insert(x);
        }
    }

    private void removeNode(TreeNode pre, TreeNode cur) {
        if (cur.left == null) {
            if (pre == cur) {
                root = root.right;
            } else {
                if (pre.val > cur.val) {
                    pre.left = cur.right;
                } else {
                    pre.right = cur.right;
                }
            }
        } else if (cur.right == null) {
            if (pre == cur) {
                root = root.left;
            } else {
                if (pre.val > cur.val) {
                    pre.left = cur.left;
                } else {
                    pre.right = cur.left;
                }
            }
        } else {
            TreeNode tp = cur;
            TreeNode t = cur.right;
            while (t.left != null) {
                tp = t;
                t = t.left;
            }
            cur.val = t.val;
            if (tp == cur) {
                tp.right = t.right;
            } else {
                tp.left = t.right;
            }
//            if (pre == cur) {
//                cur = cur.right;
//                TreeNode parent = pre;
//                while (cur.left != null) {
//                    parent = cur;
//                    cur = cur.left;
//                }
//                parent.left = null;
//                cur.left = root.left;
//                root = cur;
//                while (cur.right != null) {
//                    cur = cur.right;
//                }
//                cur.right = pre.right;
//            } else {
//                if (pre.val > cur.val) {
//                    pre.left = cur.left;
//                } else {
//                    pre.right = cur.left;
//                }
//            }
        }
    }

    public boolean remove(int key) {
        TreeNode cur = root;
        TreeNode pre = root;
        while (cur != null) {
            if (cur.val > key) {
                pre = cur;
                cur = cur.left;
            } else if (cur.val < key) {
                pre = cur;
                cur = cur.right;
            } else {
                removeNode(pre, cur);
                return true;
            }
        }
        return false;
    }

    public TreeNode search(int key) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.val > key) {
                cur = cur.left;
            } else if (cur.val < key) {
                cur = cur.right;
            } else {
                return cur;
            }
        }

        return null;
    }

    public boolean insert(int key) {
        if (root == null) {
            root = new TreeNode(key);
            return true;
        }
        TreeNode cur = root;
        TreeNode pre = root;
        while (cur != null) {
            pre = cur;
            if (cur.val > key) {
                cur = cur.left;
            } else if (cur.val < key) {
                cur = cur.right;
            } else {
                return false;
            }
        }
        if (pre.val > key) {
            pre.left = new TreeNode(key);
        } else {
            pre.right = new TreeNode(key);
        }
        return true;
    }

    public void inorder(TreeNode cur) {
        if (cur == null) {
            return;
        }
        inorder(cur.left);
        System.out.print(cur.val + " ");
        inorder(cur.right);
    }

    public void inorder() {
        if (root == null) {
            return;
        }
        TreeNode cur = root;
        inorder(cur.left);
        System.out.print(cur.val + " ");
        inorder(cur.right);
    }

}
