package com.ll;

public class GetNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node test=new Node();
		test.appendToEnd(3);
		test.appendToEnd(2);
		test.appendToEnd(1);
		GetNode gn=new GetNode();

	}
	
	
	
	void Print(Node head)
	{
	  while(head.next !=null){
		  System.out.println(head.data);
		  head=head.next;
	  }
	}
	
	
	Node Reverse(Node head) {
		if(head == null ) return null;
		if(head.next==null) return head;
		//3->2->1->Null
		Node temp=head.next;        //3 node to temp
		System.out.println(temp.data+",");
		head.next=null;             //3's next null in head
		Node temp1= Reverse(temp);
		temp.next=head;
		return temp1;


	}

}
