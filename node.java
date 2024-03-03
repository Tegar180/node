package Pertemuan4;

public class node {
	
	//node//
	
	int data;
	node next;
	
	public node(int data) {
		this.data = data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNext(node next) {
		this.next = next;
	}
	
	public int getdata() {
		return this.data;
	}
	
	public node getNext() {
		return this.next;
	}
}
