import heapq
#Q. To merge K sorted Linkedlists
#Implementation using Minheaps; runs in O(nlog(k)) where n is size of final list

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[ListNode]
        :rtype: ListNode
        """
        temp = ListNode(0)
        curr = temp
        heap = []
        for i in lists:
            if i:
                heapq.heappush(heap, (i.val,i))
        
        while heap:
            minval = heapq.heappop(heap)[1]
            curr.next = minval
            curr = curr.next
            if minval.next:
                heapq.heappush(heap, (minval.next.val, minval.next))
        
        return temp.next
        