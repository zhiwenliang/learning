from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def toString(self):
        s = ''
        selfCopy = self
        while (selfCopy != None):
            if (selfCopy.next != None):
                s = s + str(selfCopy.val) + ','
            else:
                s = s + str(selfCopy.val)
            selfCopy = selfCopy.next
        return s


class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode],
                      l2: Optional[ListNode]) -> Optional[ListNode]:
        dummyHead = ListNode(0)
        p = l1
        q = l2
        curr = dummyHead
        carry = 0
        while (p != None or q != None):
            x = p.val if p != None else 0
            y = q.val if q != None else 0
            sum = carry + x + y
            carry = sum // 10
            curr.next = ListNode(sum % 10)
            curr = curr.next
            if (p != None):
                p = p.next
            if (q != None):
                q = q.next
        if (carry > 0):
            curr.next = ListNode(carry)
        return dummyHead.next


tmp = ListNode(4, ListNode(1))
list = ListNode(1, tmp)
tmp1 = ListNode(5, ListNode(4, ListNode(9)))
list1 = ListNode(2, tmp1)
solution = Solution()
print(solution.addTwoNumbers(list, list1).toString())