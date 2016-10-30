package lec;

public class ReverseLLClient {

	public static void main(String[] args) throws Exception{
		ReverseLinkedList list = new ReverseLinkedList();
		list.addFirst(1);
		list.addFirst(23);
		list.addFirst(3);
		list.addFirst(42);
		list.addFirst(2);
		list.display();
		list.reverse_DI();
		System.out.println("Reverse list is:");
		list.display();
		

	}

}
