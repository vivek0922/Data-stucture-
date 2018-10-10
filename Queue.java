package Ds_Queue;

public class Queue {
	private int maxsize; // initializes the set number of slots 
	private long[]QueArray; // slots to main the data
	private int front; // this is the index position of element in the front 
	private int rear; // this is the index position of element in back 
	private int nIteams; // counter to maintain the items in our queue
	
	public Queue(int size) {
		this.maxsize = size;
		this.QueArray = new long[size];
		front = 0; // index position of first element in queue
		rear = -1; // index position of last element in queue
		nIteams = 0; // we don't have any element in queue
		
	}  
	public void insert(long j) {
		if(rear == maxsize -1) { // this help to override the out of bounds array error
			rear = -1;
		}
		rear++;
		QueArray[rear]=j;
		nIteams ++;
	}
	public long remove() {  // remove item for the front 
		long temp = QueArray[front];
		front++;
		if(front==maxsize) {
			front=0; // we can set front back to the oth index so what 

		}
		nIteams --;
		return temp;
			
	}
	
	public long peakfront() {
		return QueArray[front];
	}
	
	public boolean isFull() {
		return (nIteams == maxsize);
		
	}
	public boolean isEmpty() {
		return (nIteams ==0);
		
	}
	public void view() {
		System.out.println(" [ ");
		for(int i=0;i < QueArray.length; i++) {
			System.out.println(QueArray[i]+ " ");
		}
		System.out.println(" ] ");
	}

}
