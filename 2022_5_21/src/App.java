import structure.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        BinaryTree<Character> binaryTree = new BinaryTree<>();
        BinaryTree.TreeNode<Character> root = binaryTree.createTree("abc##de#g##f###");
//        binaryTree.preOrder(root);
//        System.out.println();
//        binaryTree.inOrder(root);
//        System.out.println();
//        binaryTree.postOrder(root);
//
//        System.out.println();
//        System.out.println(binaryTree.size(root));
//
//        System.out.println(binaryTree.getLeafNodeCount(root));

//        System.out.println(binaryTree.getKLevelNodeCount(root, 3));
//        System.out.println(binaryTree.getHeight(root));
//        System.out.println(binaryTree.find(root, 'i'));
//        System.out.println(binaryTree.writeLevelOrder(root));
        binaryTree.inOrder(root);
        System.out.println();
        System.out.println(binaryTree.find(root,'x'));
    }
}
