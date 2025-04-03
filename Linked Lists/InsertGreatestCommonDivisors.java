// https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

 U:
 Can we recieve an empty list? No
 Medium sized range

 M: Linked List problem
 Two pointer method?
 - We may want to use this for the first and second node, but 
 it may not be necessary
 Second list?
 - Not necessary

 Edge cases:
 - List of length 1

 P: Brute force method
1. If nead.next == null
    - Return head
2. while head.next 
    - check for the greatest common divisor
    1. see if larger % smaller == 0
        return smaller
    2. if not, decrement smaller and conitnue to check
    - insert the node into the linked list
    1. 
3. return the linked list

 */

class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode curr = head;
        int smaller = (curr.val < curr.next.val) ? curr.val : curr.next.val;
        int larger = (curr.val > curr.next.val) ? curr.val : curr.next.val;
        ListNode next = curr.next;
        
        while (curr.next != null) {
            // Check for greatest common divisor
            smaller = (curr.val < curr.next.val) ? curr.val : curr.next.val;
            // larger = (curr.val > curr.next.val) ? curr.val : curr.next.val;
            ListNode gcd = new ListNode(1);

            while (smaller > 1) {
                if (curr.val % smaller == 0 && curr.next.val % smaller == 0) {
                    gcd.val = smaller;
                    break;
                }
                smaller--;
            }
            // Insert the gcd
            next = curr.next;
            curr.next = gcd;
            gcd.next = next;
            curr = curr.next.next;

        }
        return head;
    }
}
