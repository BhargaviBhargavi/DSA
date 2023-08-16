class Queue{
	static Node first;
	static Node last;
	
	public static void queue(int data)
	{
		Node temp =new Node();
		temp.data=data;
		// if queue is empty
		if(first==null)
		{
			//if queue is empty temp will be top
			first=temp;
			last=temp;
			return;
		}
		
		last.next=temp;
		last=temp;
	}
	
	static void display()
	{
		Node temp=first;
		//temp is not equal to null
		while(temp!=null)
		{
			//It prits the data
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String[] args)
	{
		Queue.queue(10);
		Queue.queue(20);
		Queue.queue(30);
		Queue.queue(40);
		Queue.queue(50);
		Queue.dequeue();
		Queue.dequeue();
		Queue.display();
	}
	public static void dequeue()
	{
		if(first==null)
		{
			return;
		}
		
		Node temp = first;
		first = first.next;
		temp.next = null;
		temp = null;		
	}
}
class Node{
	int data;
	Node next;
}
