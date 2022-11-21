public class Container<T> {

	private T element;

	public Container(T element) {
		this.element = element;
	}

	public boolean isNull() {
		return element == null;
	}

	public T set(T element) {
		T e = this.element;
		this.element = element;
		return e;
	}

	public T get() {
		return element;
	}

	public static void main(String[] args){

		Container<String> c = new Container<String>("Usyd");

		System.out.println(c.isNull());

		c.set("Java");
		System.out.println(c.get());

		Container<Integer> ci = new Container<Integer>(10);

		System.out.println(ci.isNull());

		ci.set(20);
		System.out.println(ci.get());

	}
}
