
public class RemoveNthnode { //TC -O(N) SC -O(1)
	static class node{
		int val;
		node next; 
		
		node(int val){
			this.val=val;
			next=null;
		}
	}
	public static void main(String[]args) {
        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = new node(4);
        int n = 2;

        node temp = removenthnode(head, n);
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

    }
    static node removenthnode(node head, int n){
        if(head==null)return null;
        node dummy=new node(0);
        dummy.next=head;
        node slow =dummy;
        node fast =dummy;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}
