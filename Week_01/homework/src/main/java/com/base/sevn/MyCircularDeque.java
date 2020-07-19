package com.base.sevn;

public class MyCircularDeque {

    /**
     * 存储的基础还是数组
     */
    private int[] arr;
    private int size;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        int[] arr = new int[k];
        size = k;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {

    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {

    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {

    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {

    }

    /** Get the front item from the deque. */
    public int getFront() {
        
    }

    /** Get the last item from the deque. */
    public int getRear() {

    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return arr.length == 0 || arr == null;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return arr.length == size;
    }
}
