package com.demo.beans;
public class QueueList {
	
	//Creating Node
	class Node{
		Employee data;
		Node next;
		
		
		public Node() {
			data = null;
			next = null;
			
		}
		
		public Node(Employee data) {
			this.data = data;
			next = null;
			
		}
	}
	
	private Node head;
	
	public QueueList() {
		head = null;
	}
	
	//Add Employee
	public void addEmployee(Employee o) {
		
		Node newnode = new Node(o);
		
		if(head == null) {
			head = newnode;
			
		}else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newnode;
			
		}
		
	}
	
	//remove employee
	public void removeEmp() {
		if(head== null) {
			return;
		}
		else {
			Node temp = head;
			head = temp.next;
			temp = null;
		}
	}

	// display to String
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(head == null) {
			System.out.println("List is empty");
			return null;
		}
		else {
			Node temp = head;
			while(temp!=null) {
				
				sb.append("Emp id -"+(temp.data).getEmpid()+", Name - "+temp.data.getName()+", Gender - "+temp.data.getGender());
				sb.append("\n");
				temp = temp.next;
			}
			
			
		}
		return sb.toString();
	}
	
	
	//Print all female employee
	public void femaleEmp() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}else {
			Node temp = head;
			while(temp!=null) {
				if(temp.data.getGender().equalsIgnoreCase("f")) {
					System.out.println(temp.data.toString());
				}
				temp = temp.next;
			}
		}
	}
	
	//Print all Male employee Only
	public void maleEmp() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}else {
			Node temp = head;
			while(temp!=null) {
				if(temp.data.getGender().equalsIgnoreCase("m")) {
					System.out.println(temp.data.toString());
				}
				temp = temp.next;
			}
		}
	}

	//reverse List
	public void reverse() {
		Node temp = head;
		int len = 0;
		while(temp!=null) {
			len = len +1;
			temp = temp.next;
		}
		System.out.println();
		while(len>0) {
			
			Node trav = head;
			for(int i = 1;i<len;i++) {
				trav = trav.next;
			}
			System.out.println(trav.data);
			len--;
			
		}
		
		
	}

	

	//recursion
	public void recursion() {
		while(head!=null) {
			recRemoveEmp();
		}
	}
	public void recRemoveEmp() {
		if(head== null) {
			return;
		}
		else {
			System.out.println((head.data));
			head = head.next;
		}
	}
}
