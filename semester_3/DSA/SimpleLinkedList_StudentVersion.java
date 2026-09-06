class Student{
	int id;
	String name;
	String dept;
	int semester;
	double cgpa;
	Student(int id, String name, String dept, int semester, double cgpa){
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.semester = semester;
		this.cgpa = cgpa;
	}
}
class Node{
	Student data;
	Node next;
	Node(Student data){
		this.data = data;
		this.next = null;
	}
}
class SimpleLinkedList{
	Node head;
	Node tail;
	SimpleLinkedList(){
		this.head = null;
		this.tail = null;
	}
	void addFront(Student data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	void addBack(Student data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;	
	}
	void deleteFront(){
		if(head == null){
			System.out.print("List is empty, Nothing to delete");
			return;
		}
		head = head.next;
	}
	void deleteBack(){
		if(head == null){
			System.out.print("List is empty, Nothing to delete");
			return;
		}
		if(head.next == null){ //if the list have only one node this will handle it
			head = null;
			tail = null;
			return;
		}
		Node current = head;
		while(current.next.next != null){
			current = current.next;
		}
		current.next = null;
		tail = current;
	}
	void deleteById(int targetId){
		if(head == null){
			System.out.print("List is empty, Nothing to delete");
			return;
		}
		if(head.data.id == targetId){
			head = head.next;
			return;
		}
		Node current = head;
		while(current.next.data.id != targetId){
			current = current.next;
			if(current.next == null){ //if the targeted node is not in the list
				return;
			}
		}
		if(current.next.data.id == tail.data.id){
			tail = current;
		}
		current.next = current.next.next;
	}
	void addBefore(int targetId,Student data){
		if(targetId == head.data.id){
			addFront(data);
			return;
		}
		Node current = head;
		while(current.next.data.id != targetId){
			current = current.next;
			if(current.next == null){ //if the targeted node is not in the list
				return;
			}
		}
		Node newNode = new Node(data);
		newNode.next = current.next;
		current.next = newNode;
	}
	void addAfter(int targetId, Student data){
		Node newNode = new Node(data);
		Node current = head;
		while(current.data.id != targetId){
			current = current.next;
			if(current == null){
				return;
			}
		}
		if(current == tail){
			newNode.next = current.next;
			current.next = newNode;
			tail = newNode;
			return;
		}
		newNode.next = current.next;
		current.next = newNode;
	}
	void deleteBefore(int targetId){
		if(head == null){
			System.out.print("The list is empty, nothing to delete");
			return;
		}
		if(head.next.data.id == targetId){
			head = head.next;
			return;
		}
		Node current = head;
		while(current.next.next.data.id != targetId){
			current = current.next;
			if(current.next.next == null){
				return;
			}
		}
		current.next = current.next.next;
	}
	void deleteAfter(int targetId){
		if(head == null){
			System.out.print("The list is empty, Nothing to delete");
			return;
		}
		Node current = head;
		while(current.data.id != targetId){
			current = current.next;
			if(current.next == null){
				return;
			}
		}
		if(current.next == tail){
			tail = current;
			current.next = null;
			return;
		}
		current.next = current.next.next;
	}
	void searchById(int targetId){
		int count = 1; //This is bcz when data is found the loop doesnt count that node
		Node current = head;
		while(current.data.id != targetId){
			count+=1;
			current = current.next;
			if(current == null){
				return;
			}
		}
		System.out.print("Data found at node: " + count);
	}
	void updateNameById(int targetId, String newName){
		Node current = head;
		while(current.data.id != targetId){
			current = current.next;
			if(current == null){
				return;
			}
		}
		current.data.name = newName;
	}
	void display(){
		if(head == null){
			System.out.print("\nList is empty, Nothing to display\n");
			return;
		}
		System.out.print("\nThe head is: "+ head.data.id);
		System.out.print("\nThe tail is: "+ tail.data.id + "\n\n");
		Node current = head;
		while(current!=null){
			System.out.print("Id: "+current.data.id + "\n");
			System.out.print("Name: "+current.data.name + "\n");
			System.out.print("Department: "+current.data.dept + "\n");
			System.out.print("Semester: "+current.data.semester + "\n");
			System.out.print("CGPA: "+current.data.cgpa + "\n");
			System.out.print("***************\n");

			current = current.next;
		}
		System.out.print("\n\n");
	}
}
class Main{
	public static void main(String[] args){
		SimpleLinkedList list = new SimpleLinkedList();
		Student std1 = new Student(1, "kamran", "cs", 3, 3.66);
		Student std2 = new Student(2, "ali", "se", 4, 3.45);
		Student std3 = new Student(3, "ahmed", "it", 2, 3.21);
		Student std4 = new Student(4, "usman", "cs", 3, 3.78);
		Student std5 = new Student(5, "hamza", "ai", 4, 3.91);
		Student std6 = new Student(6, "hassan", "se", 2, 3.52);
		Student std7 = new Student(7, "bilal", "cs", 4, 3.35);
		Student std8 = new Student(8, "saad", "it", 3, 3.88);
		Student std9 = new Student(9, "zain", "ai", 2, 3.60);
		Student std10 = new Student(10, "faizan", "cs", 4, 3.72);


		list.addFront(std1);
		list.addBack(std2);
		// list.deleteBack();
		// list.deleteFront();
		list.addAfter(2,std3);
		// list.addBefore(1,std3);
		// list.deleteAfter(2);
		// list.deleteBefore(2);
		// list.deleteById(3);
		// list.searchById(2);
		// list.updateNameById(1,"Imran");
		list.display();
	}
}