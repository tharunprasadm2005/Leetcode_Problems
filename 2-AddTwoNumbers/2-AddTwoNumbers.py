# Last updated: 03/09/2025, 10:10:04
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: Optional[ListNode]
        :type l2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        # Initialize a dummy node, which will help in simplifying the head manipulation
        dummy_head = ListNode(0)
        current = dummy_head  # Pointer to the current node in the result list
        carry = 0  # Initialize carry to 0
        
        # Traverse through both lists until both are empty and there's no carry left
        while l1 or l2 or carry:
            # Get the current values from the two lists (0 if the list is empty)
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0
            
            # Calculate the sum of the two digits plus the carry
            total = val1 + val2 + carry
            
            # Calculate the new digit and the carry
            carry = total // 10  # Carry will be 1 if the sum is >= 10, otherwise 0
            current.next = ListNode(total % 10)  # Create a new node with the current digit
            
            # Move the current pointer to the new node
            current = current.next
            
            # Move the pointers to the next nodes in the input lists, if available
            if l1: l1 = l1.next
            if l2: l2 = l2.next
        
        # The result is in dummy_head.next, so return that
        return dummy_head.next
