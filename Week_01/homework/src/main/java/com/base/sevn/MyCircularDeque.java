package com.base.sevn;

public class MyCircularDeque {

    /**
     * 存储的基础还是数组
     */
    int[] arr;
    int size;
    int head;
    int rear;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        if (k < 0) {
            throw new IllegalArgumentException("Deque size is less than 0!");
        }
        this.arr = new int[k];
        this.size = 0;
        this.head = 0;
        this.rear = 0;
    }

    /** Adds an item at the head of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (size == arr.length) {
            return false;
        }
        if (head == 0) {
            arr[arr.length - 1] = value;
            head = arr.length - 1;
        } else {
            arr[--head] = value;
        }
        size ++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (size == arr.length) {
            return false;
        }
        arr[rear] = value;
        rear = rear == arr.length - 1 ? 0 : rear + 1;
        size ++;
        return true;
    }

    /** Deletes an item from the head of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (size == 0) {
            return false;
        }
        head = head == arr.length - 1 ? 0 : head + 1;
        size--;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (size == 0) {
            return false;
        }
        if (rear == 0) {
            rear = arr.length - 1;
        } else {
            rear--;
        }
        size --;
        return true;
    }

    /** Get the head item from the deque. */
    public int getHead() {
        if (size == 0) {
            return -1;
        }
        return arr[head];
    }

    /** Get the rear item from the deque. */
    public int getRear() {
        if (size == 0) {
            return -1;
        }
        return rear == 0 ? arr[arr.length - 1] : arr[rear - 1];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size == arr.length;
    }
}
