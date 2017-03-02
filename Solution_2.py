class Solution:
    # @return a ListNode
     def addTwoNumbers(self, l1, l2):
            add=0
            head=ListNode(0)
            r=head
            while(l1 or l2):
            	node=ListNode(add)
            	if(l1):
            		node.val+=l1.val
            		l1=l1.next
            	if(l2):
            		node.val+=l2.val
            		l2=l2.next
            	add=1 if node.val>=10 else 0
            	node.val=node.val%10
            	head.next=node
            	head=head.next
            if add==1:
            	node=ListNode(1)
            	head.next=node
            return r.next
