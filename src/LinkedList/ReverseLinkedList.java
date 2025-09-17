public class ReverseLinkedList { //TC- O(N) SC-O(1)
    static  class node{
        int val;
        node next;
        node(int val){
            this.val=val;
            next=null;
        }
    }
    public static void main(String[] args) {
        node head1=new node(1);
        head1.next=new node(2);
        head1.next.next=new node(3);
        head1.next.next.next=new node(4);

        node temp = reverselist(head1);
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    static node reverselist(node head){
        node curr =head;
        node pre =null;

        while(curr!=null){
            node next =curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
}
