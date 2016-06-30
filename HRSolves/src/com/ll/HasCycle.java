package com.ll;


public class HasCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node one=new Node(1);
		Node two=new Node(2);
		Node three=new Node(3);
		Node four=new Node(2);
		Node five=new Node(3);
		one.next=two;two.next=three;
		three.next=four;four.next=five;five.next=two;
		
		HasCycle hs=new HasCycle();
		System.out.println(hs.hasCycle(one));
	}
	
	void Print(Node head)
	{
	  while(head !=null){
		  System.out.print(head.data+"-");
		  head=head.next;
	  }
	}
	
	boolean hasCycle(Node head) {
		
		Node fast = head;
        Node slow = head;
 
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            System.out.println(slow.data+"="+fast.data);
            if(slow == fast)
                return true;
        }
 
		
		return false;
	}

	

}
