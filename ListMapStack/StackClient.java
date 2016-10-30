package data_structure;

public class Client {

	public static void main(String[] args) throws Exception{
		int n = 5;
		StackUsingArray stack = new StackUsingArray(n); 
		for(int i = 0 ; i<n ; i++){ 
			stack.push(n-i); 
			System.out.println();
			stack.display();
		}
		System.out.println(); 
		System.out.println("stack is empty: "+stack.isEmpty()); 
		System.out.println("stack size is: "+stack.size()); 
		System.out.println("top is: "+stack.top());
		System.out.println("*************"); 

	for(int i = 0;i<n;i++)
	{
		stack.pop();
		System.out.println();
		stack.display();

	}

}
}
