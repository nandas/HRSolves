package com.ll;

public class PrintReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintReverse pr=new PrintReverse();
		Node test=new Node(4);
		test.appendToEnd(3);
		test.appendToEnd(2);
		test.appendToEnd(1);
		pr.ReversePrint(test);

	}
	
	void Print(Node head)
	{
	  while(head.next !=null){
		  System.out.println(head.data);
		  head=head.next;
	  }
	}
	
	void ReversePrint(Node head) {
		  if(head != null) { // we recurse every time unless we're on the last one
			  ReversePrint(head.next);  // this says "do this to the next node first"
			  System.out.println(head.data);
		    }
		    
		
	}

}
