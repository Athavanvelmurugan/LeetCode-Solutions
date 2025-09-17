public class ReorderList {
    static class node{
        int val;
        node next;
        node(int val){
            this.val = val;
            next = null;
        }
    }
    public static void main(String[] args){
        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = new node(4);
        head.next.next.next.next = new node(5);
        head.next.next.next.next.next = new node(6);
        node temp = reorderlist(head);
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    private static node reorderlist(node head){
        node slow = head;
        node fast = head;
        while( fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        node curr =slow.next;
        slow.next = null;
        node pre =null;
        while(curr!=null){
            node next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        node first =head;
        node second =pre;

        while(second!=null){
           node t1 = first.next;
           node t2 = second.next;

           first.next = second;
           second.next = t1;

           first = t1;
           second = t2;
        }
        return head;
    }
}
