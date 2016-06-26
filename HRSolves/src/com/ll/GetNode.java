package com.ll;

public class GetNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node test=new Node();
		test.appendToEnd(3);
		test.appendToEnd(2);
		test.appendToEnd(1);
		GetNode gn=new GetNode();
		System.out.println(gn.GetNode1(test,0));

	}
	
	
	
	void Print(Node head)
	{
	  while(head.next !=null){
		  System.out.println(head.data);
		  head=head.next;
	  }
	}
	
	

	int GetNode1(Node head,int n) 
		    {
		        int len = 0;
		        Node temp = head;
		 
		        while (temp != null)
		        {
		            temp = temp.next;
		            len++;
		        }
		 
		        if (len < n)
		            return -1;
		 
		        temp = head;
		 
		        for (int i = 1; i < len-n; i++)
		            temp = temp.next;
		 
		        return temp.data;
		    }


	

}
