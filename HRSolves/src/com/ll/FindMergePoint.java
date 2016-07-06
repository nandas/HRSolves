package com.ll;

public class FindMergePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node one=new Node(1);
		Node two=new Node(3);
		Node three=new Node(5);
		Node twoa = new Node(4) ;
		
		Node four=new Node(6);
		
		one.next=two;two.next=three;three.next=four;
		twoa.next=three;
		
		FindMergePoint fmp=new FindMergePoint();
		System.out.println(fmp.FindMergeNode(one, twoa));

	}
	
	void Print(Node head)
	{
	  while(head !=null){
		  System.out.print(head.data+"-");
		  head=head.next;
	  }
	}
	
	int FindMergeNode(Node headA, Node headB) {
		 Node currentB = headB;
		 Node currentA = headA;
		    while(currentA != currentB){
		        if(currentA.next == null){
		            currentA = headB;
		        }else{
		            currentA = currentA.next;
		        }
		        if(currentB.next == null){
		            currentB = headA;
		        }else{
		            currentB = currentB.next;
		        }
		    }
		    return currentB.data;
	}

}
