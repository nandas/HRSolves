package com.ll;

public class DeleteNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeleteNode delnode=new DeleteNode();
		Node del=new Node(1);
		del.appendToEnd(2);
		del.appendToEnd(3);
		del.appendToEnd(4);
		del=delnode.Delete(del, 1);
		delnode.Print(del);
		
		

	}
	
	void Print(Node head)
	{
	  while(head !=null){
		  System.out.println(head.data);
		  head=head.next;
	  }
	}
	
	Node Delete(Node head, int position) {
		  // Complete this method
		    Node main=head;
				if(head==null){
					return head;
				}else if(position==0){
					head=head.next;
					return head;
				}else if(position>0){
					
					for(int i=0;i<position-1;i++){
						
				    	head=head.next;
				    	//System.out.println("Current head:"+head.data);
					}
					head.next=head.next.next;
					
					return main;
				}else{
					return null;
				}

		}

}
