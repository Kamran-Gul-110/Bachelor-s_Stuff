class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
class SimpleLinkedList{
	Node head;
	SimpleLinkedList(){
		this.head = null;
	}
	//As this is LL so the complexity to add at front is always O(1)
	void addFront(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	// The simple LL has the complexity of O(n) to add in back without tail
	void addBack(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
	}
	//As this is LL so the complexity to delete from front is always O(1)
	void deleteFront(){
		if(head == null){
			System.out.print("List is empty, Nothing to delete");
			return;
		}
		head = head.next;
	}
	// In simple LL the delete at back will have complexity of O(n)
	void deleteBack(){
		if(head == null){
			System.out.print("List is empty, Nothing to delete");
			return;
		}
		if(head.next == null){ //if the list have only one node this will handle it
			head = null;
			return;
		}
		Node current = head;
		while(current.next.next != null){
			current = current.next;
		}
		current.next = null;
	}
	// The delete has complexity of O(n)
	void delete(int target){
		if(head == null){
			System.out.print("List is empty, Nothing to delete");
			return;
		}
		if(head.data == target){
			head = head.next;
			return;
		}
		Node current = head;
		while(current.next.data != target){
			current = current.next;
			if(current.next == null){ //if the targeted node is not in the list
				return;
			}
		}
		current.next = current.next.next;
	}
	void addBefore(int target,int data){
		if(target == head.data){
			addFront(data);
			return;
		}
		Node current = head;
		while(current.next.data != target){
			current = current.next;
			if(current.next == null){ //if the targeted node is not in the list
				return;
			}
		}
		Node newNode = new Node(data);
		newNode.next = current.next;
		current.next = newNode;
	}
	void addAfter(int target, int data){
		Node newNode = new Node(data);
		Node current = head;
		while(current.data != target){
			current = current.next;
			if(current == null){
				return;
			}
		}
		newNode.next = current.next;
		current.next = newNode;
	}
	void deleteBefore(int target){
		if(head == null){
			System.out.print("The list is empty, nothing to delete");
			return;
		}
		if(head.next.data == target){
			head = head.next;
			return;
		}
		Node current = head;
		while(current.next.next.data != target){
			current = current.next;
			if(current.next.next == null){
				return;
			}
		}
		current.next = current.next.next;
	}
	void deleteAfter(int target){
		if(head == null){
			System.out.print("The list is empty, Nothing to delete");
			return;
		}
		Node current = head;
		while(current.data != target){
			current = current.next;
			if(current.next == null){
				return;
			}
		}
		current.next = current.next.next;
	}
	void search(int target){
		int count = 1; //This is bcz when data is found the loop doesnt count that node
		Node current = head;
		while(current.data != target){
			count+=1;
			current = current.next;
			if(current == null){
				return;
			}
		}
		System.out.print("Data found at node: " + count);
	}
	void update(int target, int newData){
		Node current = head;
		while(current.data != target){
			current = current.next;
			if(current == null){
				return;
			}
		}
		current.data = newData;
	}
	void display(){
		if(head == null){
			System.out.print("\nList is empty, Nothing to display\n");
			return;
		}
		System.out.print("\nThe head is: "+ head.data + "\n\n");
		Node current = head;
		do{
			System.out.print(current.data + " ");
			current = current.next;
		}while(current!=null);
		System.out.print("\n\n");
	}
}
class Main{
	public static void main(String[] args){
		SimpleLinkedList list = new SimpleLinkedList();
		list.addFront(5);
		list.addFront(4);
		list.addFront(3);
		list.addFront(2);
		list.addFront(1);
		// list.addBack(10);
		// list.addBack(20);
		// list.deleteFront();
		// list.deleteBack();
		// list.delete(300);
		// list.addBefore(6,100);
		// list.addAfter(3,100);
		// list.deleteBefore(1);
		// list.deleteAfter(4);
		// list.search(5);
		// list.update(5,100);
		list.display();
	}
}