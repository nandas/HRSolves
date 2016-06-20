package com.ll;

public class Insertnth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head=new Node();
		
		
		Insertnth test=new Insertnth();
		
	    head=test.InsertNth(head, 5, 0);
	    head=test.InsertNth(head, 3, 0);
	    
	    head=test.InsertNth(head, 4, 1);
	    test.Print(head);
	    

	}
	
	Node InsertNth(Node head, int data, int position) {
		Node newnode=new Node(data);
		if(position==0 && head == null){
			return newnode;
		}else if (position==0 && head !=null){
			newnode.next=head;
			return newnode;
		}else{
			Node temp=head;
			for(int i=0;i<position-1;i++){
				temp=temp.next;
			}
			
			newnode.next=temp.next;
			temp.next=newnode;
			return head;
		}
		
	}
	
	void Print(Node head)
	{
	  while(head.next !=null){
		  System.out.println(head.data);
		  head=head.next;
	  }
	}

}
