package com.ll;

public class InsertDoubleLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertDoubleLL ins=new InsertDoubleLL();
		DNode one=new DNode();
		//ins.SortedInsert(one, 2);
		//one=ins.SortedInsert(one, 2);
		DNode onea=ins.SortedInsert(one, 2);
		ins.print(ins.SortedInsert(onea, 1));
		//ins.print(one);

	}
	
	public void print(DNode head){
		while(head != null){
			System.out.print(head.data+"-");
			head=head.next;
					
		}
	}
	
	DNode SortedInsert(DNode head,int data) {
		 DNode n = new DNode();
		    n.data = data;
		    if (head == null) {
		        return n;
		    }
		    else if (data <= head.data) {
		        n.next = head;
		        head.prev = n;
		        return n;
		    }
		    else {
		        DNode rest = SortedInsert(head.next, data);
		        head.next = rest;
		        rest.prev = head;
		        return head;
		    }
	}
	
	void Print(Node head)
	{
	  while(head !=null){
		  System.out.print(head.data+"-");
		  head=head.next;
	  }
	}

}
