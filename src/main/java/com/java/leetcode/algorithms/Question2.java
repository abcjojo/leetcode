package com.java.leetcode.algorithms;

import com.java.leetcode.common.ListNode;

public class Question2 {

    /**
     *  遍历两个链表，元素挨个相加，考虑进位情况
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode cur = head;

        int carry = 0;  // 进位值
        while (l1 != null || l2 != null) {

            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;

            int sum = val1 + val2 + carry;    // 两节点之和加进位值
            carry = sum / 10;          // 下个节点的进位值
            int val = sum % 10;     // 插入节点的真实值
            cur.next = new ListNode(val);

            cur = cur.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        if (carry == 1) {
            cur.next = new ListNode(carry);
        }

        return head.next;
    }
}
