package com.phb.exc20180116;



public class Node<Item> 
{
		private Item item;
		public Item getItem() {
			return item;
		}
		public void setItem(Item item) {
			this.item = item;
		}
		public Node<Item> getNext() {
			return next;
		}
		public void setNext(Node<Item> next) {
			this.next = next;
		}
		private Node<Item> next;
	
}
