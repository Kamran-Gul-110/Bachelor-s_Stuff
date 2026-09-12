class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
class CircularLinkedList{
	Node head;
	CircularLinkedList(){
		this.head = null;
	}
	void addFront(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			head.next = head;
			return;
		}
		newNode.next = head;
		head = newNode;
		Node current = head;
		do{
			current = current.next;
		}while(current.next != head.next);
		current.next = head;
	}
	void addBack(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			head.next = head;
			return;
		}
		Node current = head;
		while(current.next != head){
			current= current.next;
		}
		current.next = newNode;
		newNode.next = head;
	}
	void deleteFront(){
		if(head == null){
			System.out.print("List is empty, nothing to delete");
			return;
		}
		if(head.next == head){
			head = null;
			return;
		}
		head = head.next;
		Node current = head;
		while(current.next != head){
			current = current.next;
		}
		current.next = head;
	}
	void deleteBack(){
		if(head == null){
			System.out.print("List is empty, nothing to delete");
			return;
		}
		if(head.next == head){
			head = null;
			return;
		}
		Node current = head;
		while(current.next.next != head){
			current = current.next;
		}
		current.next = head;
	}
	void addBefore(int target, int data){
		Node newNode = new Node(data);
		Node current = head;
		if(head == null){
			System.out.print("No data in list for addAfter, try addFront or addBack");
			return;
		}
		if(target == head.data){
			newNode.next = head;
			while(current.next != head){
				current = current.next;
			}
			head = newNode;
			current.next = head;
			return;
		}
		while(current.next != head && current.next.data != target){
			current = current.next;
		}
		if(current.next == head){
			return;
		}
		newNode.next = current.next;
		current.next = newNode;
		while(current.next != head){
				current = current.next;
			}
			current.next = head;
	}
	void addAfter(int target, int data){
		if(head == null){
			System.out.print("No data in list for addAfter, try addFront or addBack");
			return;
		}
		Node newNode = new Node(data);
		Node current = head;
		do{
			if(current.data == target){
				newNode.next = current.next;
				current.next = newNode;
				return;
			}
			current = current.next;
		}while(current != head);
	}
	void delete(int target){
		if(head == null){
			System.out.print("Nothing to delete");
			return;
		}
		Node current = head;
		if(target == head.data){

			if(head.next == head){
				head = null;
				return;
			}
			while(current.next != head){
				current = current.next;
			}
			head = head.next;
			current.next = head;
			return;
		}
		
		while(current.next.data != target && current.next != head){
			current = current.next;
		}
		current.next = current.next.next;
	}
	void search(int target){
		int count = 0;
		if(head == null){
			return;
		}
		Node current = head;
		do{
			count++;
			if(current.data == target){
				System.out.print("Data found at node: " + count);
				return;
			}
			current = current.next;
		}while(current != head);
	}
	void update(int target, int newData){
		if(head == null){
			return;
		}
		Node current = head;
		do{
			if(current.data == target){
				current.data = newData;
			}
		current = current.next;	
		}while(current != head);
	}
	void display(){
		if(head == null){
			return;
		}
		System.out.print("\nThe head is: " + head.data + "\n\n");
		Node current = head;
		do{
			System.out.print(current.data + " ");
			current = current.next;
		}while(current != head);
	}
}
class Main{
	public static void main(String[] args){
		CircularLinkedList list = new CircularLinkedList();
		list.addFront(1);
		list.addFront(2);
		list.addFront(3);
		// list.addBack(2);
		// list.addBack(3);
		// list.addBack(4);
		// list.addBefore(1,100);
		list.addAfter(40,500);
		// list.delete(1);
		// list.search(4);
		// list.update(3,500);
		list.display();
	}
}