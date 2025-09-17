public class ReverseLinkedList_II { // SC-O(1)  TC-O(N)
    static class node{
        int val;
        node next;
        node(int val){
            this.val=val;
            next=null;
        }
    }
    public static void main(String[] args){
        node head1=new node(1);
        head1.next=new node(2);
        head1.next.next=new node(3);
        head1.next.next.next=new node(4);
        head1.next.next.next.next=new node(5);
        head1.next.next.next.next.next=new node(6);
        int left =3; int right=5;
        node temp = reverselinkedlistBetween(head1,left,right);
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    private static node reverselinkedlistBetween(node head,int left,int right){
        node dummy = new node(0);
        dummy.next = head;

        node leftpre =dummy;
        node current = head;
        for(int i=0; i<left-1; i++){
            leftpre =leftpre.next;
            current=current.next;
        }
        node subleftpre = current;
        node pre = null;
        for (int i=0; i<=right-left; i++){
            node nextnode = current.next;
            current.next = pre;
            pre = current;
            current = nextnode;
        }
        leftpre.next=pre;
        subleftpre.next=current;

        return dummy.next;
    }
}
