package com.base.sevn;

import com.base.sevn.model.ListNode;

public class MergeTwoSortedLists {

    /**
     * 这题的还是光题目理解起来就比较费劲, 传入的是集合为什么ListNode只是个单节点
     * 后面明白了, 有点类似俄罗斯套娃, 每个ListNode中都含有有next, 及指针指向形式, 凭着直觉一定会使用递归
     * 方法1: 递归, 新建一个ListNode存储最小值, 一直到结束, 但是搞了好久指针传递下去好像有问题, 使用集合存储 再把集合转成链表非常搓
     * 方法2: 递归, 直接变更Node中的next指针顺序, 核心思想: 让两个节点的当前值进行比较, 如果L1当前小于L2的, 那么保留当前L1的值,
     * 同时把L1的NEXT值变更为 L1的下一个节点值和L2的当前值比较后较小的那个值
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 26-32行参照题解, 运用的很巧, 既可以进行判空, 同时也可以在递归到L1或L2任意一个到末尾时, 直接返回另一个剩余的节点
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }


//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        List<Integer> result = new ArrayList<>();
//        mergeTwoLists(l1, l2, result);
//        Iterator<Integer> iterator = result.iterator();
//        if (result.size() == 0) {
//            return null;
//        }
//        ListNode listNode = new ListNode();
//        convert(listNode, iterator);
//        return listNode;
//    }
//
//    public void convert(ListNode listNode, Iterator<Integer> iterator) {
//        while (iterator.hasNext()) {
//            listNode.val = iterator.next();
//            if (iterator.hasNext()) {
//                listNode.next = new ListNode();
//                convert(listNode.next, iterator);
//            }
//            break;
//        }
//    }
//
//    public void mergeTwoLists(ListNode l1, ListNode l2, List<Integer> result) {
//        if (l1 == null) {
//            mergeResultLists(l2, result);
//            return;
//        }
//        if (l2 == null) {
//            mergeResultLists(l1, result);
//            return;
//        }
//        if (l1.val >= l2.val) {
//            result.add(l2.val);
//            mergeTwoLists(l1, l2.next, result);
//        } else {
//            result.add(l1.val);
//            mergeTwoLists(l1.next, l2, result);
//        }
//    }
//
//    public void mergeResultLists(ListNode listNode, List<Integer> result) {
//        if (listNode == null) {
//            return;
//        }
//        result.add(listNode.val);
//        mergeResultLists(listNode.next, result);
//    }
}
