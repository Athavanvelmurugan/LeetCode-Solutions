import java.util.*;

public class LinkedListCycle {
    static class node{
        int data;
        node next;

        node(int d){
            data = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = new node(4);
        head.next.next.next.next = head;
        System.out.println(findlinkedlistcycle(head));
        System.out.println(findlinkedlistcycle2(head));
    }
    static boolean findlinkedlistcycle(node head){ ///  Approach 1 TC-0(N) SC - O(N)
        if(head == null || head.next == null){
            return false;
        }
        Set<node>set = new HashSet<>();
        node current = head;
        while(current!= null){
            if(set.contains(current)){
                return true;
            }
            set.add(current);
            current = current.next;
        }
        return false;
    }
    static boolean findlinkedlistcycle2(node head){     //Approach 2 /// TC -O(N) SC -O(1)
        if(head == null || head.next == null){
            return false;
        }
        node slow =head;
        node fast = head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
