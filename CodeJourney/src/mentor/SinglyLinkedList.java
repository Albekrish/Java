package mentor;

public class SinglyLinkedList {
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public Node head=null;
	public Node tail=null;
	public int count=0; //to keep track of node length
	//insert At last
	public void insertNode(int data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode;
			tail=newNode;
		}
		count++;
	}	
	
	//insert at given position (use count for list length)
	public void insertAtPosition(int data, int position) {
		if(position > count+1 || position < 1) {
			System.out.println("Invalid Position");
		}else {
			Node newNode= new Node(data);
			if(position == 1) {
				newNode.next=head;
			}else {
				Node previous=head;
				int current_pos=1;
				
				while(current_pos < position-1) {
					previous=previous.next;
					current_pos++;
				}
				
				Node current=previous.next;
				newNode.next=current;
				previous.next=newNode;
			}
			count++;
		}
	}
	
	//delete last	
	public void deleteLast() {
		if(head == null) {  //list is empty
			System.out.println("Singly Linked list is empty");
		}
		
		if(head.next == null) { //list contains only one node
			Node tempNode=head;
			head=head.next;
		}
		
		Node previous=null;
		Node current=head;
		
		while(current.next != null) {
			previous=current;
			current=current.next;
		}
		previous.next=null;
		count--;
		
	}
	
	public void deleteFromStart() {
		if(head == null) {  
            System.out.println("List is empty");             
        }else {
        	
        	if(head != tail) {
        		head=head.next;
        	}else {
        		head=tail=null;
        	}
        	count--;
        }
	}
	
	
	public void deleteAtIndex(int position) {
		if(head == null) {  //list is empty
			System.out.println("Singly Linked list is empty");
		}
		
		Node tempNode=head; 
		if(position == 0) { //list contains only one node			
			head=head.next;
		}
		
		for(int i=0; tempNode != null && i<position-1;i++) {
			tempNode= tempNode.next;
		}
		
		if(tempNode==null || tempNode.next==null) {
			return;
		}
		
		Node newNode=tempNode.next.next;
		tempNode.next=newNode;
		count--;
	}
	//Display
	public void display() {
		Node current=head;
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}else {	
			System.out.println("Nodes of Singly linked list: ");
			while(current != null) {
				System.out.print(current.data+" ");
				current=current.next;
			}
			System.out.println();
		}
	}	
	
	
	public static void main(String[] args) {
		
		SinglyLinkedList list= new SinglyLinkedList();
		list.insertNode(1);
		list.insertNode(2);
		list.insertNode(3);
		list.insertNode(4);
		list.insertNode(5);		
		list.display();
		
		list.deleteLast();		
		list.display();
		
		list.insertAtPosition(6, 2);
		list.display();
		
		list.deleteAtIndex(2);
		list.display();
		
		list.deleteFromStart();
		list.display();
		
	}

}
