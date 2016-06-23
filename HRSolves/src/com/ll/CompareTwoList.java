package com.ll;

public class CompareTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node test1=new Node();
		test1.appendToEnd(3);
		test1.appendToEnd(2);
		test1.appendToEnd(1);
		
		Node test2=new Node();
		test2.appendToEnd(3);
		test2.appendToEnd(2);
		test2.appendToEnd(1);
		//test2.appendToEnd(4);
		
		CompareTwoList ctl=new CompareTwoList();
		System.out.println(ctl.CompareLists(test1, test2));

	}
	
	int CompareLists(Node headA, Node headB) {
		int i=0;
		while(headA != null && headB!= null){
			if(headA.data==headB.data){
				i=1;
				
			}else{
				i=0;
				break;
			}
			headA=headA.next;
			headB=headB.next;
			
			if((headA == null && headB != null)|| (headA != null && headB == null))
			{
				i=0;
			}
		}
		
		
		
		return i;
		
	}

}
