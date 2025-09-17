public class LinkedListCycle_II { //TC -O(N) SC -O(1) 
    static class  node{
        int data;
        node next;

        node(int data){
            this.data=data;
            next=null;
        }
    }
    public static void main(String[] args) {
        node head1=new node(1);
        head1.next=new node(2);
        head1.next.next=new node(3);
        head1.next.next.next=new node(4);
        head1.next.next.next.next=head1.next;

        node temp =findlinkedlist(head1);
        System.out.println(temp.data);
    }

    private  static node findlinkedlist(node head1){
        if(head1==null)return null;
        node slow=head1;
        node fast=head1;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                while(head1!=slow){
                    slow=slow.next;
                    head1=head1.next;
                }
                return slow;
            }
        }
        return null;
    }
}
