package com.vuong.stack_queue_link;

public class DanhSachLienKetDon {
	Node node = new Node();
	Node start = node;
	public Node creatNode(int data) {
		node.data = data;
		return node;
	}
	public void insertHeadNode(Node node) {
		this.start = node;
		node.next = this.node;
	}
	public void insertLast(Node node){
		Node temp = start;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = node;
	}
	public void insertPos(Node node, int pos){
		Node temp = start;
		int max = 0;
		while(temp.next != null){
			temp = temp.next;
			max ++;
		}
		if(0<=pos && pos <=max){
			temp = start;
			int dem = 0;
			while(temp.next != null){
				
				temp = temp.next;
				max ++;
			}
		}
	}
	class Node {
		int data;
		Node next;
	}
}
