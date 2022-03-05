import sys

sys.path.append("..")
from utils.DataStructure import ListNode
from typing import List


class ReversePrint:
    def solution(self, head: ListNode) -> List[int]:
        list = []
        carry = head
        while carry:
            list.append(carry.val)
            carry = carry.next
        return list[::-1]
    
    def solution1(self, head: ListNode) -> List[int]:
        return self.solution1(head.next) + [head.val] if head else []        


head = ListNode(5, ListNode(1, ListNode(4)))
head1 = None

reverse = ReversePrint()
print(reverse.solution(head))
print(reverse.solution1(head))
