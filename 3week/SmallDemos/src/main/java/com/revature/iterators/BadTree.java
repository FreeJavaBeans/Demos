package com.revature.iterators;

import java.util.Iterator;
import java.util.List;

public class BadTree<T> implements Iterable<T>{
	
	private Node root;
	

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new BadTreeIterator();
	}
	
	//make a private internal class for your iterator implementation 
	private class BadTreeIterator implements Iterator<T> {
		
		private Node currentNode = root;//start at the root

		@Override
		public boolean hasNext() {
			if(currentNode.getChildren().size() > 0) {
				//some logic to return true
				return true;
			}else {
				//some logic to go back up the tree
				//maybe return false
				return false;
			}
			
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	private class Node<T> {
		
		private T value;
		
		private T parent;
		
		private List<T> children;
		
		public T getValue() {
			return value;
		}
		
		public List<T> getChildren(){
			return children;
		}
		
	}
	

}
