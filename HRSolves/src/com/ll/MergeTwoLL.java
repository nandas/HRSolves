package com.ll;


public class MergeTwoLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node one = new Node();
		one.data=1;
		Node two=new Node();
		two.data=2;
		MergeTwoLL merge=new MergeTwoLL();
		merge.Print(merge.MergeLists(one, two));
				

	}
	
	void Print(Node head)
	{
	  while(head !=null){
		  System.out.print(head.data+"-");
		  head=head.next;
	  }
	}

	
	Node MergeLists(Node headA, Node headB) {
		Node head=new Node();
		Node temp=head;
		
		
		 while(headA!=null||headB!=null){
		        if(headA!=null&&headB!=null){
		            if(headA.data < headB.data){
		                temp.next = headA;
		                headA=headA.next;
		            }else{
		                temp.next=headB;
		                headB=headB.next;
		            }
		            temp = temp.next;
		        }else if(headA==null){
		            temp.next = headB;
		            break;
		        }else if(headB==null){
		            temp.next = headA;
		            break;
		        }
		    }
		 
		    return head.next;
	}

}
