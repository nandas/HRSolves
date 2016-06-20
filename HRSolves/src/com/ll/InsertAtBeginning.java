package com.ll;

public class InsertAtBeginning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertAtBeginning beginobj=new InsertAtBeginning();
		Node list=beginobj.Insert(null, 7);
		list=beginobj.Insert(list, 6);
		beginobj.Print(list);

	}
	
	void Print(Node head)
	{
	  while(head !=null){
		  System.out.println(head.data);
		  head=head.next;
	  }
	}
	
	Node Insert(Node head,int data) {
		Node newnode=new Node();
		newnode.data=data;
		if(head == null){
			return newnode;
		}else{
			newnode.next=head;
			return newnode;
		}
	}

}
