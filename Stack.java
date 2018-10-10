package DS_Stack;

public class Stack {
	
	private int MaxSize;
	private long[] StackArray;
	private int top; // this variable is very important to represent last iteam on the stack;
	
	
	public Stack(int size) {
		this.MaxSize =size;
		this.StackArray = new long [MaxSize];
		this.top = -1; // i set top is equal to index is zero; 
		
	}
	public void push(long j) {
		if(isFull()) {
			System.out.println("this stack is already full");
		}else {
		
		top++;
		StackArray[top] = j;	
		}
	}
	public long pop() {
		if (isEmpty()) {
			System.out.println("this stck is already empty");
			return -1;
		}else { 
			
		int old_top =top;
		top--;
		return StackArray[old_top];
		}
		
	}
	public long peak() {
		return StackArray[top];
		
	}
	public boolean isEmpty() {
		return (top == -1);
		
	}
	public boolean isFull() {
		return (MaxSize-1 == top);
		}

}
