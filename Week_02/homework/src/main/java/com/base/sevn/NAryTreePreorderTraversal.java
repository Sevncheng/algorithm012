package com.base.sevn;

import java.util.ArrayList;
import java.util.List;

/**
 * @program:
 * @description:
 * @author: sevn cy
 * @create: 2020-07-22 10:17
 **/
public class NAryTreePreorderTraversal {

    /**
     * 这题没啥好说的咯比较简单
     * @param root
     * @return
     */
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversal(list, root);
        return list;
    }

    public void preorderTraversal(List<Integer> list, Node node) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        if (node.children == null || node.children.size() == 0) {
            return;
        }
        for (Node child : node.children) {
            preorderTraversal(list, child);
        }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
