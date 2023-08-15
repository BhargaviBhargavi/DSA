class Stack{
	static Node top;
	static void push(int data)
	
	{
	
		Node temp=new Node();
		temp.data=data;
		
			if(top==null)
			{
				//Stack is empty temp will be top
				top=temp;
				return;
			}
			temp.next=top;
			top=temp;
			

	}	
	static void display()
	{
		Node temp=top;
		//temp is not equal to null
		while(temp!=null)
		{
			//It prits the data
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String [] args)
	{
		for(int i=1;i<=10;i++)
		{
			Stack.push(i);
		}
		
		for(int i=1;i<=100;i++)
		{
			Stack.pop();
		}
		
		Stack.pop();
		Stack.pop();
		Stack.display();
	}
	static void pop()
	{
		if(top==null)
		{
			// Stack is empty, nothing to pop
			return;
		}
		  Node temp = top;
		  // Update 'top' to the next node
					
    		  top=top.next;
    		  // Disconnect 'temp' from the top

    		  temp.next=null;
    		  // Clear the 'temp' reference
    		  temp=null;
        	
	}
	
}

class Node{
	int data;
	Node next;
}