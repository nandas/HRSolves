package com.ll;

public class Node
{
   int data;
   Node next;
   
   public Node(int x){
		data=x;
	}
   
   void appendToEnd(int data){
		Node  newnode=new Node(data);
		Node head=this;
		while(head.next != null){
			head=head.next;
		}
		head.next=newnode;
		
	}
}
