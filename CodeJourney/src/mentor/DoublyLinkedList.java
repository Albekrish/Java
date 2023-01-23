package mentor;

public class DoublyLinkedList {
	
	class Node{
		int data;
		Node previous;
		Node next;
		
		public Node(int d) {
			data=d;
		}
	}
	
	Node head;
	public void insertNode(int data) {  //insert at the beginning
		Node newNode=new Node(data);
		
		newNode.next=head;
		newNode.previous=null;
		
		if(head != null) {
			head.previous=newNode;
		}
		head=newNode;
	}
	
	public void insertAfterNode(Node prev_node, int data) { //insert after the given node
		if(prev_node == null) {
			System.out.println("Previous Node cant be null");
			return;
		}
		
		Node new_node= new Node(data);
		
		new_node.next=prev_node.next;
		prev_node.next=new_node;
		new_node.previous=prev_node;
		
		if(new_node.next != null) {
			new_node.next.previous=new_node;
		}
		
	}
	
	public void insertLast(int data) {
		Node new_node=new Node(data);
		
		Node last=head;
		
		new_node.next=null;
		
		if(head == null) {
			new_node.previous=null;
			head= new_node;
			return;
		}
		
		while(last.next != null) {
			last=last.next;
		}
		
		last.next=new_node;
		new_node.previous=last;
	}
	
	public void insertBeforeNode(Node next_node,int data) {
		
		if(next_node == null) {
			System.out.println("The next node can't be null");
			return;
		}
		
		Node new_node= new Node(data);
		new_node.previous=next_node.previous;
		next_node.previous=new_node;
		new_node.next=next_node;
		
		if(new_node.previous != null) {
			new_node.previous.next=new_node;		
		}else {
			head=new_node;
		}
	}
	
	public void deleteNode(Node del_node) {
	 
		if(head == null || del_node== null) {
			return;
		}
		
		if(head == del_node) {
			head= del_node.next;
		}
		
		if(del_node.next != null) {
			del_node.next.previous=del_node.previous;
		}
		
		if(del_node.previous != null) {
			del_node.previous.next=del_node.next;
		}
		
		return;
	}
	
	public void display(Node node) {
		Node last=null;
		System.out.println("Traversal in forward direction: ");
		
		while(node != null) {
			System.out.print(node.data+" ");
			last=node;
			node=node.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction: ");
		while(last != null) {
			System.out.print(last.data+" ");
			last=last.previous;
		}
	}
	public static void main(String[] args) {
		DoublyLinkedList list=new DoublyLinkedList();
		list.insertNode(1);
		list.insertNode(2);
		list.insertNode(3);
		list.insertNode(4);
		list.insertNode(5);
		
		System.out.println("Doubly Linked list :");
		list.display(list.head);
		
		list.deleteNode(list.head);
		
		System.out.println();
		System.out.println("Doubly LL after deletion: ");
		list.display(list.head);
	}

}
