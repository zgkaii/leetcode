package list;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/01/15 10:46
 * @Description: 24. 两两交换链表中的节点
 *               https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * 
 */
public class SwapNodes {
    /**
     * 方法1.奇数列、偶数列分成两个链表，再merge 方法2.递归 方法3.迭代
     */
    public ListNode3 swapPairs2(ListNode3 head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode3 newHead = head.next;
        head.next = swapPairs2(newHead.next);
        newHead.next = head;
        return newHead;
    }

    public ListNode3 swapPairs3(ListNode3 head) {
        ListNode3 pre = new ListNode3(0);
        pre.next = head;
        ListNode3 temp = pre;
        while (temp.next != null && temp.next.next != null) {
            ListNode3 start = temp.next;
            ListNode3 end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }
}

class ListNode3 {
    int val;
    ListNode3 next;

    ListNode3() {
    }

    ListNode3(int val) {
        this.val = val;
    }

    ListNode3(int val, ListNode3 next) {
        this.val = val;
        this.next = next;
    }
}