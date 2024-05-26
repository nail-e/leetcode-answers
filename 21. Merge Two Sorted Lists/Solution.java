import java.util.Collections;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> result = new ArrayList<>();
        while (list1 != null) {
            result.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            result.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(result);
        ListNode headOfResult = new ListNode(-1);
        ListNode temp = headOfResult;
        for (int i = 0; i < result.size(); i++) {
            headOfResult.next = new ListNode(result.get(i));
            headOfResult = headOfResult.next; 
        }

        return temp.next;
    }
}
