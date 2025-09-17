public class middlelinkedlist { 
	int val;
	middlelinkedlist next;
	
	public middlelinkedlist(int val){
		this.val=val;
		next=null;
	}
	public static void main(String[]args) {
		middlelinkedlist l1 = new middlelinkedlist(1);
		middlelinkedlist l2= new  middlelinkedlist(2);
		middlelinkedlist l3= new middlelinkedlist(3);
		middlelinkedlist l4= new middlelinkedlist(4);
		middlelinkedlist l5= new middlelinkedlist(5);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		
		middlelinkedlist result = middles(l1);
		System.out.println(result.val);
		
	}
	
	public static middlelinkedlist middles(middlelinkedlist l1) {
		middlelinkedlist slow = l1;
		middlelinkedlist fast =l1;
		
		while(fast.next!=null && fast.next.next!=null) {
			slow =slow.next;
			fast =fast.next.next;
		}
		
		return slow;
	}
}
