package com.ll;

public class InsertAtTail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertAtTail tailobj=new InsertAtTail();
		Node list=tailobj.Insert(null, 7);
		//tailobj.Print(list);
		tailobj.Print(tailobj.Insert(list, 8));

	}
	
	void Print(Node head)
	{
	  while(head !=null){
		  System.out.println(head.data);
		  head=head.next;
	  }
	}
	
	Node Insert(Node head,int data) {
		if(head == null){
			return new Node(data);
		}else{
			Node temp=head;
			while(head.next != null){
				head=head.next;
			}
			head.next=new Node(data);
			return temp;
		}
		
	}

}
