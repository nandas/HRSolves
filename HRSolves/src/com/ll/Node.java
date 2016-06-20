package com.ll;

public class Node
{
   int data;
   Node next;
   
   public Node(int x){
		data=x;
	}
   
   public Node(){
	   
   }
   
   void appendToEnd(int data){
		Node  newnode=new Node(data);
		Node head=this;
		while(head.next != null){
			head=head.next;
		}
		head.next=newnode;
		
	}
   
   void Print(Node head)
	{
	  while(head !=null){
		  System.out.println(head.data);
		  head=head.next;
	  }
	}
}
