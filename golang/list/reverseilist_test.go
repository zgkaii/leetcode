package list

type ListNode struct {
	Val  int
	Next *ListNode
}

// 206. 反转链表 https://leetcode-cn.com/problems/reverse-linked-list/
// 1->2->3->4->5->NULL => 5->4->3->2->1->NULL
// 1.递归
func reverseList1(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}
	newHead := reverseList1(head.Next)
	head.Next.Next = head
	head.Next = nil
	return newHead
}

// 2.双指针
func reverseList2(head *ListNode) *ListNode {
	var pre *ListNode
	cur := head
	for cur != nil {
		next := cur.Next
		cur.Next = pre
		pre = cur
		cur = next
	}
	return pre
}
