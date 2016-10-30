package data_structure ;

public class StackUsingArray {
	
	protected int[] data;
	
	protected int tos;
	
	public static final int DEFAULT_CAPACITY=10;
	
	public StackUsingArray(int capacity){

		this.data = new int[capacity];
		this.tos=-1;
	}
	
	public StackUsingArray(){


		
		this(DEFAULT_CAPACITY);
	}
	
	public int size(){



		return this.tos+1;
	}

	public boolean isEmpty(){



		if(this.size()==0){
			return true;
		}
		else{
			return false;
		}
	}

	public void push(int item) throws Exception{




		if(this.tos>=this.data.length){
			throw new Exception("Stack Overflow");
		}
		this.tos++;
		this.data[tos]=item;
		
	}
	
	public int top() throws Exception{

		if(this.isEmpty()==true){
			throw new Exception("Stack is empty.");
			}
		return this.data[tos];
	}

	public int pop() throws Exception{


		if(this.isEmpty()==true){
			throw new Exception("Stack is empty.");
		}
		int t = this.data[tos];
		this.data[tos]=0;
		tos--;
		return t;
	}
	
	public void display(){



		
		for(int i=this.tos;i>=0;i--){
			System.out.println(this.data[i]+"");
		}
		
	}
	
		
}
