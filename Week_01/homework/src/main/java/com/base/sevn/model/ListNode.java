package com.base.sevn.model;

/**
 * @program:
 * @description:
 * @author: sevn cy
 * @create: 2020-07-13 16:01
 **/
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
