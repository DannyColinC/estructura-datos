
import java.util.NoSuchElementException;


public class LinkedList<E> implements List<E> {
	private Node<E> header;
	private int size; 
	
	public LinkedList() {
		header=new Node<E>(); 
		size=0;
		
	}
	/**
	* @param index the index of the node to get. 
	 * @return the node at the specified position
	 * @throws  IndexOutOfBoundsException if the index is (index< 0 || index >=size())  
	 */
	private Node<E> node(int index){
		if( index < 0||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index <(size>>1)) {
		
			Node<E> x= header.next; 
			for(int i=0;i<index; i++); 
			x=x.next; 
			return x; 
		}else {
		
			Node<E> x=header.prev; 
			for(int i=size -1; i> index;i--)
				x=x.prev; 
			 return x; 
		}
		
	}
	public void addFirst(E e) {
		Node<E> newElement = new Node<E>(e); 
		Node<E> firstElement = new Node<E>(e); 
		newElement.next= firstElement; 
		firstElement.prev =newElement;
		
		newElement.prev=header; 
		header.next = newElement; 
		size++; 	
		
	}

	public void addLast(E e){
		Node<E> newElement=new Node<E>(e); 
		Node<E> lastElement = new Node<E>(e); 
  	    newElement.next=lastElement; 
  	    lastElement.prev=newElement; 
  	    
  	    newElement.prev=header; 
  	    header.next=newElement; 
  	    size++; 
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		if( index < 0||index> size()) {
			throw new IndexOutOfBoundsException(); 
			
		}
		if(index==size()) {
			addLast(element); 
	}else {
		Node<E> newNode = new Node<E>(element); 
		Node<E> current = node(index); 
		Node<E> previousNode=current.prev; 
		
		newNode.prev=previousNode; 
		previousNode.next=newNode;
		
		newNode.next= current; 
		current.prev=newNode; 
	
	     size++;
	}
	   }	
	@Override
	public E removeFirst()  {
		if(header.next==null) {
			throw new NoSuchElementException(); 
		}
		Node<E> nodeToRemove=header.next; 
		header.next = nodeToRemove.next; 
		nodeToRemove.next = null; 
		size--; 
		return nodeToRemove.value; 
	
	}
	public E removeLast() {
		if(header.next==null) {
			throw new NoSuchElementException(); 				
		}
	  Node<E> current=header.next;
	  while(current.next !=header)
		  current=current.next; 
	  return current.value; 		

	
}
	public E remove(int index) {
		if (index < 0 || index >=size()) {
			throw new NoSuchElementException();
		}
		Node<E> current = header;
				for(int i = 0; i < index; i++)
					current = current.next;
				
				Node<E> nodeToRemove = current.next;
				current.next = nodeToRemove.next;
				nodeToRemove.next = null;
				size--;
				
				return nodeToRemove.value;
	}
	@Override
	public boolean remove(Object o) {
		int index = indexOf(o);
				
				if(index >= 0 && index < size()) {
				remove(index);
					return true;
				}
				
				return false;
			}
		
	@Override
	public E getFirst() {
		if(header.next==null) {
			throw new NoSuchElementException(); 
		}
		return header.next.value;
	}
	
	@Override
 public E getLast() {
		 if(header.next==null) {
				throw new NoSuchElementException(); 				
			}
		  Node<E> current=header.next;
		  while(current.next !=null)
			  current=current.next; 
		  return current.value; 
	}

	@Override
	public E get(int index) {
		if(index < 0 || index >= size()) {
						throw new IndexOutOfBoundsException();
					}
					
					Node<E> current = header.next;
					for(int i = 0; i < index; i++)
						current = current.next;
					
					return current.value;
		
	}
	
	@Override
	public E set(int index, E element) {
		if(index < 0 || index >= size()) {
						throw new IndexOutOfBoundsException();
		}
					
				Node<E> current = header.next;
					for(int i = 0; i < index; i++)
						current = current.next;
					
					E previousValue = current.value;
					current.value = element;
					
					return previousValue;
		
	}

	@Override
	public boolean contains(E e) {
		Node<E> current = header.next;
				while(current != null) {
					if(current.value == e)
						return true;
					current = current.next;
				}
				
				return false;
	}
	@Override
 	public int indexOf(Object o) {
 		return -1;
 	}

	@Override
	public void clear() {
		header.next = null;
 		size = 0;
		
	}
	
	@Override
	public int size() {	
		return size; 
	}


	@Override
	public boolean isEmpty() {
		return size()==0;
	}
	@Override
	public Object[] toArray() {
	
	Object[] returnArray = new Object[size];
     int i = 0;
     for(Node<E> x = header.next; x != null; x = x.next)
	 returnArray[i++] = x.value;
     return returnArray;
	 }
	@Override
 	public String toString() {
		if(header.next==null)
			return"[]"; 
		
		Node<E> current = header.next; 
		String returnValue = "[" + current.value; 
		while(current.next !=null) {
			current= current.next; 
			returnValue += "," +current.value; 
		}
		return returnValue += "]"; 
		
}
}
	
 


	
	
		
	

	


