package Facebook_Leetcode;

import java.util.*;


/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero,
except the number 0 itself.


Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */

//public class AddTwoNumbers {
//    public static void main(String[] args){
//
//
//
//    }
//
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
//        ListNode dummy = new ListNode();
//        ListNode curr = dummy;
//        ListNode p1= l1;
//        ListNode p2= l2;
//        int sum = 0;
//
//        while (p1 != null || p2 != null){
//            if(p1 != null){
//                sum += p1.val;
//                p1 = p1.next;
//
//            }
//            if(p2 != null){
//                sum += p2.val;
//                p2 = p2.next;
//
//            }
//            curr.next = new ListNode(sum % 10);
//            sum /= sum;
//            curr = curr.next;
//
//        }
//        if (sum == 1){
//            curr.next = new ListNode(1);
//
//        }
//        return dummy.next;
//
//    }
//}
