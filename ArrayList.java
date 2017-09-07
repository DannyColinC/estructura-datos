package Examen01;
import java.util.NoSuchElementException;
import.java.util. Arrays;


public class ArrayList<E> implements List<E> {
	private Object[] top;
	private int size; 
	private int initialCapacity; 
	private int extraCapacity; 
	private int shiftContentsRight
	
	public ArrayList() {
		top=new Object[10]; 
		size=5; 
	}
	
	public ArrayList(int initialCapacity) {
		if (initialCapacity < 0)
			throw new IllegalArgumentException("Initial capacity less than 0");
		top = new Object[initialCapacity];
	}
	
	private void reserveExtraCapacity(int extraCapacity) {
		
		
	}
	
	private void shiftContentsRiht(int index) {
		
	}
	
	 
	 private void ensureCapacity() {
	        if (size()>=top.length) {  
	        	  
	      
	        }
	        
	}
	
	@Override
	public void addFirst(E e) {
		// TODO Auto-generated method stub
		Object<E> newNode = new Object<E>(e); 
		newNode.next= top.length; 
		top.length =newNode.next;
		size++; 	
	}
	

	@Override
	public void addLast(E e) {
		// TODO Auto-generated method stub
		Object<E> newNode= new Object<E>(e); 
     	Object<E> current=top;
		while(current.next  !=null); 
     	   current = current.next;
     	   
     	current.next = newNode; 
     	size++; 	
		
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		if(index < 0 ||index > size()){
			throw new IndexOutOfBoundsException(); 
		}
		Object<E> current = top; 
		Object<E> newNode = new Object<E> (element); 
		
		for(int i=0; i<index;i++)
			current = current.next;
			top.length = newNode; 
			size++; 
			
			current = current.next;
			current.next=newNode; 
			size++;
		
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		 if(top.next==null) {
				throw new NoSuchElementException(); 				
			}
		  Object<E> current=top.next;
		  while(current.next !=null)
			  current=current.next; 
		  return current.value; 	
		return null;
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		if(top.next == null) {
			throw new NoSuchElementException();
		}
		
		Object<E> current = top;
		while(current.next.next != null)
			current = current.next;
		
		Object<E> nodeToRemove = current.next;
		current.next = null;
		size--;
        return nodeToRemove.value;
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
		Object<E> current = top;
		for(int i = 0; i < index; i++)
			current = current.next;
		
		Object<E> nodeToRemove = current.next;
		current.next = nodeToRemove.next;
		nodeToRemove.next = null;
		size--;
		
        return nodeToRemove.value;
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getFirst() {
		if(top.next == null) {
			throw new NoSuchElementException();
		}
		
		return top.next.value;
	}
	
	@Override
	public E getLast() {
		if(top.next == null) {
			throw new NoSuchElementException();
		}
		
		Object<E> current = top.next;
		while(current.next != null)
			current = current.next;
		
		return current.value;
	}

	@Override
	public E get(int index) {
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
		Object<E> current = top.next;
		for(int i = 0; i < index; i++)
			current = current.next;
		
		return current.value;
	}

	@Override
	public E set(int index, E element) {
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
		Object<E> current = top.next;
		for(int i = 0; i < index; i++)
			current = current.next;
		
		E previousValue = current.value;
		current.value = element;
		
		return previousValue;
}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		top.next = null;
		size = 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size() == 0;
	}
	public String toString() {
		if(top.next == null)
			return "[]";
		
		Object<E> current = top.next;
		String returnValue = "[" + current.value;
		while(current.next != null) {
			current = current.next;
			returnValue += ", " + current.value;
		}
		
		returnValue += "]";
        return returnValue;
	}


}
