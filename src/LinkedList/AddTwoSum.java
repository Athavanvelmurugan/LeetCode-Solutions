public class AddTwoNumber{ //TC - O(Max(M,N)) SC- O(Max(M,N)) 
    static class node{
        int val;
        node next;

        node(int val){
            this.val=val;
            next=null;
        }
    }
    public static void main(String[] args) {
        node head = new node(9);
        head.next = new node(9);
        head.next.next = new node(9);
        head.next.next.next = new node(9);
        head.next.next.next.next = new node(9);
        head.next.next.next.next.next = new node(9);
        head.next.next.next.next.next.next = new node(9);

        node head2 = new node(9);
        head2.next = new node(9);
        head2.next.next = new node(9);
        head2.next.next.next = new node(9);

        node temp=  findtwosum(head, head2);
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    static node findtwosum(node head1, node head2){
        if(head1==null||head2==null){
            return null;
        }
        node result = new node(0);
        node ptr = result;
        int carry=0;
        while(head1!=null || head2!=null){
            int sum=0;
            if(head1!=null){
                sum+=head1.val;
                head1=head1.next;
            }
            if(head2!=null){
                sum+=head2.val;
                head2=head2.next;
            }
            int digit=sum%10;
            carry=sum/10;
            ptr.next = new node(digit);
            ptr=ptr.next;
        }
        if(carry>0)ptr.next = new node(carry);
        return result.next;
    }
}
