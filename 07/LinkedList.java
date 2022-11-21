import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
	
	private Node<T> head;
	private int size;

	public LinkedList() {
		head = null;
	}

	public int size() {
		return size;
	}

	public Iterator<T> iterator() {
		return new LinkedListIterator<T>(head);
	}

	public void add(T element) {
		if(head == null) {
			head = new Node<T>(element);
		} else {
			Node<T> current = head;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(new Node<T>(element));
		}
		size++;
	}

	public T get(int index) {
		if(index <0 || index >= size())
		{
			System.out.println("Index out of bound");
			return null;
		}	
		int counter = 0;
		Node<T> current = head;
		T e = null;
		while(current != null && counter < index) {
			current = current.getNext();
			counter++;
		}
		if(current != null) {
			e = current.get();
		}
		return e;
	}

	public void set(int index, T element) {
		int counter = 0;
		Node<T> current = head;
		T e = null;
		while(current != null && counter < index) {
			current = current.getNext();
			counter++;
		}
		current.set(element);
	}

	public void remove(int index) {
		T e = null;
		int counter = 1;
		Node<T> current = head;
		if(index == 0) {
			e = head.get();
			head = head.getNext();
		} else {
			while(current.getNext() != null && counter < index) {
				current = current.getNext();
				counter++;
			}
			if(current.getNext() != null) {
				current.setNext(current.getNext().getNext());
			}
		}
		size--;
	}
}

class LinkedListIterator<E> implements Iterator<E> {
	
	private Node<E> current;

	public LinkedListIterator(Node<E> current) {
		this.current = current;
	}

	public E next() {
		E e = current.get();
		current = current.getNext();
		return e;
	}

	public boolean hasNext() {
		return current != null;
	}
	
}



class Node<E> {
	private E element;
	private Node<E> next;

	public Node(E element) {
		this.element = element;
	}

	public E get() {
		return element;
	}

	public void set(E element) {
		this.element = element;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> n) {
		next = n;
	}
}
