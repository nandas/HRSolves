package com.ll;

public class PrintAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(6);
		head.appendToEnd(7);
		head.appendToEnd(8);
		PrintAll toprint=new PrintAll();
		toprint.Print(head);

	}
	
	void Print(Node head)
	{
	  while(head !=null){
		  System.out.println(head.data);
		  head=head.next;
	  }
	}

}
