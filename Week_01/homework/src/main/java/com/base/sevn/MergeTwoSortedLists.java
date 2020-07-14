package com.base.sevn;

import com.base.sevn.model.ListNode;
import lombok.val;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {


    /**
     * 这题的还是光题目理解起来就比较费劲, 传入的是集合为什么ListNode只是个单节点
     * 后面明白了, 有点类似俄罗斯套娃, 每个ListNode中都含有有next, 及指针指向形式, 凭着直觉一定会使用递归
     * 方法1: 递归, 新建一个ListNode存储最小值, 一直到结束()
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        mergeTwoLists(l1, l2, result);
        return result;
    }

    public void mergeTwoLists(ListNode l1, ListNode l2, ListNode result) {
        if (l1.next == null) {
            mergeResultLists(l2, result);
            return;
        }
        if (l2.next == null) {
            mergeResultLists(l1, result);
            return;
        }
        if (l1.val >= l2.val) {
            result.next = new ListNode(l2.next.val);
            mergeTwoLists(l1, l2.next, result);
        } else {
            result.next = new ListNode(l1.next.val);
            mergeTwoLists(l1.next);
        }
    }

    public void mergeResultLists(ListNode listNode, ListNode result) {
        if (listNode.next == null) {
            return;
        }
        result.next = new ListNode(listNode.val);
        mergeResultLists(listNode.next, result);
    }

}
