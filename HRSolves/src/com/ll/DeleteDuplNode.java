package com.ll;


public class DeleteDuplNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node one=new Node(0);
		Node two=new Node(1);
		Node three=new Node(3);
		Node four=new Node(4);
		Node five=new Node(4);
		Node six=new Node(7);
		one.next=two;two.next=three;three.next=four;four.next=five;five.next=six;
		DeleteDuplNode del=new DeleteDuplNode();
		del.Print(del.RemoveDuplicates(one));

	}
	
	void Print(Node head)
	{
	  while(head !=null){
		  System.out.print(head.data+"-");
		  head=head.next;
	  }
	}
	
	
	public Node RemoveDuplicates(Node head) {
		// 1 2 3 3 5
		if (head.next==null) return head;
		Node helper = new Node(0);
		helper.next = head;
	    Node p = helper;
	     
	    while(p.next != null){
	    	if( p.data == p.next.data){
	    		//Node nex 3 t=p.next;
	    		p.next=p.next.next;
	    		//p = p.next;
	    	}else{
	    		p = p.next;
	    	}
	    }
        
        return helper.next;
    }

}
