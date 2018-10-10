package DS_Stack;

public class charStackHw {
	private int Maxsize;
	private char[] StcArray;
	private int top;
	
	public charStackHw (int size) {
		this.Maxsize =size;
		this.StcArray= new char[Maxsize];
		this.top = -1;
		
	}
	public static String reverstring (String str) {
		return str;
	}
	public void push(char j) {
		if(isFull()) {
			System.out.println("this stack is already full");
		}else {
		
		top++;
		StcArray[top] = j;	
		}
	}
	public char pop() {
		if (isEmpty()) {
			System.out.println("this stack is already empty");
			return '0';
			
		}else { 
			
		int old_top =top;
		top--;
		return StcArray[old_top];
		}
         
	}
	public char peak() {
		return StcArray[top];
		
	}
	public boolean isEmpty() {
		return (top == -1);
		
	}
	public boolean isFull() {
		return (Maxsize-1 == top);
		
		}

}


