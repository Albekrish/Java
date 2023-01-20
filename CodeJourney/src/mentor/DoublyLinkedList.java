package mentor;

import mentor.SinglyLinkedList.Node;

public class DoublyLinkedList {
	
	class Node{
		int data;
		Node previous;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
	}
	
	public Node head=null;
	public Node tail=null;
	int count=0;
	
	public void insertNode(int data) {
		Node newNode=new Node(data);
		
		if(head == null) {
			head=tail=newNode;
			head.previous=null;
			tail.next=null;
		}else {
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
			tail.next=null;
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
				head.previous=newNode;
				head=newNode;
			}/*else {
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
			count++; */
		}
	}
		
	public void display() {
		Node current=head;
		
		if(head == null) {
			System.out.println("List is empty");			
		}else {	
			System.out.println("Nodes of doubly linked list: ");
			while(current != null) {
				System.out.print(current.data+" ");
				current=current.next;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		DoublyLinkedList list=new DoublyLinkedList();
		list.insertNode(1);
		list.insertNode(2);
		list.insertNode(3);
		list.insertNode(4);
		list.insertNode(5);		
		list.display();
		
	}

}
